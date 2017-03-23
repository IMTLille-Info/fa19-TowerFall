
import java.util.ArrayList;
import MG2D.*;
import MG2D.geometrie.*;

public class Main{
  public static void main(String[] args) {

    //MyFenetre f = new MyFenetre("TEST", 1080, 720);
    //f.loadMap(ApplicationInfo.getPathMedia() + "Map1.txt");
    Application app = new Application();
    Application.getMyFenetre().loadMap(ApplicationInfo.getPathMedia() + "Map1.txt");
    Map.updateMap();
  }
}
