package MG2D.geometrie;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import java.io.IOException;

import java.net.URL;

import javax.imageio.ImageIO;

/**
 * Cette classe est un cas particulier qui découle de la classe Rectangle.<br />
 * En effet, il s'agit d'une Texture qui est un Rectangle sur lequel on applique une image.<br />
 * Elle hérite de la classe Rectangle afin que toutes les méthodes de la classe Rectangle s'applique également à celle-ci.<br />
 * <br /><br />
 * Une Texture est définie par une Image, une largeur, une hauteur et un booléen indiquant si le fond est transparent ou non.
 * @author Equipe 2D
 * @version 1.0
 */
public class Texture extends Rectangle {
	
// Attributs //
	
	private Image img = null;
	
	private int largeur, hauteur;
	
	private boolean transparent = true;	// Détermine si le fond de l'image est transparent ou non //
	
// Constructeurs //
	
	// Sans couleur de fond //
	
	/**
	 * Construit une Texture à partir d'une chaîne de caractères et d'un Point.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * <br /><br />
	 * La chaîne de caractères représente le chemin d'accès vers l'image.
	 * @param chemin Chaîne de caractères représente le chemin d'accès vers l'image.
	 * @param a	Point ( x min, y min )
	 */
	public Texture ( String chemin, Point a ) {
		
		super ( a, 0, 0 );
		
		try {
			
		    URL url = getClass().getClassLoader().getResource ( chemin );
		    img = ImageIO.read ( url );
		}
		
		catch ( IOException e ) {
			
			System.out.println ("[!] Erreur : L'image est introuvable.\n" + e);
		}
		
		largeur = img.getWidth ( null );
		hauteur = img.getHeight ( null );
		
		setB ( new Point ( a.getX() + largeur, a.getY() + hauteur ) );
	}
	
	/**
	 * Construit une Texture à partir d'une chaîne de caractères et de deux Points.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * <br /><br />
	 * La chaîne de caractères représente le chemin d'accès vers l'image.
	 * @param chemin Chaîne de caractères représente le chemin d'accès vers l'image.
	 * @param a	Point ( x min, y min )
	 * @param b Point ( x max, y max )
	 */
	public Texture ( String chemin, Point a, Point b ) {
		
		super ( a, b );
		
		try {
			
			URL url = getClass().getClassLoader().getResource ( chemin );
		    img = ImageIO.read ( url );
		}
		
		catch ( IOException e ) {
			
			System.out.println ("[!] Erreur : L'image est introuvable.\n" + e);
		}
		
		largeur = b.getX() - a.getX();
		hauteur = b.getY() - a.getY();
	}
	
	/**
	 * Construit une Texture à partir d'une chaîne de caractères, d'un Point et de deux entiers.<br />
	 * Il s'agit du constructeur sans couleur, ainsi l'objet sera par défaut en noir.
	 * <br /><br />
	 * La chaîne de caractères représente le chemin d'accès vers l'image.
	 * @param chemin Chaîne de caractères représente le chemin d'accès vers l'image.
	 * @param a	Point ( x min, y min )
	 * @param largeur int
	 * @param hauteur int
	 */
	public Texture ( String chemin, Point a, int largeur, int hauteur ) {
		
		super ( a, largeur, hauteur );
		
		try {
			
			URL url = getClass().getClassLoader().getResource ( chemin );
		    img = ImageIO.read ( url );
		}
		
		catch ( IOException e ) {
			
			System.out.println ("[!] Erreur : L'image est introuvable.\n" + e);
		}
		
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	
	// Avec couleur de fond //

	/**
	 * Construit une Texture à partir d'une chaîne de caractères et d'un Point.
	 * <br /><br />
	 * La chaîne de caractères représente le chemin d'accès vers l'image.
	 * @param couleur Couleur de fond
	 * @param chemin Chaîne de caractères représente le chemin d'accès vers l'image.
	 * @param a	Point ( x min, y min )
	 */
	public Texture ( Color couleur, String chemin, Point a ) {
		
		super ( couleur, a, 0, 0 );
		
		try {
			
			URL url = getClass().getClassLoader().getResource ( chemin );
		    img = ImageIO.read ( url );
		}
		
		catch ( IOException e ) {
			
			System.out.println ("[!] Erreur : L'image est introuvable.\n" + e);
		}
		
		largeur = img.getWidth ( null );
		hauteur = img.getHeight ( null );
		
		setB ( new Point ( a.getX() + largeur, a.getY() + hauteur ) );
		
		transparent = false;
	}
	
	/**
	 * Construit une Texture à partir d'une chaîne de caractères et de deux Points.
	 * <br /><br />
	 * La chaîne de caractères représente le chemin d'accès vers l'image.
	 * @param couleur Couleur de fond
	 * @param chemin Chaîne de caractères représente le chemin d'accès vers l'image.
	 * @param a	Point ( x min, y min )
	 * @param b Point ( x max, y max )
	 */
	public Texture ( Color couleur, String chemin, Point a, Point b ) {
		
		super ( couleur, a, b );
		
		try {
			
			URL url = getClass().getClassLoader().getResource ( chemin );
		    img = ImageIO.read ( url );
		}
		
		catch ( IOException e ) {
			
			System.out.println ("[!] Erreur : L'image est introuvable.\n" + e);
		}
		
		largeur = b.getX() - a.getX();
		hauteur = b.getY() - a.getY();
		
		transparent = false;
	}
	
	/**
	 * Construit une Texture à partir d'une chaîne de caractères, d'un Point et de deux entiers.
	 * <br /><br />
	 * La chaîne de caractères représente le chemin d'accès vers l'image.
	 * @param couleur Couleur de fond
	 * @param chemin Chaîne de caractères représente le chemin d'accès vers l'image.
	 * @param a	Point ( x min, y min )
	 * @param largeur int
	 * @param hauteur int
	 */
	public Texture ( Color couleur, String chemin, Point a, int largeur, int hauteur ) {
		
		super ( couleur, a, largeur, hauteur );
		
		try {
			
			URL url = getClass().getClassLoader().getResource ( chemin );
		    img = ImageIO.read ( url );
		}
		
		catch ( IOException e ) {
			
			System.out.println ("[!] Erreur : L'image est introuvable.\n" + e);
		}
		
		this.largeur = largeur;
		this.hauteur = hauteur;
		
		transparent = false;
	}
	
// Accesseurs //

	// Getter //
	
	/**
	 * Retourne l'image img.
	 * @return img Image
	 */
	public Image getImg () {
		
		return img;
	}
	
	/**
	 * Retourne la largeur de l'image.
	 * @return largeur Largeur de l'image
	 */
	public int getLargeur () {
		
		return largeur;
	}
	
	/**
	 * Retourne la hauteur de l'image.
	 * @return hauteur Hauteur de l'image
	 */
	public int getHauteur () {
		
		return hauteur;
	}
	
	/**
	 * Retourne la transparence de l'image.
	 * @return transparent Booléen
	 */
	public boolean getTransparent () {
		
		return transparent;
	}
	
	// Setter //
	
	/**
	 * Permet d'attribuer une image à img.<br />
	 * Setter par recopie.
	 * @param img Image
	 */
	public void setImg ( Image img ) {
		
		this.img = img;
	}
	
	/**
	 * Permet d'attribuer une image à img.<br />
	 * Créé une nouvelle image grâce au chemin indiqué en paramètre.
	 * @param chemin Chemin d'accès vers une image
	 */
	public void setImg ( String chemin ) {
		
		try {
			
			URL url = getClass().getClassLoader().getResource ( chemin );
		    img = ImageIO.read ( url );
		}
		
		catch ( IOException e ) {
			
			System.out.println ("[!] Erreur : L'image est introuvable.\n" + e);
		}
	}
	
	/**
	 * Permet d'attribuer une valeur à largeur.
	 * @param largeur int
	 */
	public void setLargeur ( int largeur ) {
		
		this.largeur = largeur;
	}
	
	/**
	 * Permet d'attribuer une valeur à hauteur.
	 * @param hauteur int
	 */
	public void setHauteur ( int hauteur ) {
		
		this.hauteur = hauteur;
	}
	
	/**
	 * Permet de rendre le fond de l'image transparent.
	 * @param transparent Booléen
	 */
	public void setTransparent ( boolean transparent ) {
		
		this.transparent = transparent;
	}

// Méthode //
	
	/**
	 * Implémentation de la méthode afficher() de la classe abstraite Dessin.<br />
	 * Elle permet d'afficher une Texture sur le Panneau.
	 * <br /><br />
	 * On vérifie d'abord si l'image est transparente ou non, puis on utilise la méthode drawImage adéquate.
	 * @param g Graphics.
	 */
	public void afficher ( Graphics g ) {
		
		if ( transparent )
			g.drawImage ( img, this.getA().getX(), (int)g.getClipBounds().getHeight()-this.getA().getY()-hauteur, largeur, hauteur, null );
		
		else
			g.drawImage ( img, this.getA().getX(), (int)g.getClipBounds().getHeight()-this.getA().getY()-hauteur, largeur, hauteur, getCouleur(), null );
	}
}
