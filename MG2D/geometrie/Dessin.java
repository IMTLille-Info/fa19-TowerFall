package MG2D.geometrie;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Classe abstraite destiné à représenter une forme géométrique.
 * <br /><br />
 * Elle permet de gérer la totalité des formes géométriques du moteur.<br />
 * Chaque classe de MG2D gérant une forme géométrique hérite d'elle.
 * <br /><br />
 * Son seul attribut correspond à la couleur de l'objet. 
 * @author Equipe 2D
 * @version 1.0
 */
public abstract class Dessin {
	
// Attribut //
	
	private Color couleur;
	
// Constructeur //
	
	/**
	 * Construit un Dessin en initialisant sa couleur.
	 * @param couleur Couleur du Dessin.
	 */
	public Dessin ( Color couleur ) {
		
		this.couleur = couleur;
	}
	
// Accesseurs //
	
	// Getter //
	
	/**
	 * Retourne la couleur du Dessin.
	 * @return couleur Couleur du Dessin.
	 */
	public Color getCouleur () {
		
		return couleur;
	}
	
	/**
	 * Méthode abstraite destinée à retourner la BoiteEnglobante d'un Dessin.<br />
	 * Elle sert à obliger la déclaration d'une méthode getBoiteEnglobante() dans les différentes classes héritant de Dessin.
	 * @return BoiteEnglobante BoiteEnglobante du Dessin
	 */
	public abstract BoiteEnglobante getBoiteEnglobante ();
	
	// Setter //
	
	/**
	 * Attribut une couleur au Dessin.
	 * @param couleur Couleur du Dessin.
	 */
	public void setCouleur ( Color couleur ) {
		
		this.couleur = couleur;
	}
	
// Méthodes //
	
	/**
	 * Méthode abstraite destinée à afficher un Dessin.<br />
	 * Elle sert à obliger la déclaration d'une méthode afficher() dans les différentes classes héritant de Dessin.
	 * @param g Graphics.
	 */
	public abstract void afficher ( Graphics g );
	
	/**
	 * Méthode de base permettant d'effectuer un test d'intersection via les BoiteEnglobante.<br />
	 * Il s'agit de Polymorphisme destiné à toujours offrir un moyen de tester les intersections à l'utilisateur.
	 * @param d Dessin.
	 * @return boolean Indique s'il y a intersection ou non.
	 */
	public boolean intersection ( Dessin d ) {
		
		return this.getBoiteEnglobante().intersection( d.getBoiteEnglobante() );
	}
	
	/**
	 * Permet de passer outre le polymorphisme.<br />
	 * En appelant cette méthode, l'utilisateur n'appelle pas les méthodes d'intersection précise des classes mais celle faisant appel aux BoiteEnglobante.
	 * <br /><br />
	 * Il s'agit donc d'un test d'intersection rapide utilisant toujours les BoiteEnglobante.
	 * @param d Dessin.
	 * @return boolean Indique s'il y a intersection ou non.
	 */
	public boolean intersectionRapide ( Dessin d ) {
		
		return this.getBoiteEnglobante().intersection( d.getBoiteEnglobante() );
	}
}
