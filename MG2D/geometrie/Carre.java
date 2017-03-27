package MG2D.geometrie;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Cette classe est un cas particulier qui découle de la classe Rectangle.<br />
 * En effet, il s'agit du Carré qui est un Rectangle particuliers.
 * <br /><br />
 * Elle hérite de la classe Rectangle afin que toutes les méthodes de la classe Rectangle s'applique également à celle-ci.
 * @author Equipe 2D
 * @version 1.0
 */
public class Carre extends Rectangle {
	
// Constructeurs //

	// Sans couleur //
	
	/**
	 * Construit un Carre à partir d'un autre Carre.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param c Carre.
	 */
	public Carre ( Carre c ) {
		
		super ( c );
	}
	
	/**
	 * Construit un Carre à partir de deux Point.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param b Point max.
	 */
	public Carre ( Point a, Point b ) {
		
		super ( a, b );
	}
	
	/**
	 * Construit un Carre plein à partir de deux Point.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param b Point max.
	 * @param plein Booléen.
	 */
	public Carre ( Point a, Point b, boolean plein ) {
		
		super ( a, b, plein );
	}
	
	/**
	 * Construit un Carre dont les bords sont arrondis à partir de deux Points et de deux entiers.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param b Point max.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 */
	public Carre ( Point a, Point b, int arcLargeur, int arcHauteur ) {
		
		super ( a, b, arcLargeur, arcHauteur );
	}
	
	/**
	 * Construit un Carre plein dont les bords sont arrondis à partir de deux Points et de deux entiers.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir. 
	 * @param a Point min.
	 * @param b Point max.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 * @param plein Booléen.
	 */
	public Carre ( Point a, Point b, int arcLargeur, int arcHauteur, boolean plein ) {
		
		super ( a, b, arcLargeur, arcHauteur, plein ); 
	}
	
	/**
	 * Construit un Carre à partir d'un point min et d'un entier correspondant à la dimension des côtés.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param taille Dimension des côtés.
	 */
	public Carre ( Point a, int taille ) {
		
		super ( a, taille, taille );
	}
	
	/**
	 * Construit un Carre plein à partir d'un point min et d'un entier correspondant à la dimension des côtés.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param taille Dimension des côtés.
	 * @param plein Booléen.
	 */
	public Carre ( Point a, int taille, boolean plein ) {
		
		super ( a, taille, taille, plein );
	}
	
	/**
	 * Construit un Carre dont les bords sont arrondis à partir d'un point min et d'un entier correpsondant à la dimension des côtés.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param taille Dimension des côtés.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 */
	public Carre ( Point a, int taille, int arcLargeur, int arcHauteur ) {
		
		super ( a, taille, taille, arcLargeur, arcHauteur );
	}
	
	/**
	 * Construit un Carre plein dont les bords sont arrondis à partir d'un point min et d'un entier correspondant à la dimension des côtés.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param a Point min.
	 * @param taille Dimension des côtés.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 * @param plein Booléen.
	 */
	public Carre ( Point a, int taille, int arcLargeur, int arcHauteur, boolean plein ) {
		
		super ( a, taille, taille, arcLargeur, arcHauteur, plein );
	}
	
	// Avec couleur //
	
	/**
	 * Construit un Carre à partir d'un autre Carre.
	 * @param couleur Couleur de l'objet.
	 * @param c Carre.
	 */
	public Carre ( Color couleur, Carre c ) {
		
		super (	couleur,
				new Point ( c.getA().getX(), c.getA().getY() ),
				new Point ( c.getB().getX(), c.getB().getY() ),
				c.getArcLargeur(),
				c.getArcHauteur(),
				c.getPlein()
		);
	}
	
	/**
	 * Construit un Carre à partir de deux Point et d'une couleur.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param b Point max.
	 */
	public Carre ( Color couleur, Point a, Point b ) {
		
		super ( couleur, a, b );
	}
	
	/**
	 * Construit un Carre plein à partir de deux Point et d'une couleur.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param b Point max.
	 * @param plein Booléen.
	 */
	public Carre ( Color couleur, Point a, Point b, boolean plein ) {
		
		super ( couleur, a, b, plein );
	}
	
	/**
	 * Construit un Carre dont les bords sont arrondis à partir de deux Points, de deux entiers et d'une couleur.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param b Point max.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 */
	public Carre ( Color couleur, Point a, Point b, int arcLargeur, int arcHauteur ) {
		
		super ( couleur, a, b, arcLargeur, arcHauteur );
	}
	
	/**
	 * Construit un Carre plein dont les bords sont arrondis à partir de deux Points, de deux entiers et d'une couleur.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param b Point max.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 * @param plein Booléen.
	 */
	public Carre ( Color couleur, Point a, Point b, int arcLargeur, int arcHauteur, boolean plein ) {
		
		super ( couleur, a, b, arcLargeur, arcHauteur, plein );
	}
	
	/**
	 * Construit un Carre à partir d'un point min, d'un entier correspondant à la dimension des côtés et d'une couleur.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param taille Dimension des côtés.
	 */
	public Carre ( Color couleur, Point a, int taille ) {
		
		super ( couleur, a, taille, taille );
	}
	
	/**
	 * Construit un Carre plein à partir d'un point min, d'un entier correspondant à la dimension des côtés et d'une couleur.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param taille Dimension des côtés.
	 * @param plein Booléen.
	 */
	public Carre ( Color couleur, Point a, int taille, boolean plein ) {
		
		super ( couleur, a, taille, taille, plein );
	}
	
	/**
	 * Construit un Carre dont les bords sont arrondis à partir d'un point min, d'un entier correpsondant à la dimension des côtés et d'une couleur.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param taille Dimension des côtés.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 */
	public Carre ( Color couleur, Point a, int taille, int arcLargeur, int arcHauteur ) {
		
		super ( couleur, a, taille, taille, arcLargeur, arcHauteur );
	}
	
	/**
	 * Construit un Carre plein dont les bords sont arrondis à partir d'un point min, d'un entier correspondant à la dimension des côtés et d'une couleur.
	 * @param couleur Couleur de l'objet.
	 * @param a Point min.
	 * @param taille Dimension des côtés.
	 * @param arcLargeur Arrondis en largeur.
	 * @param arcHauteur Arrondis en hauteur.
	 * @param plein Booléen.
	 */
	public Carre ( Color couleur, Point a, int taille, int arcLargeur, int arcHauteur, boolean plein ) {
		
		super ( couleur, a, taille, taille, arcLargeur, arcHauteur, plein );
	}
	
// Accesseurs //

	// Getter //
	
	/**
	 * Retourne l'entier correspondant à la dimension des côtés.<br />
	 * Cette valeur est obtenue par un calcul simple : bx - ax.
	 * @return int int correspondant à la dimension des côtés.
	 */
	public int getTaille () {
		
		return ( this.getB().getX() - this.getA().getX() );
	}
	
// Méthodes //
	
	/**
	 * Implémentation de la méthode afficher() de la classe abstraite Dessin.<br />
	 * Elle permet d'afficher un Carre sur le Panneau.
	 * <br /><br />
	 * On récupère d'abord la couleur de l'objet afin de le dessiner dans la bonne couleur. Ensuite, on vérifie si l'objet est arrondis et plein, arrondis ou plein pour appeler les méthodes adéquates. Sinon on utilise l'affichage de base avec drawRect().
	 * @param g Graphics.
	 */
	public void afficher ( Graphics g ) {
		
		g.setColor ( getCouleur() );
		
		if ( getArrondis() && getPlein() )
		    g.fillRoundRect ( this.getA().getX(), (int)g.getClipBounds().getHeight()-this.getA().getY()-getTaille(), getTaille(), getTaille(), getArcLargeur(), getArcHauteur() );
		
		else if ( getArrondis() )
			g.drawRoundRect ( this.getA().getX(), (int)g.getClipBounds().getHeight()-this.getA().getY()-getTaille(), getTaille(), getTaille(), getArcLargeur(), getArcHauteur() );
		
		else if ( getPlein() )
			g.fillRect ( this.getA().getX(), (int)g.getClipBounds().getHeight()-this.getA().getY()-getTaille(), getTaille(), getTaille() );
		
		else
			g.drawRect ( this.getA().getX(), (int)g.getClipBounds().getHeight()-this.getA().getY()-getTaille(), getTaille(), getTaille() );
	}
}
