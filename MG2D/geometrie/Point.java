package MG2D.geometrie;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Cette classe permet la création de Point.<br />
 * Un Point est défini par deux entiers (abscisse et ordonnée).
 * @author Equipe 2D
 * @version 1.0
 */
public class Point extends Dessin {
	
// Attributs //
	
	private int x;	// Abscisse //
	private int y;	// Ordonnée //
	
// Constructeurs //
	
	// Sans couleur //
	
	/**
	 * Construit un Point à partir d'un Point.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param p Point.
	 */
	public Point ( Point p ) {
		
		super ( Color.black );
		
		x = p.getX();
		y = p.getY();
	}
	
	/**
	 * Construit un Point à partir de deux entiers.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * @param x Abscisse.
	 * @param y Ordonnée.
	 */
	public Point ( int x, int y ) {
		
		super ( Color.black );
		
        this.x = x;
        this.y = y;
	}
	
	// Avec couleur //
	
	/**
	 * Construit un Point à partir d'un Point.
	 * @param couleur Couleur de l'objet.
	 * @param p Point.
	 */
	public Point ( Color couleur, Point p ) {
		
		super ( couleur );
		
		x = p.getX();
		y = p.getY();
	}
	
	/**
	 * Construit un Point à partir de deux entiers.
	 * @param couleur Couleur de l'objet.
	 * @param x Abscisse.
	 * @param y Ordonnée.
	 */
	public Point ( Color couleur, int x, int y ) {
		
		super ( couleur );
		
        this.x = x;
        this.y = y;
	}
	
// Accesseurs //
	
	// Getter //
	
	/**
	 * Retourne la valeur de x.
	 * @return x Abscisse.
	 */
	public int getX () {
		
		return x;
	}
	
	/**
	 * Retourne la valeur de y.
	 * @return y Ordonnée.
	 */
	public int getY () {
		
		return y;
	}
	
	/**
	 * Implémentation de la méthode getBoiteEnglobante() de la classe abstraite Dessin.<br />
	 * Elle retourne une BoiteEnglobante qui est le Point lui-même.
	 * @return BoiteEnglobante BoiteEnglobante qui est le Point lui-même.
	 */
	public BoiteEnglobante getBoiteEnglobante () {
		
		return new BoiteEnglobante ( new Point ( x, y ),
									new Point ( x, y ) );
	}
	
	// Setter //
	
	/**
	 * Permet d'attribuer une valeur à x.
	 * @param x Abscisse.
	 */
	public void setX ( int x ) {
		
		this.x = x;
	}
	
	/**
	 * Permet d'attribuer une valeur à y.
	 * @param y Ordonnée.
	 */
	public void setY ( int y ) {
		
		this.y = y;
	}
	
// Méthodes //
	
	/**
	 * Implémentation de la méthode afficher() de la classe abstraite Dessin.<br />
	 * Elle permet d'afficher un Point sur le Panneau.
	 * <br /><br />
	 * On récupère d'abord la couleur de l'objet afin de le dessiner dans la bonne couleur. Puis on utilise l'affichage avec drawLine().
	 * @param g Graphics.
	 */
	public void afficher ( Graphics g ) {
		
		g.setColor ( getCouleur() );
		
		g.drawLine ( x, (int)g.getClipBounds().getHeight()-y, x, (int)g.getClipBounds().getHeight()-y );
	}
	
	// Intersections //
	
		// Point - Point //
	
	/**
	 * Méthode d'intersection précise entre un Point et un Point.<br />
	 * Retourne vrai s'il y a collision.
	 * @param p Point.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Point p ) {
		
		boolean collision = false;
		
		if ( x == p.getX() && y == p.getY() )
			collision = true;
		
		return collision;
	}
	
		// Point - Ligne //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Point - Rectangle : BoiteEnglobante //
	
		// Point - Ovale //
	
	// TODO : travail à faire, si l'envie vous prend :) //
	
		// Point - Cercle //
	
	/**
	 * Méthode d'intersection précise entre un Point et un Cercle.<br />
	 * Retourne vrai s'il y a collision.
	 * @param c Cercle.
	 * @return boolean Résultat du test.
	 */
	public boolean intersection ( Cercle c ) {
		
		boolean collision = false;
		
		int dx = x - c.getO().getX();
		int dy = y - c.getO().getY();
		
		if ( ( dx * dx ) + ( dy * dy ) < ( c.getRayon() * c.getRayon() ) )
			collision = true;
		
		return collision;
	}
	
		// Point - Triangle //
	
	// TODO : travail à faire, si l'envie vous prend :) //
}
