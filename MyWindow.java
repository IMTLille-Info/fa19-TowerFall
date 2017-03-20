import MG2D.*;
import MG2D.geometrie.*;
import java.io.*;



public class MyWindow extends Fenetre{

  private Panneau p;

  public MyWindow(String title, int width, int height){
    super(title,width,height);
    this.p = p;
    rafraichir();
  }

  public MyWindow(String title, int width, int height, Panneau p){
    super(title,width,height);
    this.p = p;
    rafraichir();
  }

  public Panneau getP(){
    return this.p;
  }

  public void setP(Panneau p){
    this.p = p;
  }

  public void loadMap(String urlToFichierMap){
    this.effacer();
    this.p = new Map("media/Map1.txt");
    
    //for each dessin dans la ArrayList on l'ajoute
    for(Dessin d : this.p.getA()){
      this.ajouter(d);
    }

    this.rafraichir();
  }
}
