package MG2D;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Cette classe implémente les méthodes de KeyListener permettant la gestion du clavier.
 * <br /><br />
 * A la façon d'une borne d'arcade, elle ne gère uniquement les touches directionnelles, 6 raccourcis, la barre espace et le bouton entrée.<br />
 * Elle fonctionne sur le principe de booléen que l'on change quand on appuie ou relache les touches (true quand appuyé, false quand relaché).<br />
 * Si l'utilisateur souhaite implémenter la gestion de davantages de touches, il peut reprendre ce code et le modifier selon ses besoins.
 * @author Equipe 2D
 * @version 1.0
 */
public class Clavier implements KeyListener {

// Attributs //
	
	private boolean gauche;
	private boolean droite;
	private boolean haut;
	private boolean bas;
	
	private boolean espace;
	private boolean entree;
	
	private boolean a;
	private boolean z;
	private boolean e;
	private boolean q;
	private boolean s;
	private boolean d;
		
// Constructeur //
	
	/**
	 * Construit un Clavier et initialise les attributs à false.
	 */
	public Clavier () {
		
		gauche = droite = haut = bas = false;
		
		espace = entree = false;
		
		a = z = e = q = s = d = false;
	}
	
// Accesseurs //
	
	// Getter //
	
	/**
	 * Retourne la valeur du booléen correspondant la touche flêche Gauche.
	 * @return gauche Booléen correspondant la touche flêche Gauche.
	 */
	public boolean getGauche () {
		
		return gauche;
	}
	
	/**
	 * Retourne la valeur du booléen correspondant la touche flêche Droite.
	 * @return gauche Booléen correspondant la touche flêche Droite.
	 */
	public boolean getDroite () {
		
		return droite;
	}
	
	/**
	 * Retourne la valeur du booléen correspondant la touche flêche Haut.
	 * @return gauche Booléen correspondant la touche flêche Haut.
	 */
	public boolean getHaut () {
		
		return haut;
	}
	
	/**
	 * Retourne la valeur du booléen correspondant la touche flêche Bas.
	 * @return gauche Booléen correspondant la touche flêche Bas.
	 */
	public boolean getBas () {
		
		return bas;
	}
	
	/**
	 * Retourne la valeur du booléen correspondant la touche Espace.
	 * @return gauche Booléen correspondant la touche Espace.
	 */
	public boolean getEspace () {
		
		return espace;
	}
	
	/**
	 * Retourne la valeur du booléen correspondant la touche Entrée.
	 * @return gauche Booléen correspondant la touche Entrée.
	 */
	public boolean getEntree () {
		
		return entree;
	}
	
	/**
	 * Retourne la valeur du booléen correspondant la touche A.
	 * @return gauche Booléen correspondant la touche A.
	 */
	public boolean getA () {
		
		return a;
	}
	
	/**
	 * Retourne la valeur du booléen correspondant la touche Z.
	 * @return gauche Booléen correspondant la touche Z.
	 */
	public boolean getZ () {
		
		return z;
	}
	
	/**
	 * Retourne la valeur du booléen correspondant la touche E.
	 * @return gauche Booléen correspondant la touche E.
	 */
	public boolean getE () {
		
		return e;
	}
	
	/**
	 * Retourne la valeur du booléen correspondant la touche Q.
	 * @return gauche Booléen correspondant la touche Q.
	 */
	public boolean getQ () {
		
		return q;
	}
	
	/**
	 * Retourne la valeur du booléen correspondant la touche S.
	 * @return gauche Booléen correspondant la touche S.
	 */
	public boolean getS () {
		
		return s;
	}
	
	/**
	 * Retourne la valeur du booléen correspondant la touche D.
	 * @return gauche Booléen correspondant la touche D.
	 */
	public boolean getD () {
		
		return d;
	}
		
	// Setter //
	
	/**
	 * Permet d'attribuer un booléen à l'attribut gauche.
	 * @param gauche Booléen.
	 */
	public void setGauche ( boolean gauche ) {
		
		this.gauche = gauche;
	}
	
	/**
	 * Permet d'attribuer un booléen à l'attribut droite.
	 * @param droite Booléen.
	 */
	public void setDroite ( boolean droite ) {
		
		this.droite = droite;
	}
	
	/**
	 * Permet d'attribuer un booléen à l'attribut haut.
	 * @param haut Booléen.
	 */
	public void setHaut( boolean haut ) {
		
		this.haut = haut;
	}
	
	/**
	 * Permet d'attribuer un booléen à l'attribut bas.
	 * @param bas Booléen.
	 */
	public void setBas ( boolean bas ) {
		
		this.bas = bas;
	}
	
	/**
	 * Permet d'attribuer un booléen à l'attribut espace.
	 * @param espace Booléen.
	 */
	public void setEspace ( boolean espace ) {
		
		this.espace = espace;
	}
	
	/**
	 * Permet d'attribuer un booléen à l'attribut entree.
	 * @param entree Booléen.
	 */
	public void setEntree ( boolean entree ) {
		
		this.entree = entree;
	}
	
	/**
	 * Permet d'attribuer un booléen à l'attribut a.
	 * @param a Booléen.
	 */
	public void setA ( boolean a ) {
		
		this.a = a;
	}
	
	/**
	 * Permet d'attribuer un booléen à l'attribut z.
	 * @param z Booléen.
	 */
	public void setZ ( boolean z ) {
		
		this.z = z;
	}
	
	/**
	 * Permet d'attribuer un booléen à l'attribut e.
	 * @param e Booléen.
	 */
	public void setE ( boolean e ) {
		
		this.e = e;
	}
	
	/**
	 * Permet d'attribuer un booléen à l'attribut q.
	 * @param q Booléen.
	 */
	public void setQ ( boolean q ) {
		
		this.q = q;
	}
	
	/**
	 * Permet d'attribuer un booléen à l'attribut s.
	 * @param s Booléen.
	 */
	public void setS ( boolean s ) {
		
		this.s = s;
	}
	
	/**
	 * Permet d'attribuer un booléen à l'attribut d.
	 * @param d Booléen.
	 */
	public void setD ( boolean d ) {
		
		this.d = d;
	}
		
// Méthodes //
	
	/**
	 * Implémentation de la méthode KeyReleased.
	 * <br /><br />
	 * Elle permet de mettre à false la valeur des attributs quand l'on relache la touche correspondante.
	 */
	public void keyReleased ( KeyEvent k ) {
		
		switch ( k.getKeyCode() ) {
		
			case KeyEvent.VK_LEFT :
				gauche = false;				
				break;
				
			case KeyEvent.VK_RIGHT :
				droite = false;				
				break;	
				
			case KeyEvent.VK_UP :
				haut = false;
				break;
				
			case KeyEvent.VK_DOWN :
				bas = false;				
				break;
				
			case KeyEvent.VK_SPACE :
				espace = false;			
				break;
			
			case KeyEvent.VK_ENTER :
				entree = false;
				break;
				
			case KeyEvent.VK_A :
				a = false;			
				break;
			
			case KeyEvent.VK_Z :
				z = false;			
				break;
			
			case KeyEvent.VK_E :
				e = false;			
				break;
				
			case KeyEvent.VK_Q :
				q = false;			
				break;
				
			case KeyEvent.VK_S :
				s = false;			
				break;
				
			case KeyEvent.VK_D :
				d = false;			
				break;
		}		
	}
	
	/**
	 * Implémentation de la méthode KeyTyped.
	 * <br /><br />
	 * Cette méthode est vide car elle ne nous sert pas dans notre moteur.
	 */
	public void keyTyped ( KeyEvent k ) {}
	
	/**
	 * Implémentation de la méthode KeyPressed.
	 * <br /><br />
	 * Elle permet de mettre à true la valeur des attributs quand l'on relache la touche correspondante.
	 */
	public void keyPressed ( KeyEvent k ) {
		
		switch ( k.getKeyCode() ) {
		
			case KeyEvent.VK_LEFT :
				gauche = true;				
				break;
				
			case KeyEvent.VK_RIGHT :
				droite = true;				
				break;	
				
			case KeyEvent.VK_UP :
				haut = true;
				break;
				
			case KeyEvent.VK_DOWN :
				bas = true;				
				break;
				
			case KeyEvent.VK_SPACE :
				espace = true;			
				break;
				
			case KeyEvent.VK_ENTER :
				entree = true;
				break;
				
			case KeyEvent.VK_A :
				a = true;			
				break;
			
			case KeyEvent.VK_Z :
				z = true;			
				break;
			
			case KeyEvent.VK_E :
				e = true;			
				break;
				
			case KeyEvent.VK_Q :
				q = true;			
				break;
				
			case KeyEvent.VK_S :
				s = true;			
				break;
				
			case KeyEvent.VK_D :
				d = true;			
				break;
		}		
	}
}
