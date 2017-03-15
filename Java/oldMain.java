import MG2D.*;
import MG2D.geometrie.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;

public class Main{

//Font
	private static Font calibri = new Font("Calibri", Font.TYPE1_FONT, 20);


	//Fenetre de jeu//
	private final static int largeur = 1080; 
	private final static int hauteur = 720;  
	static Fenetre f = new Fenetre ("Shoot them all", largeur, hauteur);
	static BoiteEnglobante bordsGauche = new BoiteEnglobante (new Point(0,0), new Point(1, hauteur));
	static BoiteEnglobante bordsDroit = new BoiteEnglobante (new Point(largeur-10,0), new Point(200, hauteur));
	static BoiteEnglobante bordsHaut = new BoiteEnglobante (new Point(0, hauteur+50), new Point(largeur, 1));

	//Periphériques//
	private static Clavier clavier = new Clavier();
	private static Souris souris = new Souris();

	//Background//
	private static Texture background = new Texture ("img/background.png", new Point (0,0), new Point(largeur, hauteur));
	private static int hauteurSol = 120;
	private static BoiteEnglobante boiteSol = new BoiteEnglobante (new Point(0,0), new Point(largeur,hauteurSol));
	public static void main(String[] args){
		f.addKeyListener(clavier);
		f.addMouseListener(souris);
				f.getP().addMouseListener(souris);
		f.getP().addMouseMotionListener(souris);

		f.ajouter(background);
	}
}