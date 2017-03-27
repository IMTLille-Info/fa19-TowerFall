package MG2D.geometrie;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Cette classe permet la création de Rectangle.<br />
 * Un Rectangle est défini par deux Points, deux entiers (arcLargeur et arcHauteur) ainsi que deux booléens (arrondis et plein).
 * @author Equipe 2D
 * @version 1.0
 */
public class Rectangle extends Dessin {
	
// Attributs //
	
	private Point a;	// Point ( x min, y min ) //
	private Point b;	// Point ( x max, y max ) //
	
	private int arcLargeur = 0, arcHauteur = 0;
	
	private boolean arrondis = false;	// Détermine si le Rectangle est arrondis ou non //
	private boolean plein = false;		// Détermine si le Rectangle est plein ou non //
	
// Constructeurs //
	
	// Sans couleur //
	
	/**
	 * Construit un Rectangle à partir d'un Rectangle.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param r Rectangle.
	 */
	public Rectangle ( Rectangle r ) {
		
		super ( Color.black );
		
		a = new Point ( r.getA().getX(), r.getA().getY() );
		b = new Point ( r.getB().getX(), r.getB().getY() );
		
		arcLargeur = r.getArcLargeur();
		arcHauteur = r.getArcHauteur();
		
		arrondis = r.getArrondis();
		plein = r.getPlein();
	}
	
	/**
	 * Construit un Rectangle à partir de deux Points.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param b Point max.
	 */
	public Rectangle ( Point a, Point b ) {
		
		super ( Color.black );
		
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Construit un Rectangle plein à partir de deux Points.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param b Point max.
	 * @param plein Booléen.
	 */
	public Rectangle ( Point a, Point b, boolean plein ) {
		
		super ( Color.black );
		
		this.a = b;
		this.b = b;
		
		this.plein = plein;
	}
	
	/**
	 * Construit un Rectangle dont les bords sont arrondis à partir de deux Points et de deux entiers.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param b Point max.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 */
	public Rectangle ( Point a, Point b, int arcLargeur, int arcHauteur ) {
		
		super ( Color.black );
		
		this.a = b;
		this.b = b;
		
		this.arcLargeur = arcLargeur;
		this.arcHauteur = arcHauteur;
		
        arrondis = true;
   	}
	
	/**
	 * Construit un Rectangle plein dont les bords sont arrondis à partir de deux Points et de deux entiers.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param b Point max.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 * @param plein Booléen.
	 */
	public Rectangle ( Point a, Point b, int arcLargeur, int arcHauteur, boolean plein ) {
		
		super ( Color.black );
		
		this.a = b;
		this.b = b;
		
		this.arcLargeur = arcLargeur;
		this.arcHauteur = arcHauteur;
		
		this.plein = plein;
		
        arrondis = true;
   	}
	
	/**
	 * Construit un Rectangle à partir d'un Point et de deux entiers.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param largeur Largeur du Rectangle.
	 * @param hauteur Hauteur du Rectangle.
	 */
	public Rectangle ( Point a, int largeur, int hauteur ) {
		
		super ( Color.black );
		
        this.a = a;
        b = new Point ( ( a.getX() + largeur ), ( a.getY() + hauteur ) );
   	}
	
	/**
	 * Construit un Rectangle plein à partir d'un Point et de deux entiers.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param largeur Largeur du Rectangle.
	 * @param hauteur Hauteur du Rectangle.
	 * @param plein Booléen.
	 */
	public Rectangle ( Point a, int largeur, int hauteur, boolean plein ) {
		
		super ( Color.black );
		
        this.a = a;
        b = new Point ( ( a.getX() + largeur ), ( a.getY() + hauteur ) );
        
        this.plein = plein;
   	}
	
	/**
	 * Construit un Rectangle dont les bords sont arrondis à partir d'un Point et de quatre entiers.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param largeur Largeur du Rectangle.
	 * @param hauteur Hauteur du Rectangler.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 */
	public Rectangle ( Point a, int largeur, int hauteur, int arcLargeur, int arcHauteur ) {
		
		super ( Color.black );
		
		this.a = a;
		b = new Point ( ( a.getX() + largeur ), ( a.getY() + hauteur ) );
		
		this.arcLargeur = arcLargeur;
		this.arcHauteur = arcHauteur;
		
        arrondis = true;
   	}
	
	/**
	 * Construit un Rectangle plein dont les bords sont arrondis à partir d'un Point et de quatre entiers.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param largeur Largeur du Rectangle.
	 * @param hauteur Hauteur du Rectangle.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 * @param plein Booléen.
	 */
	public Rectangle ( Point a, int largeur, int hauteur, int arcLargeur, int arcHauteur, boolean plein ) {
		
		super ( Color.black );
		
		this.a = a;
		b = new Point ( ( a.getX() + largeur ), ( a.getY() + hauteur ) );
		
		this.arcLargeur = arcLargeur;
		this.arcHauteur = arcHauteur;
		
        arrondis = true;
        
        this.plein = plein;
   	}
	
	// Avec couleur //
	
	/**
	 * Construit un Rectangle à partir d'un Rectangle.
	 * @param couleur Couleur de l'objet.
	 * @param r Rectangle.
	 */
	public Rectangle ( Color couleur, Rectangle r ) {
		
		super ( couleur );
		
		a = new Point ( r.getA().getX(), r.getA().getY() );
		b = new Point ( r.getB().getX(), r.getB().getY() );
		
		arcLargeur = r.getArcLargeur();
		arcHauteur = r.getArcHauteur();
		
		arrondis = r.getArrondis();
		plein = r.getPlein();
	}
	
	/**
	 * Construit un Rectangle à partir de deux Points.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param b Point max.
	 */
	public Rectangle ( Color couleur, Point a, Point b )
	{
		super ( couleur );
		
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Construit un Rectangle plein à partir de deux Points.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param b Point max.
	 * @param plein Booléen.
	 */
	public Rectangle ( Color couleur, Point a, Point b, boolean plein ) {
		
		super ( couleur );
		
		this.a = a;
		this.b = b;
		
		this.plein = plein;
	}
	
	/**
	 * Construit un Rectangle dont les bords sont arrondis à partir de deux Points et de deux entiers.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param b Point max.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 */
	public Rectangle ( Color couleur, Point a, Point b, int arcLargeur, int arcHauteur ) {
		
		super ( couleur );
		
		this.a = b;
		this.b = b;
		
		this.arcLargeur = arcLargeur;
		this.arcHauteur = arcHauteur;
		
        arrondis = true;
   	}
	
	/**
	 * Construit un Rectangle plein dont les bords sont arrondis à partir de deux Points et de deux entiers.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param b Point max.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 * @param plein Booléen.
	 */
	public Rectangle ( Color couleur, Point a, Point b, int arcLargeur, int arcHauteur, boolean plein ) {
		
		super ( couleur );
		
		this.a = b;
		this.b = b;
		
		this.arcLargeur = arcLargeur;
		this.arcHauteur = arcHauteur;
		
		this.plein = plein;
		
        arrondis = true;
   	}
	
	/**
	 * Construit un Rectangle à partir d'un Point et de deux entiers.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param largeur Largeur du Rectangle.
	 * @param hauteur Hauteur du Rectangle.
	 */
	public Rectangle ( Color couleur, Point a, int largeur, int hauteur ) {
		
		super ( couleur );
		
		this.a = a;
		b = new Point ( ( a.getX() + largeur ), ( a.getY() + hauteur ) );
   	}
	
	/**
	 * Construit un Rectangle plein à partir d'un Point et de deux entiers.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param largeur Largeur du Rectangle.
	 * @param hauteur Hauteur du Rectangle.
	 * @param plein Booléen.
	 */
	public Rectangle ( Color couleur, Point a, int largeur, int hauteur, boolean plein ) {
		
		super ( couleur );
		
		this.a = a;
		b = new Point ( ( a.getX() + largeur ), ( a.getY() + hauteur ) );
        
        this.plein = plein;
   	}
	
	/**
	 * Construit un Rectangle dont les bords sont arrondis à partir d'un Point et de quatre entiers.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param largeur Largeur du Rectangle.
	 * @param hauteur Hauteur du Rectangler.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 */
	public Rectangle ( Color couleur, Point a, int largeur, int hauteur, int arcLargeur, int arcHauteur ) {
		
		super ( couleur );
		
		this.a = a;
		b = new Point ( ( a.getX() + largeur ), ( a.getY() + hauteur ) );
		
		this.arcLargeur = arcLargeur;
		this.arcHauteur = arcHauteur;
		
        arrondis = true;
   	}
	
	/**
	 * Construit un Rectangle plein dont les bords sont arrondis à partir d'un Point et de quatre entiers.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param largeur Largeur du Rectangle.
	 * @param hauteur Hauteur du Rectangle.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 * @param plein Booléen.
	 */
	public Rectangle ( Color couleur, Point a, int largeur, int hauteur, int arcLargeur, int arcHauteur, boolean plein ) {
		
		super ( couleur );
		
		this.a = a;
		b = new Point ( ( a.getX() + largeur ), ( a.getY() + hauteur ) );
		
		this.arcLargeur = arcLargeur;
		this.arcHauteur = arcHauteur;
		
        arrondis = true;
        
        this.plein = plein;
   	}
	
// Accesseurs //

	// Getter //
	
	/**
	 * Retourne le Point min du Rectangle.
	 * @return a Point min.
	 */
	public Point getA () {
		
		return a;
	}
	
	/**
	 * Retourne le Point max du Rectangle.
	 * @return b Point max.
	 */
	public Point getB () {
		
		return b;
	}
	
	/**
	 * Retourne la largeur du Rectangle.
	 * @return largeur Largeur du Rectangle.
	 */
	public int getLargeur () {
		
		return ( b.getX() - a.getX() );
	}
	
	/**
	 * Retourne la hauteur du Rectangle.
	 * @return hauteur hauteur du Rectangle.
	 */
	public int getHauteur () {
		
		return ( b.getY() - a.getY() );
	}
	
	/**
	 * Retourne la valeur de l'arrondis en largeur.
	 * @return arcLargeur Arrondis en largeur.
	 */
	public int getArcLargeur () {
		
		return arcLargeur;
	}
	
	/**
	 * Retourne la valeur de l'arrondis en hauteur.
	 * @return arcHauteur Arrondis en hauteur.
	 */
	public int getArcHauteur () {
		
		return arcHauteur;
	}
	
	/**
	 * Retoure le booléen indiquant si le Rectangle est arrondis.
	 * @return arrondis Booléen.
	 */
	public boolean getArrondis () {
		
		return arrondis;
	}
	
	/**
	 * Retourne le booléen indiquant si le Rectangle est plein.
	 * @return plein Booléen.
	 */
	public boolean getPlein () {
		
		return plein;
	}
	
	/**
	 * Implémentation de la méthode getBoiteEnglobante() de la classe abstraite Dessin.<br />
	 * Elle retourne une BoiteEnglobante entourant le Rectangle.
	 * @return BoiteEnglobante BoiteEnglobante entourant le Rectangle.
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
	
	/**
	 * Permet d'attribuer une valeur à arcLargeur.
	 * @param arcLargeur int
	 */
	public void setArcLargeur ( int arcLargeur ) {
		
		this.arcLargeur = arcLargeur;
	}
	
	/**
	 * Permet d'attribuer une valeur à arcHauteur
	 * @param arcHauteur int
	 */
	public void setArcHauteur ( int arcHauteur ) {
		
		this.arcHauteur = arcHauteur;
	}
	
	/**
	 * Permet d'indiquer que le Rectangle est arrondis.
	 * @param arrondis Booléen
	 */
	public void setArrondis ( boolean arrondis ) {
		
		this.arrondis = arrondis;
	}
	
	/**
	 * Permet d'indiquer que le Rectangle est plein.
	 * @param plein Booléen
	 */
	public void setPlein ( boolean plein ) {
		
		this.plein = plein;
	}
	
// Méthodes //
	
	/**
	 * Implémentation de la méthode afficher() de la classe abstraite Dessin.<br />
	 * Elle permet d'afficher un Rectangle sur le Panneau.
	 * <br /><br />
	 * On récupère d'abord la couleur de l'objet afin de le dessiner dans la bonne couleur. Ensuite, on vérifie si l'objet est arrondis et plein, arrondis ou plein pour appeler les méthodes adéquates. Sinon on utilise l'affichage de base avec drawRect().
	 * @param g Graphics.
	 */
	public void afficher ( Graphics g ) {
		
		g.setColor ( getCouleur() );

		if ( arrondis && plein )
		    g.fillRoundRect ( a.getX(), (int)g.getClipBounds().getHeight()-a.getY()-getHauteur(), getLargeur(), getHauteur(), arcLargeur, arcHauteur );
		
		else if ( arrondis )
		    g.drawRoundRect ( a.getX(), (int)g.getClipBounds().getHeight()-a.getY()-getHauteur(), getLargeur(), getHauteur(), arcLargeur, arcHauteur );
		
		else if ( plein )
		    g.fillRect ( a.getX(), (int)g.getClipBounds().getHeight()-a.getY()-getHauteur(), getLargeur(), getHauteur() );
		
		else
		    g.drawRect ( a.getX(), (int)g.getClipBounds().getHeight()-a.getY()-getHauteur(), getLargeur(), getHauteur() );
	}
	
	// Intersections //
	
		// Rectangle - Point : BoiteEnglobante //
	
		// Rectangle - Ligne //
	
	/**
	 * Méthode d'intersection précise entre un Rectangle et une Ligne.<br />
	 * Retourne vrai s'il y a collision.
	 * @param l Ligne.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Ligne l ) {
		
		boolean collision = false;
		
		Point AxBy = new Point ( a.getX(), b.getY() );
		Point BxAy = new Point ( b.getX(), a.getY() );

		Ligne a_AxBy = new Ligne ( a, AxBy );
		Ligne AxBy_b = new Ligne ( AxBy, b );
		Ligne b_BxAy = new Ligne ( b, BxAy );
		Ligne BxAy_a = new Ligne ( BxAy, a );
		
		if ( l.intersection ( a_AxBy ) ||
			l.intersection ( AxBy_b ) ||
			l.intersection ( b_BxAy ) ||
			l.intersection ( BxAy_a ) ||
			( l.getA().getX() > a.getX() &&
				l.getA().getY() > a.getY() &&
				l.getB().getX() < b.getX() &&
				l.getB().getY() < b.getY()
			)
		)
			collision = true;
		
		return collision;		
	}
	
		// Rectangle - Rectangle : Boite Englobante //
	
		// Rectangle - Ovale //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Rectangle - Cercle //

	/**
	 * Méthode d'intersection précise entre un Rectangle et un Cercle.<br />
	 * Retourne vrai s'il y a collision.
	 * @param c Cercle.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Cercle c ) {
		
		boolean collision = false;
		
		int x = c.getO().getX();
		int y = c.getO().getY();

		if ( x < a.getX() )
			x = a.getX();
		
		if ( x > ( a.getX() + getLargeur() ) )
			x = ( a.getX() + getLargeur() );
		
		if ( y <  a.getY() )
			y = a.getY();
		
		if ( y > ( a.getY() + getHauteur() ) )
			y = ( a.getY() + getHauteur() );

		if ( ( c.getO().getX() - x ) * ( c.getO().getX() - x ) + ( c.getO().getY() - y ) * ( c.getO().getY() - y ) < c.getRayon() * c.getRayon() )
			collision = true;
		
		return collision;
	}
	
		// Rectangle - Triangle //
	
	/**
	 * Méthode d'intersection précise entre un Rectangle et un Triangle.<br />
	 * Retourne vrai s'il y a collision.
	 * @param t Triangle.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Triangle t ) {
		
		boolean collision = false;
		
		Point AxBy = new Point ( a.getX(), b.getY() );
		Point BxAy = new Point ( b.getX(), a.getY() );

		Ligne a_AxBy = new Ligne ( a, AxBy );
		Ligne AxBy_b = new Ligne ( AxBy, b );
		Ligne b_BxAy = new Ligne ( b, BxAy );
		Ligne BxAy_a = new Ligne ( BxAy, a );
		
		Ligne tAB = new Ligne ( t.getA(), t.getB() );
		Ligne tBC = new Ligne ( t.getB(), t.getC() );
		Ligne tCA = new Ligne ( t.getC(), t.getA() );
		
		if ( ( a_AxBy.intersection ( tAB ) || a_AxBy.intersection ( tBC ) || a_AxBy.intersection ( tCA ) ) ||
			( AxBy_b.intersection ( tAB ) || AxBy_b.intersection ( tBC ) || AxBy_b.intersection ( tCA ) ) ||
			( b_BxAy.intersection ( tAB ) || b_BxAy.intersection ( tBC ) || b_BxAy.intersection ( tCA ) ) ||
			( BxAy_a.intersection ( tAB ) || BxAy_a.intersection ( tBC ) || BxAy_a.intersection ( tCA ) ) ||
			( ( t.getA().getX() > a.getX() && t.getA().getY() > a.getY() ) &&
				( t.getA().getX() < b.getX() && t.getA().getY() < b.getY() ) &&
				( t.getB().getX() > a.getX() && t.getB().getY() > a.getY() ) &&
				( t.getB().getX() < b.getX() && t.getB().getY() < b.getY() ) &&
				( t.getC().getX() > a.getX() && t.getC().getY() > a.getY() ) &&
				( t.getC().getX() < b.getX() && t.getC().getY() < b.getY() ) 
			)
		)
			collision = true;
		
		return collision;		
	}
}
