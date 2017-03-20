package MG2D;

import MG2D.geometrie.*;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Cette classe créée une JFrame correspondant aux besoins du moteur MG2D.
 * <br /><br />
 * L'utilisateur peut définir un titre, une largeur et une hauteur à sa fenêtre.<br />
 * Par la suite, il pourra, grâce à cette classe, faire le lien entre son programme principal et la classe Panneau gérant l'affichage des formes.
 * @author Equipe 2D
 * @version 1.0
 */
public class Fenetre extends JFrame {

// Attributs //

	private Dimension d;	// Permet de gérer correctement la dimension du Panneau avec la méthode p.setPreferredSize ( Dimension ) //
	private Panneau p;

// Constructeur //

	/**
	 * Construit une Fenetre possédant un titre, une largeur et une hauteur.
	 * <br /><br />
	 * Afin d'avoir un espace de travail de la taille spécifiée par l'utilisateur, la Fenetre sera toujours légérement plus grande que les dimensions données.<br />
	 * Cela permet par exemple de simplifier les calculs de collision avec les bords de la Fenetre puisque l'utilisateur ne devra pas soustraire la taille des bordures.
	 * <br /><br />
	 * Par défaut, la Fenetre est centrée et ne peut pas être redimensionnée.
	 * @param titre Titre de la Fenetre.
	 * @param largeur Largeur de l'espace de travail.
	 * @param hauteur Hauteur de l'espace de travail.
	 */
	public Fenetre ( String titre, int largeur, int hauteur ) {

		d = new Dimension ( largeur, hauteur );
		p = new Panneau ();

		p.setPreferredSize ( d ); // On indique que l'on souhaite avoir un Panneau de la Dimension (largeur, hauteur) //

		this.setContentPane ( p );

		this.pack(); // Permet d'attribuer automatiquement la dimension de la Fenetre grâce à ce qui la compose (ici en l'occurence, le Panneau) //

		this.setTitle ( titre );

		this.setLocationRelativeTo ( null );
		this.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
		this.setResizable ( false ); // On empêche le redimensionnement pour éviter les problèmes de centrages des objets //

		this.setVisible ( true );

		if ( p.getWidth() > d.getWidth() || p.getHeight() > d.getHeight() ) { // Si le Panneau ne fait toujours pas la taille voulue, on force le changement //

			p.setSize ( d );
			this.pack();
		}
	}

// Accesseurs //

	// Getter //

	/**
	 * Retourne le Panneau lié à la Fenetre.
	 * @return p Panneau lié à la Fenetre.
	 */
	public Panneau getP () {

		return p;
	}

	/**
	 * Permet de faire appel à la méthode getMilieu() d'un Panneau.
	 * <br /><br />
	 * Il s'agit simplement d'un relais entre le programme principal et la classe Panneau.<br />
	 * On évite ainsi à l'utilisateur d'écrire f.getP().getMilieu();
	 * @return Point Point représentant le milieu du Panneau.
	 */
	public Point getMilieu () {

		return p.getMilieu();
	}


//Setter//
/**
 * Retourne le Panneau lié à la Fenetre.
 * @return p Panneau lié à la Fenetre.
 */
public void setP(Panneau p) {

	this.p = p;
}

// Méthodes //

	/**
	 * Permet d'appliquer la méthode repaint() à la Fenetre.<br/>
	 * Méthode présente dans un soucis de "Francisation" du code.
	 */
	public void rafraichir () {

		repaint();
	}

	/**
	 * Permet de faire appel à la méthode effacer() d'un Panneau.
	 * <br /><br />
	 * Il s'agit simplement d'un relais entre le programme principal et la classe Panneau.<br />
	 * On évite ainsi à l'utilisateur d'écrire f.getP().effacer();
	 */
	public void effacer () {

		p.effacer();
	}

	/**
	 * Permet de faire appel à la méthode ajouter() d'un Panneau.
	 * <br /><br />
	 * Il s'agit simplement d'un relais entre le programme principal et la classe Panneau.<br />
	 * On évite ainsi à l'utilisateur d'écrire f.getP().ajouter();
	 */
	public void ajouter ( Dessin d ) {

		p.ajouter ( d );
	}

	/**
	 * Permet de faire appel à la méthode supprimer() d'un Panneau.
	 * <br /><br />
	 * Il s'agit simplement d'un relais entre le programme principal et la classe Panneau.<br />
	 * On évite ainsi à l'utilisateur d'écrire f.getP().supprimer();
	 */
	public void supprimer ( Dessin d ) {

		p.supprimer ( d );
	}
}
