package MG2D.geometrie;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Cette classe permet la création de Triangle.<br />
 * Un Triangle est définie par trois Points et un booléen.
 * @author Equipe 2D
 * @version 1.0
 */
public class Triangle extends Dessin {
	
// Attributs //
	
	private Point a, b, c;
	
	private boolean plein = false;	// Détermine si le Triangle est plein ou non //
	
// Constructeur //

	// Sans couleur //
	
	/**
	 * Construit un Triangle à partir de trois Points.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point
	 * @param b Point
	 * @param c Point
	 */
	public Triangle ( Point a, Point b, Point c ) {
		
		super ( Color.black );
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * Construit un Triangle plein à partir de trois Points.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point
	 * @param b Point
	 * @param c Point
	 * @param plein Booléen
	 */
	public Triangle ( Point a, Point b, Point c, boolean plein ) {
		
		super ( Color.black );
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.plein = plein;
	}
	
	// Avec couleur //
	
	/**
	 * Construit un Triangle à partir de trois Points.
	 * @param couleur Couleur de l'objet
	 * @param a Point
	 * @param b Point
	 * @param c Point
	 */
	public Triangle ( Color couleur, Point a, Point b, Point c ) {
		
		super ( couleur );
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * Construit un Triangle plein à partir de trois Points.
	 * @param couleur Couleur de l'objet
	 * @param a Point
	 * @param b Point
	 * @param c Point
	 * @param plein Booléen
	 */
	public Triangle ( Color couleur, Point a, Point b, Point c, boolean plein ) {
		
		super ( couleur );
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.plein = plein;
	}
	
// Accesseurs //

	// Getter //
	
	/**
	 * Retourne le Point a.
	 * @return a Point
	 */
	public Point getA () {
		
		return a;
	}
	
	/**
	 * Retourne le Point b.
	 * @return b Point
	 */
	public Point getB () {
		
		return b;
	}
	
	/**
	 * Retourne le Point c.
	 * @return c Point
	 */
	public Point getC () {
		
		return c;
	}
	
	/**
	 * Retourne le booléen plein.
	 * @return plein Booléen
	 */
	public boolean getPlein () {
		
		return plein;
	}
	
	/**
	 * Implémentation de la méthode getBoiteEnglobante() de la classe abstraite Dessin.<br />
	 * Elle retourne une BoiteEnglobante entourant le Triangle.
	 * @return BoiteEnglobante BoiteEnglobante entourant le Triangle.
	 */
	public BoiteEnglobante getBoiteEnglobante () {
		
		int x[] = { a.getX(), b.getX(), c.getX() };
		int y[] = { a.getY(), b.getY(), c.getY() };
		
		int minX = x[0], minY = y[0];
		int maxX = x[0], maxY = y[0];
		
		for ( int i = 1; i < x.length; i++ ) {
			
			if ( x[i] < minX )
				minX = x[i];
			
			if ( x[i] > maxX )
				maxX = x[i];
			
			if ( y[i] < minY )
				minY = y[i];
			
			if ( y[i] > maxY )
				maxY = y[i];
		}		

		return new BoiteEnglobante ( new Point ( minX, minY ), new Point ( maxX, maxY ) );
	}
	
	// Setter //
	
	/**
	 * Permet d'attribuer un Point au Point a.
	 * @param a Point
	 */
	public void setA ( Point a ) {
		
		this.a = a;
	}
	
	/**
	 * Permet d'attribuer un Point au Point b.
	 * @param b Point
	 */
	public void setB ( Point b ) {
		
		this.b = b;
	}
	
	/**
	 * Permet d'attribuer un Point au Point c.
	 * @param c Point
	 */
	public void setC ( Point c ) {
		
		this.c = c;
	}
	
	/**
	 * Permet de rendre le Triangle plein ou non.
	 * @param plein Booléen
	 */
	public void setPlein ( boolean plein ) {
		
		this.plein = plein;
	}
	
// Méthodes //
	
	/**
	 * Implémentation de la méthode afficher() de la classe abstraite Dessin.<br />
	 * Elle permet d'afficher un Triangle sur le Panneau.
	 * <br /><br />
	 * Un Triangle étant un polygon, et la méthode drawPolygon n'acceptant que des tableaux d'entiers, nous avons créés deux tableaux x[] et y[] pour pouvoir afficher le Triangle.
	 * @param g Graphics.
	 */
	public void afficher ( Graphics g ) {
		
		int x[] = { a.getX(), b.getX(), c.getX() };
		int y[] = { (int)g.getClipBounds().getHeight()-a.getY(), (int)g.getClipBounds().getHeight()-b.getY(), (int)g.getClipBounds().getHeight()-c.getY() };
		
		g.setColor ( getCouleur() );
		
		if ( plein )
			g.fillPolygon ( x, y, 3 );
			
		else
			g.drawPolygon ( x, y, 3 );
	}
	
	// Intersections //
	
		// Triangle - Point //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Triangle - Ligne //
	
	/**
	 * Méthode d'intersection précise entre un Triangle et une Ligne.<br />
	 * Retourne vrai s'il y a collision.
	 * @param l Ligne.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Ligne l ) {
		
		boolean collision = false;
		
		Ligne AB = new Ligne ( a, b );
		Ligne BC = new Ligne ( b, c );
		Ligne CA = new Ligne ( c, a );
		
		if ( l.intersection ( AB ) || l.intersection ( BC ) || l.intersection ( CA ) )
			collision = true;
		
		return collision;		
	}
	
		// Triangle - Rectangle //
	
	/**
	 * Méthode d'intersection précise entre un Triangle et un Rectangle.<br />
	 * Retourne vrai s'il y a collision.
	 * @param r Rectangle.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Rectangle r ) {
		
		boolean collision = false;
		
		Point AxBy = new Point ( r.getA().getX(), r.getB().getY() );
		Point BxAy = new Point ( r.getB().getX(), r.getA().getY() );

		Ligne a_AxBy = new Ligne ( r.getA(), AxBy );
		Ligne AxBy_b = new Ligne ( AxBy, r.getB() );
		Ligne b_BxAy = new Ligne ( r.getB(), BxAy );
		Ligne BxAy_a = new Ligne ( BxAy, r.getA() );
		
		Ligne tAB = new Ligne ( a, b );
		Ligne tBC = new Ligne ( b, c );
		Ligne tCA = new Ligne ( c, a );
		
		if ( ( a_AxBy.intersection ( tAB ) || a_AxBy.intersection ( tBC ) || a_AxBy.intersection ( tCA ) ) ||
			( AxBy_b.intersection ( tAB ) || AxBy_b.intersection ( tBC ) || AxBy_b.intersection ( tCA ) ) ||
			( b_BxAy.intersection ( tAB ) || b_BxAy.intersection ( tBC ) || b_BxAy.intersection ( tCA ) ) ||
			( BxAy_a.intersection ( tAB ) || BxAy_a.intersection ( tBC ) || BxAy_a.intersection ( tCA ) ) ||
			( ( a.getX() > r.getA().getX() && a.getY() > r.getA().getY() ) &&
				( a.getX() < r.getB().getX() && a.getY() < r.getB().getY() ) &&
				( b.getX() > r.getA().getX() && b.getY() > r.getA().getY() ) &&
				( b.getX() < r.getB().getX() && b.getY() < r.getB().getY() ) &&
				( c.getX() > r.getA().getX() && c.getY() > r.getA().getY() ) &&
				( c.getX() < r.getB().getX() && c.getY() < r.getB().getY() ) 
			)
		)
			collision = true;
		
		return collision;		
	}
	
		// Triangle - Ovale //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Triangle - Cercle //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Triangle - Triangle //
	
	/**
	 * Méthode d'intersection précise entre un Triangle et un Triangle.<br />
	 * Retourne vrai s'il y a collision.
	 * @param t Triangle.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Triangle t ) {
		
		boolean collision = false;
		
		Ligne AB = new Ligne ( a, b );
		Ligne BC = new Ligne ( b, c );
		Ligne CA = new Ligne ( c, a );
		
		Ligne tAB = new Ligne ( t.getA(), t.getB() );
		Ligne tBC = new Ligne ( t.getB(), t.getC() );
		Ligne tCA = new Ligne ( t.getC(), t.getA() );
		
		if ( AB.intersection ( tAB ) || BC.intersection ( tBC ) || CA.intersection ( tCA ) )
			collision = true;
		
		return collision;		
	}
}
