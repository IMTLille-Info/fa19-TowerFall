package MG2D.geometrie;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Cette classe est un cas particulier qui découle de la classe Ovale.<br />
 * En effet, il s'agit du Cercle qui est un Ovale particuliers.
 * <br /><br />
 * Elle hérite de la classe Ovale afin que toutes les méthodes de la classe Ovale s'applique également à celle-ci.
 * @author Equipe 2D
 * @version 1.0
 */
public class Cercle extends Ovale {
	
// Attribut //
	
	private int rayon;

// Constructeur //

	// Sans couleur //
	
	/**
	 * Construit un Cercle à partir d'un Cercle.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param c Cercle.
	 */
	public Cercle ( Cercle c ) {
		
		super ( new Point ( c.getO().getX(), c.getO().getY() ),
				c.getRayon(),
				c.getRayon(),
				c.getPlein()
		);
		
		rayon = c.getRayon();
	}

	/**
	 * Construit un Cercle à partir d'un Point et d'un rayon.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param o Point correspondant au centre du Cercle.
	 * @param rayon int correspondant au rayon du Cercle.
	 */
	public Cercle ( Point o, int rayon ) {
		
		super ( o, rayon, rayon );
		
        this.rayon = rayon;
   	}
	
	/**
	 * Construit un Cercle plein à partir d'un Point et d'un rayon.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param o Point correspondant au centre du Cercle.
	 * @param rayon int correspondant au rayon du Cercle.
	 * @param plein Booléen.
	 */
	public Cercle ( Point o, int rayon, boolean plein ) {
		
		super ( o, rayon, rayon, plein );
		
        this.rayon = rayon;

   	}
	
	/**
	 * Construit un Cercle à partir d'un Carre.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * <br /><br />
	 * Le centre du cercle sera obtenue via les coordonnées du Point min du Carre auxquelles on ajoute la moitié de la dimension des côtés.
	 * @param c Carre qui définie le Cercle.
	 */
	public Cercle ( Carre c ) {
		
		super ( new Point ( ( c.getA().getX() + c.getTaille() / 2 ), ( c.getA().getY() + c.getTaille() / 2 ) ),
				c.getTaille() / 2,
				c.getTaille() / 2
		);
		
		rayon = c.getTaille() / 2;
	}
	
	/**
	 * Construit un Cercle plein à partir d'un Carre.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * <br /><br />
	 * Le centre du cercle sera obtenue via les coordonnées du Point min du Carre auxquelles on ajoute la moitié de la dimension des côtés.
	 * @param c Carre qui définie le Cercle.
	 * @param plein Booléen.
	 */
	public Cercle ( Carre c, boolean plein ) {
		
		super ( new Point ( ( c.getA().getX() + c.getTaille() / 2 ), ( c.getA().getY() + c.getTaille() / 2 ) ),
				c.getTaille() / 2,
				c.getTaille() / 2,
				plein
		);
			
		rayon = c.getTaille() / 2;
	}
	
	// Avec couleur //
	
	/**
	 * Construit un Cercle à partir d'un Cercle.
	 * @param couleur Couleur de l'objet.
	 * @param c Cercle.
	 */
	public Cercle ( Color couleur, Cercle c ) {
		
		super ( couleur,
				new Point ( c.getO().getX(), c.getO().getY() ),
				c.getRayon(),
				c.getRayon(),
				c.getPlein()
		);
		
		rayon = c.getRayon();
	}
	
	/**
	 * Construit un Cercle à partir d'un Point, d'un rayon et d'une couleur.<br />
	 * @param couleur Couleur de l'objet.
	 * @param o Point correspondant au centre du Cercle.
	 * @param rayon int correspondant au rayon du Cercle.
	 */
	public Cercle ( Color couleur, Point o, int rayon ) {
		
		super ( couleur, o, rayon, rayon );
		
        this.rayon = rayon;
   	}
	
	/**
	 * Construit un Cercle plein à partir d'un Point, d'un rayon et d'une couleur.<br />
	 * @param couleur Couleur de l'objet.
	 * @param o Point correspondant au centre du Cercle.
	 * @param rayon int correspondant au rayon du Cercle.
	 * @param plein Booléen.
	 */
	public Cercle ( Color couleur, Point o, int rayon, boolean plein ) {
		
		super ( couleur, o, rayon, rayon, plein );
		
        this.rayon = rayon;
   	}
	
	/**
	 * Construit un Cercle à partir d'un Carre et d'une couleur.<br />
	 * Le centre du cercle sera obtenue via les coordonnées du Point min du Carre auxquelles on ajoute la moitié de la dimension des côtés.
	 * @param couleur Couleur de l'objet.
	 * @param c Carre qui définie le Cercle.
	 */
	public Cercle ( Color couleur, Carre c ) {
		
		super ( couleur,
				new Point ( ( c.getA().getX() + c.getTaille() ), ( c.getA().getY() + c.getTaille() ) ),
				c.getTaille(),
				c.getTaille()
		);
		
		rayon = c.getTaille();
	}
	
	/**
	 * Construit un Cercle plein à partir d'un Carre et d'une couleur.<br />
	 * Le centre du cercle sera obtenue via les coordonnées du Point min du Carre auxquelles on ajoute la moitié de la dimension des côtés.
	 * @param couleur Couleur de l'objet.
	 * @param c Carre qui définie le Cercle.
	 * @param plein Booléen.
	 */
	public Cercle ( Color couleur, Carre c, boolean plein ) {
		
		super ( couleur,
				new Point ( ( c.getA().getX() + c.getTaille() ), ( c.getA().getY() + c.getTaille() ) ),
				c.getTaille(),
				c.getTaille(),
				plein
		);
		
		rayon = c.getTaille();
	}

// Accesseurs //

	// Getter //
	
	/**
	 * Retourne la valeur du rayon.
	 * @return rayon int correspondant au rayon du Cercle.
	 */
	public int getRayon () {
		
		return rayon;
	}
	
	// Setter //
	
	/**
	 * Permet d'attribuer une valeur au rayon.
	 * @param rayon int correspondant au rayon du Cercle.
	 */
	public void setRayon ( int rayon ) {
		
		this.rayon = rayon;
	}
	
// Méthodes //
	
	/**
	 * Implémentation de la méthode afficher de la classe abstraite Dessin.<br />
	 * Elle permet d'afficher un Cercle sur le Panneau.
	 * <br /><br />
	 * On récupère d'abord la couleur de l'objet afin de le dessiner dans la bonne couleur. Ensuite, on vérifie si l'objet est plein pour appeler la méthode adéquate. Sinon on utilise l'affichage de base avec drawOval().
	 * @param g Graphics.
	 */
	public void afficher ( Graphics g ) {
		
		g.setColor ( getCouleur() );
		
		if ( getPlein() )
			g.fillOval ( ( this.getO().getX() - rayon ), ( (int)g.getClipBounds().getHeight()-this.getO().getY() - rayon ), ( rayon * 2 ), ( rayon * 2 ) );
		
		else
			g.drawOval ( ( this.getO().getX() - rayon ), ( (int)g.getClipBounds().getHeight()-this.getO().getY() - rayon ), ( rayon * 2 ), ( rayon * 2 ) );
	}
	
	// Intersections //
	
		// Cercle - Point //
	
	/**
	 * Méthode d'intersection précise entre un Cercle et un Point.<br />
	 * Retourne vrai s'il y a collision.
	 * @param p Point.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Point p ) {
		
		boolean collision = false;
		
		int dx = p.getX() - this.getO().getX();
		int dy = p.getY() - this.getO().getY();
		
		if ( ( dx * dx ) + ( dy * dy ) < ( rayon * rayon ) )
			collision = true;
		
		return collision;
	}
	
		// Cercle - Ligne //
	
	/**
	 * Méthode d'intersection précise entre un Cercle et une Ligne.<br />
	 * Retourne vrai s'il y a collision.
	 * @param l Ligne.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Ligne l ) {
		
		boolean collision = false;
		
		int ux = l.getB().getX() - l.getA().getX();
		int uy = l.getB().getY() - l.getA().getY();
		int acx = this.getO().getX() - l.getA().getX();
		int acy = this.getO().getY() - l.getA().getY();
		
		int numerateur = ux * acy - uy * acx;
		
		if ( numerateur < 0 )
			numerateur = -numerateur;
		
		int denominateur = ( int ) ( Math.sqrt ( ux * ux + uy * uy ) );
		int ci = numerateur / denominateur;
		
		if ( ci < rayon )
			collision = true;
		
		return collision;
	}
	
		// Cercle - Rectangle //
	
	/**
	 * Méthode d'intersection précise entre un Cercle et un Rectangle.<br />
	 * Retourne vrai s'il y a collision.
	 * @param r Rectangle.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Rectangle r ) {
		
		boolean collision = false;
		
		int x = this.getO().getX();
		int y = this.getO().getY();

		if ( x < r.getA().getX() )
			x = r.getA().getX();
		
		if ( x > ( r.getA().getX() + r.getLargeur() ) )
			x = ( r.getA().getX() + r.getLargeur() );
		
		if ( y <  r.getA().getY() )
			y = r.getA().getY();
		
		if ( y > ( r.getA().getY() + r.getHauteur() ) )
			y = ( r.getA().getY() + r.getHauteur() );

		if ( ( this.getO().getX() - x ) * ( this.getO().getX() - x ) + ( this.getO().getY() - y ) * ( this.getO().getY() - y ) < rayon * rayon )
			collision = true;
		
		return collision;
	}
	
		// Cercle - Ovale //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Cercle - Cercle //
	
	/**
	 * Méthode d'intersection précise entre un Cercle et un Cercle.<br />
	 * Retourne vrai s'il y a collision.
	 * @param c Cercle.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Cercle c ) {
		
		boolean collision = false;
		
		int dx = c.getO().getX() - this.getO().getX();
		int dy = c.getO().getY() - this.getO().getY();
		int ra = c.getRayon() + rayon;
		
		if ( ( dx * dx ) + ( dy * dy ) <= ( ra * ra ) )
			collision = true;
		
		return collision;
	}
	
		// Cercle - Triangle //
	
	// TODO : travail à faire, si l'envie vous prend :) //
}
