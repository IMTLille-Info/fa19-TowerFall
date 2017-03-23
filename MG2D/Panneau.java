package MG2D;

import MG2D.geometrie.*;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * Cette classe créée un JPanel possédant une ArrayList de Dessin et quelques méthodes.<br />
 * L'utilisateur peut ajouter ou supprimer un dessin et effacer un Panneau.
 * @author Equipe 2D
 * @version 1.0
 */
public class Panneau extends JPanel {

// Attribut //

	private ArrayList < Dessin > a;

// Constructeur //

	/**
	 * Construit un Panneau vide.
	 */
	public Panneau () {

		a = new ArrayList < Dessin > ();
	}

	/**
	 * Construit un Panneau à partir d'une ArrayList de Dessin.
	 * @param a ArrayList de Dessin.
	 */
	public Panneau ( ArrayList < Dessin > a ) {

		this.a = a;
	}

	/**
	 * Construit un Panneau en recopiant la ArrayList d'un Panneau déjà existant.
	 * @param p Panneau déjà existant.
	 */
	public Panneau ( Panneau p ) {

		a = p.getA();
	}

// Accesseurs //

	// Getter //

	/**
	 * Retourne la ArrayList.
	 * @return a ArrayList de Dessin.
	 */
	public ArrayList < Dessin > getA () {

		return a;
	}

	/**
	 * Retourne un Point représentant le milieu du Panneau.
	 * @return Point Point représentant le milieu du Panneau.
	 */
	public Point getMilieu () {

		return new Point ( this.getWidth() / 2, this.getHeight() / 2 );
	}

	// Setter //

	/**
	 * Permet d'attribuer une ArrayList à l'attribut a.
	 * @param a ArrayList de Dessin.
	 */
	public void setL ( ArrayList < Dessin > a ) {

		this.a = a;
	}

// Méthodes //

	/**
	 * Méthode appelée automatiquement afin d'afficher le contenu de a.
	 * <br /><br />
	 * On parcours la ArrayList via une boucle for() qui affiche un à un le contenu de a.
	 */
	public void paint ( Graphics g ) {

		for ( int i = 0; i < a.size(); i++ )
			a.get( i ).afficher( g );
	}

	/**
	 * Ajoute un Dessin à a.
	 * @param d Dessin.
	 */
	public void ajouter ( Dessin d ) {

		a.add ( d );
		repaint();
	}

	/**
	 * Supprime un Dessin de a.
	 * @param d Dessin.
	 */
	public void supprimer ( Dessin d ) {

		a.remove ( d );
		repaint();
	}

	/**
	 * Vide le contenu de a.
	 */
	public void effacer () {

		a.clear();
		repaint();
	}
}
