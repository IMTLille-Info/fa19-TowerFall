import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class ButtonHandler extends KeyAdapter{
	
	// --------------------- Attributes --------------------- //
	
	// --------------------- Getters & Setters --------------------- //

	// --------------------- Functions --------------------- //
	
	public ButtonHandler(){
		System.out.println(" Button handler initialised ! ");
	}
	
	public void keyTyped(KeyEvent arg0){
		
	}
	
	public void keyReleased(KeyEvent key){
		int keyCode = key.getKeyCode();
		
		//J1
		if (keyCode == Setting.J1_UP) {
			Map.avatars.get(0).setUp(false);
		} else if (keyCode == Setting.J1_DOWN) {
			Map.avatars.get(0).setDown(false);
		} else if (keyCode == Setting.J1_LEFT) {
			Map.avatars.get(0).setLeft(false);
		} else if (keyCode == Setting.J1_RIGHT) {
			Map.avatars.get(0).setRight(false);
		} else if (keyCode == Setting.J1_ACTION) {
			Map.avatars.get(0).setShoot(false);
		}
		//J2
		else if (keyCode == Setting.J2_UP) {
			Map.avatars.get(1).setUp(false);
		} else if (keyCode == Setting.J2_DOWN) {
			Map.avatars.get(1).setDown(false);
		} else if (keyCode == Setting.J2_LEFT) {
			Map.avatars.get(1).setLeft(false);
		} else if (keyCode == Setting.J2_RIGHT) {
			Map.avatars.get(1).setRight(false);
		} else if (keyCode == Setting.J2_ACTION) {
			Map.avatars.get(1).setShoot(false);
		}
		//J3
		else if (keyCode == Setting.J3_UP) {
			Map.avatars.get(2).setUp(false);
		} else if (keyCode == Setting.J3_DOWN) {
			Map.avatars.get(2).setDown(false);
		} else if (keyCode == Setting.J3_LEFT) {
			Map.avatars.get(2).setLeft(false);
		} else if (keyCode == Setting.J3_RIGHT) {
			Map.avatars.get(2).setRight(false);
		} else if (keyCode == Setting.J3_ACTION) {
			Map.avatars.get(2).setShoot(false);
		}
		//J4
		else if (keyCode == Setting.J4_UP) {
			Map.avatars.get(3).setUp(false);
		} else if (keyCode == Setting.J4_DOWN) {
			Map.avatars.get(3).setDown(false);
		} else if (keyCode == Setting.J4_LEFT) {
			Map.avatars.get(3).setLeft(false);
		} else if (keyCode == Setting.J4_RIGHT) {
			Map.avatars.get(3).setRight(false);
		} else if (keyCode == Setting.J4_ACTION) {
			Map.avatars.get(3).setShoot(false);
		}
	}
	
	public void keyPressed(KeyEvent key){
		int keyCode = key.getKeyCode();
		
		//J1
		if (keyCode == Setting.J1_UP) {
			Map.avatars.get(0).setUp(true);
			Map.avatars.get(0).setLastDirection(Avatar.direct.UP);
		} else if (keyCode == Setting.J1_LEFT) {
			Map.avatars.get(0).setLeft(true);
			Map.avatars.get(0).setLastDirection(Avatar.direct.LEFT);
		} else if (keyCode == Setting.J1_RIGHT) {
			Map.avatars.get(0).setRight(true);
			Map.avatars.get(0).setLastDirection(Avatar.direct.RIGHT);
		} else if (keyCode == Setting.J1_DOWN) {
			Map.avatars.get(0).setDown(true);
			Map.avatars.get(0).setLastDirection(Avatar.direct.DOWN);
		} else if (keyCode == Setting.J1_ACTION) {
			Map.avatars.get(0).setShoot(true);
			System.out.println("SHOOT");
		} 
		//J2
		else if (keyCode == Setting.J2_UP) {
			Map.avatars.get(1).setUp(true);
			Map.avatars.get(1).setLastDirection(Avatar.direct.UP);
		} else if (keyCode == Setting.J2_LEFT) {
			Map.avatars.get(1).setLeft(true);
			Map.avatars.get(1).setLastDirection(Avatar.direct.LEFT);
		} else if (keyCode == Setting.J2_RIGHT) {
			Map.avatars.get(1).setRight(true);
			Map.avatars.get(1).setLastDirection(Avatar.direct.RIGHT);
		} else if (keyCode == Setting.J2_DOWN) {
			Map.avatars.get(1).setDown(true);
			Map.avatars.get(1).setLastDirection(Avatar.direct.DOWN);
		} else if (keyCode == Setting.J2_ACTION) {
			Map.avatars.get(1).setShoot(true);
			System.out.println("SHOOT");
		} 
		//J3
		else if (keyCode == Setting.J3_UP) {
			Map.avatars.get(2).setUp(true);
			Map.avatars.get(2).setLastDirection(Avatar.direct.UP);
		} else if (keyCode == Setting.J3_LEFT) {
			Map.avatars.get(2).setLeft(true);
			Map.avatars.get(2).setLastDirection(Avatar.direct.LEFT);
		} else if (keyCode == Setting.J3_RIGHT) {
			Map.avatars.get(2).setRight(true);
			Map.avatars.get(2).setLastDirection(Avatar.direct.RIGHT);
		} else if (keyCode == Setting.J3_DOWN) {
			Map.avatars.get(2).setLastDirection(Avatar.direct.DOWN);
		} else if (keyCode == Setting.J3_ACTION) {
			Map.avatars.get(2).setShoot(true);
		}
		//J4
		else if (keyCode == Setting.J4_UP) {
			Map.avatars.get(3).setUp(true);
			Map.avatars.get(3).setLastDirection(Avatar.direct.UP);
		} else if (keyCode == Setting.J4_LEFT) {
			Map.avatars.get(3).setLeft(true);
			Map.avatars.get(3).setLastDirection(Avatar.direct.LEFT);
		} else if (keyCode == Setting.J4_RIGHT) {
			Map.avatars.get(3).setRight(true);
			Map.avatars.get(3).setLastDirection(Avatar.direct.RIGHT);
		} else if (keyCode == Setting.J4_DOWN) {
			Map.avatars.get(3).setLastDirection(Avatar.direct.DOWN);
		} else if (keyCode == Setting.J4_ACTION) {
			Map.avatars.get(3).setShoot(true);
		}
	}
}
