import MG2D.*;
import MG2D.geometrie.*;
import java.io.*;



public class MyFenetre extends Fenetre{

  private Panneau p;

  public MyFenetre(String title, int width, int height){
    super(title,width,height);
    rafraichir();
  }

  public Panneau getP(){
    return this.p;
  }

  public void setP(Panneau p){
    this.p = p;
  }

  //permet de charger la Map en passant par la méthode loadMap de Mypanneau
  public void loadMap(String urlToFichierMap){
    this.effacer();
    this.p = new Map(urlToFichierMap);
    //this.p = new MyPanneau();
    //this.p.loadMap(urlToFichierMap);

    //for each dessin dans la ArrayList on l'ajoute
    for(Dessin d : this.p.getA()){
      this.ajouter(d);
    }

    this.rafraichir();
  }
}
