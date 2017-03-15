import MG2D.*;

public class Application{
	//Attributs
	
	//Fenêtre de l'application
	private static Fenetre window = new Fenetre(ApplicationInfo.getGameTitle(), ApplicationInfo.getLargeurFenetre(), ApplicationInfo.getLongueurFenetre());
	
	//Périphériques
	//Vérif si static ou pas
	private static Clavier keyboard = new Clavier();
	private static Souris mouse = new Souris();


	//Accesseurs
	public static Fenetre getWindow(){
		return window;
	}

	public static Clavier getKeyboard(){
		return keyboard;
	}

	public static Souris getMouse(){
		return mouse;
	}


}