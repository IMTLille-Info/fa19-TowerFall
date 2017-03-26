public class ApplicationInfo{
	private static final String gameTitle = new String("Unicorn Land");
	private static final Integer largeurFenetre = new Integer(1080);
	private static final Integer longueurFenetre = new Integer(720);
	private static final String pathMedia = new String("media/");

	//Accesseurs
	public static String getGameTitle(){
		return gameTitle;
	}

		public static Integer getLargeurFenetre(){
		return largeurFenetre;
	}

		public static Integer getLongueurFenetre(){
		return longueurFenetre;
	}

		public static String getPathMedia(){
		return pathMedia;
	}
}
