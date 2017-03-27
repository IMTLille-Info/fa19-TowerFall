import MG2D.*;
import MG2D.geometrie.*;
import java.util.List;

import java.util.ArrayList;
import java.nio.file.*;
import java.nio.charset.*;
import java.io.IOException;

public class Map extends Panneau{

  // --------------------- Attributes --------------------- //
  public static List<Avatar> avatars = new ArrayList<Avatar>();
  public static List<Bullet> bullets = new ArrayList<Bullet>();
  public static List<Obstacle> obstacles = new ArrayList<Obstacle>();
  public static int playersAlive;

  //longueur d'une case de la grille, la texture aura la même taille
  private int WidthCase = 40;
  private int HeightCase = 40;

  // ------------------- Constructeurs -------------------- //

    public Map(){
      super();
    }

    public Map(ArrayList < Dessin > a){
      super(a);
    }


    public Map(String urlToFichierMap){
      super();
      //Background
        this.ajouter(new Texture(ApplicationInfo.getPathMedia() + "bground.jpg", new Point(0,0), 1080,720));

      try{
        //Transforme un fichier texte en string
        String text = this.readFile(urlToFichierMap,Charset.defaultCharset());
        this.buildMap(text);

        //On compte le nombre de joueurs dans la partie
        playersAlive = avatars.size();

      }catch(IOException e){
      }
    }

  // ------------------- Méthodes -------------------- //


    private String readFile(String path, Charset encoding) throws IOException{
      byte[] encoded = Files.readAllBytes(Paths.get(path));
      return new String(encoded, encoding);
    }

    //Charge des texture pour former une map
    //0 represente le vide
    //1 un obstacle
    //2 la position du joueur 1
    //3 la position du joueur 2
    private void buildMap(String text){

      //init les compteurs
      int compteur = 0;
      int posX = 20;
      int posY = 500;
      for(char c : text.toCharArray()){
        c = text.charAt(compteur);
        if (c == '0')
        {
          posX = posX + WidthCase;
        }

        if(c == '1'){
          Obstacle obs = new Obstacle(ApplicationInfo.getPathMedia() + "cube.jpeg", new Point(posX,posY), WidthCase,HeightCase);
          this.ajouter(obs);
          obstacles.add(obs);
          posX = posX + WidthCase;
        }

        if(c == '2'){
          avatars.add(new Avatar(ApplicationInfo.getPathMedia() + "J2.gif", new Point(posX, posY), WidthCase*2, HeightCase*2, 0));
          this.ajouter(avatars.get(0));
          posX = posX + WidthCase;
        }

        if (c =='3'){
          avatars.add(new Avatar(ApplicationInfo.getPathMedia() + "J2.gif", new Point(posX, posY), WidthCase*2, HeightCase*2, 1));
          this.ajouter(avatars.get(1));
          posX = posX + WidthCase;
        }

        if (c == '\n'){
            posX = 20;
            posY = posY - HeightCase;
        }

        compteur++;
      }
    }

    public static void updateMap(){
      while(true){
        for(int i = 0 ; i < avatars.size(); i++){
          avatars.get(i).update();
        }
        for(int i = 0 ; i < bullets.size(); i++){
          bullets.get(i).update();
          Application.getMyFenetre().ajouter(bullets.get(i));
        }
        touchBullet();
        if(playersAlive<=1){
          //Condiiton de win(a replacer dans une autre classe je pense)
          break;
        }
        Application.getMyFenetre().rafraichir();
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }

    public static void touchBullet(){
      for ( int i = 0 ; i < bullets.size() ; i++ ){
        for (int j = 0 ; j < avatars.size() ; j++){
          if(avatars.get(j).getBoiteEnglobante().intersection(bullets.get(i).getBoiteEnglobante())){
            System.out.println("Bullet = xA : " + bullets.get(i).getA().getX() + " yA : " + bullets.get(i).getA().getY() + " xB : " + bullets.get(i).getB().getX() + " yB : " + bullets.get(i).getB().getY());
            bullets.get(i).setTransparent(false);
            bullets.remove(i);
            avatars.get(j).setLife(avatars.get(j).getLife()-1);
            System.out.println("Avatar = xA : " + avatars.get(j).getA().getX() + " yA : " + avatars.get(j).getA().getY() + " xB : " + avatars.get(j).getB().getX() + " yB : " + avatars.get(j).getB().getY());
            break;
          }
        }
      }
    }


}
