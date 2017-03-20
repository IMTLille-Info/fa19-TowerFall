package MG2D.geometrie;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Cette classe permet la création d'Ovale.<br />
 * Un Ovale est défini par un Point central, une largeur, une hauteur et un booléen.
 * @author Equipe 2D
 * @version 1.0
 */
public class Ovale extends Dessin {
	
// Attributs //
	
	private Point o;	// Point centrale //
	
	private int largeur, hauteur;
	
	private boolean plein = false;	// Détermine si l'Ovale est plein ou non //
	
// Constructeurs //

	// Sans couleur //

	/**
	 * Construit un Ovale à partir d'un Ovale.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param o Ovale.
	 */
	public Ovale ( Ovale o ) {
		
		super ( Color.black );
		
		this.o = new Point ( o.getO().getX(), o.getO().getY() );
		
		largeur = o.getLargeur();
		hauteur = o.getHauteur();
		
		plein = o.getPlein();
	}
	
	/**
	 * Construit un Ovale à partir d'un Point et deux entiers.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param o Point central.
	 * @param largeur Largeur de l'Ovale.
	 * @param hauteur Hauteur de l'Ovale.
	 */
	public Ovale ( Point o, int largeur, int hauteur ) {
		
		super ( Color.black );
		
		this.o = o;
		
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	
	/**
	 * Construit un Ovale plein à partir d'un Point et de deux entiers.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param o Point central.
	 * @param largeur Largeur de l'Ovale.
	 * @param hauteur Hauteur de l'Ovale.
	 * @param plein Booléen.
	 */
	public Ovale ( Point o, int largeur, int hauteur, boolean plein ) {
		
		super ( Color.black );
		
		this.o = o;
		
		this.largeur = largeur;
		this.hauteur = hauteur;
		
		this.plein = plein;
	}
	
	/**
	 * Construit un Ovale à partir d'un Rectangle.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * <br /><br />
	 * Le centre de l'Ovale sera obtenue via les coordonnées du Point min du Rectangle auxquelles on ajoute la moitié de la dimension des côtés.
	 * @param r Rectangle.
	 */
	public Ovale ( Rectangle r ) {
		
		super ( Color.black );
		
		o = new Point ( r.getA().getX(), r.getA().getY() );
		
		this.largeur = r.getLargeur() / 2;
		this.hauteur = r.getHauteur() / 2;
	}
	
	/**
	 * Construit un Ovale plein à partir d'un Rectangle.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * <br /><br />
	 * Le centre de l'Ovale sera obtenue via les coordonnées du Point min du Rectangle auxquelles on ajoute la moitié de la dimension des côtés.
	 * @param r Rectangle.
	 * @param plein Booléen.
	 */
	public Ovale ( Rectangle r, boolean plein ) {
		
		super ( Color.black );
		
		o = new Point ( r.getA().getX(), r.getA().getY() );
		
		this.largeur = r.getLargeur() / 2;
		this.hauteur = r.getHauteur() / 2;
		
		this.plein = plein;
	}
	
	// Avec couleur //
	
	/**
	 * Construit un Ovale à partir d'un Ovale.
	 * @param couleur Couleur de l'objet.
	 * @param o Ovale.
	 */
	public Ovale ( Color couleur, Ovale o ) {
		
		super ( couleur );
		
		this.o = new Point ( o.getO().getX(), o.getO().getY() );
		
		largeur = o.getLargeur();
		hauteur = o.getHauteur();
		
		plein = o.getPlein();
	}
	
	/**
	 * Construit un Ovale à partir d'un Point et deux entiers.
	 * @param couleur Couleur de l'objet.
	 * @param o Point central.
	 * @param largeur Largeur de l'Ovale.
	 * @param hauteur Hauteur de l'Ovale.
	 */
	public Ovale ( Color couleur, Point o, int largeur, int hauteur ) {
		
		super ( couleur );
		
		this.o = o;
		
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	
	/**
	 * Construit un Ovale plein à partir d'un Point et de deux entiers.
	 * @param couleur Couleur de l'objet.
	 * @param o Point central.
	 * @param largeur Largeur de l'Ovale.
	 * @param hauteur Hauteur de l'Ovale.
	 * @param plein Booléen.
	 */
	public Ovale ( Color couleur, Point o, int largeur, int hauteur, boolean plein ) {
		
		super ( couleur );
		
		this.o = o;
		
		this.largeur = largeur;
		this.hauteur = hauteur;
		
		this.plein = plein;
	}
	
	/**
	 * Construit un Ovale à partir d'un Rectangle.
	 * <br /><br />
	 * Le centre de l'Ovale sera obtenue via les coordonnées du Point min du Rectangle auxquelles on ajoute la moitié de la dimension des côtés.
	 * @param couleur Couleur de l'objet.
	 * @param r Rectangle.
	 */
	public Ovale ( Color couleur, Rectangle r ) {
		
		super ( couleur );
		
		o = new Point ( r.getA().getX(), r.getA().getY() );
		
		this.largeur = r.getLargeur() / 2;
		this.hauteur = r.getHauteur() / 2;
	}
	
	/**
	 * Construit un Ovale plein à partir d'un Rectangle.
	 * <br /><br />
	 * Le centre de l'Ovale sera obtenue via les coordonnées du Point min du Rectangle auxquelles on ajoute la moitié de la dimension des côtés.
	 * @param couleur Couleur de l'objet.
	 * @param r Rectangle.
	 * @param plein Booléen.
	 */
	public Ovale ( Color couleur, Rectangle r, boolean plein ) {
		
		super ( couleur );
		
		o = new Point ( r.getA().getX(), r.getA().getY() );
		
		this.largeur = r.getLargeur() / 2;
		this.hauteur = r.getHauteur() / 2;
		
		this.plein = plein;
	}
	
// Accesseurs //

	// Getter //
	
	/**
	 * Retourne le Point o de l'Ovale. 
	 * @return o Point central de l'Ovale.
	 */
	public Point getO () {
		
		return o;
	}
	
	/**
	 * Retourne la largeur de l'Ovale.
	 * @return largeur Largeur de l'Ovale.
	 */
	public int getLargeur () {
		
		return largeur;
	}
	
	/**
	 * Retourne la hauteur de l'Ovale.
	 * @return hauteur Hauteur de l'Ovale.
	 */
	public int getHauteur () {
		
		return hauteur;
	}
	
	/**
	 * Retourne l'état de remplissage de l'Ovale.
	 * @return plein Etat de remplissage de l'Ovale.
	 */
	public boolean getPlein () {
		
		return plein; 
	}
	
	/**
	 * Implémentation de la méthode getBoiteEnglobante() de la classe abstraite Dessin.<br />
	 * Elle retourne une BoiteEnglobante entourant l'Ovale.
	 * @return BoiteEnglobante BoiteEnglobante entourant l'Ovale.
	 */
	public BoiteEnglobante getBoiteEnglobante () {
		
		return new BoiteEnglobante ( new Point ( getO().getX() - largeur / 2, getO().getY() - hauteur / 2 ),
									new Point ( getO().getX() + largeur / 2, getO().getY() + hauteur / 2 )
		);
	}

	// Setter //
	
	/**
	 * Permet d'attribuer un Point à o.
	 * @param o Point central.
	 */
	public void setO ( Point o ) {
		
		this.o = o;
	}
	
	/**
	 * Permet d'attribuer une valeur à largeur.
	 * @param largeur Largeur de l'Ovale.
	 */
	public void setLargeur ( int largeur ) {
		
		this.largeur = largeur;
	}
	
	/**
	 * Permet d'attribuer une valeur à hauteur.
	 * @param hauteur Hauteur de l'Ovale.
	 */
	public void setHauteur ( int hauteur ) {
		
		this.hauteur = hauteur;
	}
	
	/**
	 * Permet d'attribuer une valeur à plein.
	 * @param plein Etat de remplissage de l'Ovale.
	 */
	public void setPlein ( boolean plein ) {
		
		this.plein = plein;
	}
	
// Méthodes //
	
	/**
	 * Implémentation de la méthode afficher() de la classe abstraite Dessin.<br />
	 * Elle permet d'afficher un Ovale sur le Panneau.
	 * <br /><br />
	 * On récupère d'abord la couleur de l'objet afin de le dessiner dans la bonne couleur. Ensuite on vérifie si l'Ovale est plein pour utiliser la méthode adéquate sinon on utilise l'affichage avec drawOval().
	 * @param g Graphics.
	 */
	public void afficher ( Graphics g ) {
		
		g.setColor ( this.getCouleur() );
		
		if ( plein )
			g.fillOval ( ( o.getX() - largeur / 2 ), ( (int)g.getClipBounds().getHeight()-o.getY() - hauteur / 2 ), largeur, hauteur );
		
		else
			g.drawOval ( ( o.getX() - largeur / 2 ), ( (int)g.getClipBounds().getHeight()-o.getY() - hauteur / 2 ), largeur, hauteur );
	}
	
	// Intersections //
	
		// Ovale - Point //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Ovale - Ligne //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Ovale - Rectangle //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Ovale - Ovale //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Ovale - Cercle //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Ovale - Triangle //
	
	// TODO : travail à faire, si l'envie vous prend :) //
}
