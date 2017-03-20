package MG2D;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import MG2D.geometrie.Point;

/**
 * Cette classe implemente les methodes de MouseListener permettant la gestion de la souris.
 * <br /><br />
 * TODO descritpion de la classe Souris
 * @author Remi Synave
 * @version 0.1
 */

public class Souris implements MouseListener, MouseMotionListener {
    
    // Attributs //
    
    private boolean boutonGaucheEnfonce;
    private boolean boutonMilieuEnfonce;
    private boolean boutonDroitEnfonce;
    private boolean clicGauche;
    private boolean clicDroit;
    private boolean clicMilieu;
    private Point position;
    private int tailleY;

    // Constructeur //
    public Souris () {
	clicGauche=false;
	clicDroit=false;
	clicMilieu=false;
	boutonGaucheEnfonce=false;
	boutonDroitEnfonce=false;
	boutonMilieuEnfonce=false;
	position = new Point(-1,-1);
	tailleY=0;
    }

    public Souris (int taille) {
	clicGauche=false;
	clicDroit=false;
	clicMilieu=false;
	boutonGaucheEnfonce=false;
	boutonDroitEnfonce=false;
	boutonMilieuEnfonce=false;
	position = new Point(-1,-1);
	tailleY=taille;
    }
    
    public void mouseEntered(MouseEvent e) {
    }
    
    public void mouseExited(MouseEvent e) {
    }
    
    public void mousePressed(MouseEvent e) {
	switch ( e.getButton() ) {
	case MouseEvent.BUTTON1 :
	    boutonGaucheEnfonce=true;
	    break;
	    
	case MouseEvent.BUTTON2 :
	    boutonMilieuEnfonce=true;
	    break;
	    
	case MouseEvent.BUTTON3 :
	    boutonDroitEnfonce=true;
	    break;
	}
    }
    
    public void mouseReleased(MouseEvent e) {
	switch ( e.getButton() ) {
	case MouseEvent.BUTTON1 :
	    boutonGaucheEnfonce=false;
	    break;
	    
	case MouseEvent.BUTTON2 :
	    boutonMilieuEnfonce=false;
	    break;
	    
	case MouseEvent.BUTTON3 :
	    boutonDroitEnfonce=false;
	    break;
	}
    }
    
    public void mouseClicked(MouseEvent e) {
	switch ( e.getButton() ) {
	case MouseEvent.BUTTON1 :
	    clicGauche=true;
	    break;
	    
	case MouseEvent.BUTTON2 :
	    clicMilieu=true;
	    break;
	    
	case MouseEvent.BUTTON3 :
	    clicDroit=true;
	    break;
	}
    }

    public boolean getClicGauche(){
	boolean aretourner=clicGauche;
	clicGauche=false;
	return aretourner;
    }
    
    public boolean getClicMilieu(){
	boolean aretourner=clicMilieu;
	clicMilieu=false;
	return aretourner;
    }
    
    public boolean getClicDroit(){
	boolean aretourner=clicDroit;
	clicDroit=false;
	return aretourner;
    }

    public boolean getBoutonGaucheEnfonce(){
	return boutonGaucheEnfonce;
    }
    
    public boolean getBoutonMilieuEnfonce(){
	return boutonMilieuEnfonce;
    }
    
    public boolean getBoutonDroitEnfonce(){
	return boutonDroitEnfonce;
    }

    public Point getPosition(){return position;}

    public void mouseDragged(MouseEvent e){}
    
    public void mouseMoved(MouseEvent e){
	position.setX(e.getX());
	position.setY(tailleY-e.getY());
    }
}
