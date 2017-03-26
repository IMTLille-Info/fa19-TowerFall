import MG2D.*;

public class Application{

	// --------------------- Attributes --------------------- //
	private static MyFenetre window = new MyFenetre(ApplicationInfo.getGameTitle(), ApplicationInfo.getLargeurFenetre(), ApplicationInfo.getLongueurFenetre());
	private static ButtonHandler keyboard = new ButtonHandler();


	// ------------------- Constructeurs -------------------- //
	public Application(){
		window.addKeyListener(keyboard);
	}


	// --------------------- Accesseurs --------------------- //
	public static MyFenetre getMyFenetre(){
		return window;
	}

}