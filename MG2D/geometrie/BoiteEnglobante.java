package MG2D.geometrie;

/**
 * Cette classe permet de gérer les collisions via le principe des AABB (Axis Aligned Bounding Box).
 * <br /><br />
 * Le principe est simple : on entoure notre forme par un Rectangle dont les côtés sont alignés avec les axes x et y.<br />
 * L'objectif est de permettre de fournir une méthode de collision pour toutes les formes géréées par le moteur car les collisions rectangle - rectangle sont très facile à détecter.
 * @author Equipe 2D
 * @version 1.0
 */
public class BoiteEnglobante extends Rectangle {
	
// Constructeur //
	
	/**
	 * Construit une BoiteEnglobante à partir de deux points.<br />
	 * On fait appel à la méthode super() afin de créer un rectangle via les deux points passés en paramètre.
	 * @param a Point correspondant au x min, y min de la forme.
	 * @param b Point correspondant au x max, y max de la forme.
	 */
	public BoiteEnglobante ( Point a, Point b ) {
		
		super ( a, b );
	}
	
// Accesseurs //
	
	// Getter //
	
	/**
	 * Retourne le Point correspondant au x min, y min de la forme.
	 * @return Point Point correspondant au x min, y min de la forme.
	 */
	public Point getMin () {
		
		return getA();
	}
	
	/**
	 * Retourne le Point correspondant au x max, y max de la forme.
	 * @return Point Point correspondant au x max, y max de la forme.
	 */
	public Point getMax () {
		
		return getB();
	}
	
	// Setter //
	
	/**
	 * Permet d'attribuer un point au point correspondant au x min, y min de la forme.
	 * @param min Point correspondant au x min, y min de la forme.
	 */
	public void setMin ( Point min ) {
		
		setA ( min );
	}
	
	/**
	 * Permet d'attribuer un point au point correspondant au x max, y max de la forme.
	 * @param max Point correspondant au x max, y max de la forme.
	 */
	public void setMax ( Point max ) {
		
		setB ( max );
	}
	
// Méthode //
	
	/**
	 * Méthode de détection des collisions entre deux BoiteEnglobante.
	 * <br /><br />
	 * Le calcul est assez simple :<br />
	 * si les coordonnées x et y du point max de l'objet A sont inférieur aux coordonnées x et y du point min de l'objet B
	 * ou si les coordonnées x et y du point min de l'objet A sont supérieur aux coordonnées x et y du point max de l'objet B
	 * alors il n'y a pas collision.
	 * @param b BoiteEnglobante.
	 * @return collision Booléen déterminant s'il y a collision ou non.
	 */
	public boolean intersection ( BoiteEnglobante b ) {
		
		boolean collision = true;
		
		if ( b.getMin().getX() > this.getMax().getX() ||
			b.getMin().getY() > this.getMax().getY() ||
			b.getMax().getX() < this.getMin().getX() ||
			b.getMax().getY() < this.getMin().getY()
		)
			collision = false;

		return collision;
	}
}
