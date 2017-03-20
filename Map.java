import MG2D.*;
import MG2D.geometrie.*;

import java.util.ArrayList;
import java.nio.file.*;
import java.nio.charset.*;
import java.io.IOException;

public class Map extends Panneau{

    public Map(){
      super();
    }

    public Map(ArrayList < Dessin > a){
      super(a);
    }

    //Charge des texture pour former une map
    //0 represente le vide
    //1 un obstacle
    //2 la position du joueur 1
    //3 la position du joueur 2
    public Map(String urlToFichierMap){
      super();

      try{
        //longueur d'une case de la grille, la texture aura la même taille
        int WidthCase = 40;
        int HeightCase = 40;

        //Transforme un fichier texte en string
        String text = this.readFile(urlToFichierMap,Charset.defaultCharset());

        //init les
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
            this.ajouter(new Texture("media/cube.jpeg", new Point(posX,posY), WidthCase,HeightCase));
            posX = posX + WidthCase;
          }

          if(c == '2'){
            this.ajouter(new Texture("media/J1.gif", new Point(posX,posY), WidthCase,HeightCase));
            posX = posX + WidthCase;
          }

          if (c =='3'){
            this.ajouter(new Texture("media/J2.gif", new Point(posX,posY), WidthCase,HeightCase));
            posX = posX + WidthCase;
          }

          if (c == '\n'){
              posX = 20;
              posY = posY - HeightCase;
          }

          compteur++;
        }
      }catch(IOException e){
      }
    }

    static String readFile(String path, Charset encoding) throws IOException{
      byte[] encoded = Files.readAllBytes(Paths.get(path));
      return new String(encoded, encoding);
    }
}
