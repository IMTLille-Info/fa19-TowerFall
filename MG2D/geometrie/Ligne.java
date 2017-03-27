package MG2D.geometrie;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Cette classe permet la création de Ligne.<br />
 * Une Ligne est définie par deux Points.
 * @author Equipe 2D
 * @version 1.0
 */
public class Ligne extends Dessin {
	
// Attributs //
	
	private Point a, b;
	
// Constructeurs //
	
	// Sans couleur //
	
	/**
	 * Construit une Ligne à partir d'une Ligne.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param l Ligne.
	 */
	public Ligne ( Ligne l ) {
		
		super ( Color.black );
		
		a = l.getA();
		b = l.getB();
	}
	
	/**
	 * Construit une Ligne à partir de deux Points.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point a.
	 * @param b Point b.
	 */
	public Ligne ( Point a, Point b ) {
		
		super ( Color.black );
		
        this.a = a;
        this.b = b;
	}
	
	// Avec couleur //
	
	/**
	 * Construit une Ligne à partir d'une Ligne.
	 * @param couleur Couleur de l'objet.
	 * @param l Ligne.
	 */
	public Ligne ( Color couleur, Ligne l ) {
		
		super ( couleur );
		
		a = l.getA();
		b = l.getB();
	}
	
	/**
	 * Construit une Ligne à partir de deux Points.
	 * @param couleur Couleur de l'objet.
	 * @param a Point a.
	 * @param b Point b.
	 */
	public Ligne ( Color couleur, Point a, Point b ) {
		
		super ( couleur );
		
        this.a = a;
        this.b = b;
	}
	
// Accesseurs //
	
	// Getter //
	
	/**
	 * Retourne le Point a de la Ligne.
	 * @return a Point a.
	 */
	public Point getA () {
		
		return a;
	}
	
	/**
	 * Retourne le Point b de la Ligne.
	 * @return b Point b.
	 */
	public Point getB () {
		
		return b;
	}
	
	/**
	 * Implémentation de la méthode getBoiteEnglobante() de la classe abstraite Dessin.<br />
	 * Elle retourne une BoiteEnglobante entourant la Ligne.
	 * @return BoiteEnglobante BoiteEnglobante entourant la Ligne.
	 */
	public BoiteEnglobante getBoiteEnglobante () {
		
		return new BoiteEnglobante ( a, b );
	}
	
	// Setter //
	
	/**
	 * Permet d'attribuer un Point au Point a.
	 * @param a Point.
	 */
	public void setA ( Point a ) {
		
		this.a = a;
	}
	
	/**
	 * Permet d'attribuer un Point au Point b.
	 * @param b Point.
	 */
	public void setB ( Point b ) {
		
		this.b = b;
	}
	
// Méthodes //
	
	/**
	 * Implémentation de la méthode afficher() de la classe abstraite Dessin.<br />
	 * Elle permet d'afficher une Ligne sur le Panneau.
	 * <br /><br />
	 * On récupère d'abord la couleur de l'objet afin de le dessiner dans la bonne couleur. Puis on utilise l'affichage avec drawLine().
	 * @param g Graphics.
	 */
	public void afficher ( Graphics g ) {
		
		g.setColor ( getCouleur() );
		
    g.drawLine ( a.getX(), (int)g.getClipBounds().getHeight()-a.getY(), b.getX(), (int)g.getClipBounds().getHeight()-b.getY() );
	}
	
	// Intersections //
	
		// Ligne - Point //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Ligne - Ligne //
	
	/**
	 * Méthode d'intersection précise entre une Ligne et une Ligne.<br />
	 * Retourne vrai s'il y a collision.
	 * @param l Ligne.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Ligne l ) {
		
		boolean collision = true;
		
		int Ax = a.getX();
		int Ay = a.getY();
		int Bx = b.getX();
		int By = b.getY();
		
		int Cx = l.getA().getX();
		int Cy = l.getA().getY();
		int Dx = l.getB().getX();
		int Dy = l.getB().getY();
		
		double Sx = 0, Sy = 0;
		
		if ( Ax == Bx ) {
		
			if ( Cx == Dx )
				collision = false;
			
			else {
				
				double pCD = ( Cy - Dy ) / ( Cx - Dx );
				
				Sx = Ax;
				Sy = pCD * ( Ax - Cx ) + Cy;
			}
		}
		
		else {
			
			if ( Cx == Dx ) {
				
				double pAB = ( Ay - By ) / ( Ax - Bx );
				
				Sx = Cx;
				Sy = pAB * ( Cx - Ax ) + Ay;
			}
			
			else {
				
				double pCD = ( Cy - Dy ) / ( Cx - Dx );
				double pAB = ( Ay - By ) / ( Ax - Bx );
				
				double oCD = Cy - pCD * Cx;
				double oAB = Ay - pAB * Ax;
				
				Sx = ( oAB - oCD ) / ( pCD - pAB );
				Sy = pCD * Sx + oCD;
			}
		}
		
		if ( ( Sx < Ax && Sx < Bx ) || ( Sy < Ay && Sy < By ) ||
			( Sx > Ax && Sx > Bx ) || ( Sy > Ay && Sy > By ) ||
			( Sx < Cx && Sx < Dx ) || ( Sy < Cy && Sy < Dy ) ||
			( Sx > Cx && Sx > Dx ) || ( Sy > Cy && Sy > Dy )	
		)
			collision = false;
		
		return collision;
	}
	
		// Ligne - Rectangle //
	
	/**
	 * Méthode d'intersection précise entre une Ligne et un Rectangle.<br />
	 * Retourne vrai s'il y a collision.
	 * @param r Rectangle..
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
		
		if ( this.intersection ( a_AxBy ) ||
			this.intersection ( AxBy_b ) ||
			this.intersection ( b_BxAy ) ||
			this.intersection ( BxAy_a ) ||
			( a.getX() > r.getA().getX() &&
				a.getY() > r.getA().getY() &&
				b.getX() < r.getB().getX() &&
				b.getY() < r.getB().getY()
			)
		)
			collision = true;
		
		return collision;
	}
	
		// Ligne - Ovale //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Ligne - Cercle //
	
	/**
	 * Méthode d'intersection précise entre une Ligne et un Cercle.<br />
	 * Retourne vrai s'il y a collision.
	 * @param c Cercle.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Cercle c ) {
		
		boolean collision = false;
		
		int ux = b.getX() - a.getX();
		int uy = b.getY() - a.getY();
		int acx = c.getO().getX() - a.getX();
		int acy = c.getO().getY() - a.getY();
		
		int numerateur = ux * acy - uy * acx;
		
		if ( numerateur < 0 )
			numerateur = -numerateur;
		
		int denominateur = ( int ) Math.sqrt ( ux * ux + uy * uy );
		int ci = numerateur / denominateur;
		
		if ( ci < c.getRayon() )
			collision = true;
		
		return collision;
	}
	
		// Ligne - Triangle //
	
	/**
	 * Méthode d'intersection précise entre une Ligne et un Triangle.<br />
	 * Retourne vrai s'il y a collision.
	 * @param t Triangle.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Triangle t ) {
		
		boolean collision = false;
		
		Ligne AB = new Ligne ( t.getA(), t.getB() );
		Ligne BC = new Ligne ( t.getB(), t.getC() );
		Ligne CA = new Ligne ( t.getC(), t.getA() );
		
		if ( this.intersection ( AB ) ||
			this.intersection ( BC ) ||
			this.intersection ( CA )
		)
			collision = true;
		
		return collision;
	}
}
