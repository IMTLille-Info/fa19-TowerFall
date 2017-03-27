package MG2D.geometrie;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/**
 * Cette classe permet la création de Texte.<br />
 * Un Texte est définie par une chaîne de caractères, d'une police de texte et d'un Point.
 * @author Equipe 2D
 * @version 1.0
 */
public class Texte extends Dessin {
	
// Attributs //
	
	private String texte;
	private Font police;
	
	private Point a;	// Il s'agit du point central du texte /!\ //
	
// Constructeur //
	
	// Couleur par défaut //
	
	/**
	 * Construit un Texte à partir d'une chaîne de caractères, d'une police et d'un Point.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.<br />
	 * /!\ Attention ! Le Point correspondant au centre du Texte.
	 * @param texte Chaîne de caractères
	 * @param police Police de texte
	 * @param a Point
	 */
	public Texte ( String texte, Font police, Point a ) {
		
		super ( Color.black );
		
		this.texte = texte;
		this.police = police;
		this.a = a;
	}
	
	// Couleur définie par l'utilisateur //
	
	/**
	 * Construit un Texte à partir d'une chaîne de caractères, d'une police et d'un Point.
	 * @param couleur Couleur du Texte
	 * @param texte Chaîne de caractères
	 * @param police Police de texte
	 * @param a Point
	 */
	public Texte ( Color couleur, String texte, Font police, Point a ) {
		
		super ( couleur );
		
		this.texte = texte;
		this.police = police;
		this.a = a;
	}
	
// Accesseurs //
	
	// Getter //
	
	/**
	 * Retourne la chaîne de caractères texte.
	 * @return texte Chaîne de caractères
	 */
	public String getTexte () {
		
		return texte;
	}
	
	/**
	 * Retourne la police de texte.
	 * @return police Font du Texte
	 */
	public Font getPolice () {
		
		return police;
	}	
	
	/**
	 * Retourne le point central.
	 * @return a Point central du Texte.
	 */
	public Point getA () {
		
		return a;
	}
	
	/**
	 * Implémentation de la méthode getBoiteEnglobante() de la classe abstraite Dessin.<br />
	 * Elle retourne une BoiteEnglobante entourant le Texte.<br /><br />
	 * /!\ Attention ! Cette méthode n'est pas rédigée !<br />
	 * N'essayez pas de tester l'intersection entre un Texte et un objet !
	 * @return BoiteEnglobante BoiteEnglobante entourant la Ligne.
	 * @throws java.lang.NullPointerException
	 */
	public BoiteEnglobante getBoiteEnglobante() {

		// TODO : travail à faire, si l'envie vous prend :) //
		return null;
	}
	
	// Setter //
	
	/**
	 * Permet d'attribuer une chaîne de caractères à texte.
	 * @param texte Chaîne de caractères
	 */
	public void setTexte ( String texte ) {
		
		this.texte = texte;
	}
	
	/**
	 * Permet d'attribuer une Font à police.
	 * @param police
	 */
	public void setPolice ( Font police ) {
		
		this.police = police;
	}
	
	/**
	 * Permet d'attribuer un Point au Point a.
	 * @param a Point central du Texte
	 */
	public void setA ( Point a ) {
		
		this.a = a;
	}
	
// Méthodes //

	/**
	 * Implémentation de la méthode afficher() de la classe abstraite Dessin.<br />
	 * Elle permet d'afficher un Texte sur le Panneau.
	 * <br /><br />
	 * On récupère d'abord la couleur et la police. Une fois la police récupérée, on crée un FontMetrics afin d'avoir la dimension en largeur du texte ce qui nous permets d'afficher correctement le Texte avec le Point central donné par l'utilisateur.
	 * @param g Graphics.
	 */
	public void afficher ( Graphics g ) {
		
        g.setColor ( getCouleur() );
        g.setFont ( police );
        
        FontMetrics metr = g.getFontMetrics ( police );
        
        g.drawString ( texte, a.getX() - ( metr.stringWidth ( texte ) / 2 ), (int)g.getClipBounds().getHeight()-a.getY()+(metr.getHeight()/4) );
	}
}
