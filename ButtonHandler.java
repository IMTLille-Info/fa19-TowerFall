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
		switch(key.getKeyCode()){
		//Player 1
		case KeyEvent.VK_UP:
			Map.avatars.get(0).setUp(false);
			break;
		case KeyEvent.VK_DOWN:
			Map.avatars.get(0).setDown(false);
			break;
		case KeyEvent.VK_LEFT:
			Map.avatars.get(0).setLeft(false);
			break;
		case KeyEvent.VK_RIGHT:
			Map.avatars.get(0).setRight(false);
			break;
		case KeyEvent.VK_CONTROL:
			Map.avatars.get(0).setShoot(false);
			break;
			
		//Player 2
		case KeyEvent.VK_Z:
			Map.avatars.get(1).setUp(false);
			break;
		case KeyEvent.VK_S:
			Map.avatars.get(1).setDown(false);
			break;
		case KeyEvent.VK_Q:
			Map.avatars.get(1).setLeft(false);
			break;
		case KeyEvent.VK_D:
			Map.avatars.get(1).setRight(false);
			break;
		case KeyEvent.VK_SPACE:
			Map.avatars.get(1).setShoot(false);
			break;
//			
//		//Player 3
//		case KeyEvent.VK_I:
//			Map.avatars.get(2).setUp(false);
//			break;
//		case KeyEvent.VK_K:
//			Map.avatars.get(2).setDown(false);
//			break;
//		case KeyEvent.VK_J:
//			Map.avatars.get(2).setLeft(false);
//			break;
//		case KeyEvent.VK_L:
//			Map.avatars.get(2).setRight(false);
//			break;
//		case KeyEvent.VK_EXCLAMATION_MARK:
//			Map.avatars.get(2).setShoot(false);
//			break;
//			
//			
//		//Player 4
//		case KeyEvent.VK_NUMPAD8:
//			Map.avatars.get(3).setUp(false);
//			break;
//		case KeyEvent.VK_NUMPAD5:
//			Map.avatars.get(3).setDown(false);
//			break;
//		case KeyEvent.VK_NUMPAD4:
//			Map.avatars.get(3).setLeft(false);
//			break;
//		case KeyEvent.VK_NUMPAD6:
//			Map.avatars.get(3).setRight(false);
//			break;
//		case KeyEvent.VK_NUMPAD0:
//			Map.avatars.get(3).setShoot(false);
//			break;
		}
	}
	
	public void keyPressed(KeyEvent key){
		switch(key.getKeyCode()){
		
		//Player 1
		case KeyEvent.VK_UP:   //JUMP
			Map.avatars.get(0).setUp(true);
			Map.avatars.get(0).setLastDirection(Avatar.direct.UP);
			break;
		case KeyEvent.VK_LEFT:
			Map.avatars.get(0).setLeft(true);
			Map.avatars.get(0).setLastDirection(Avatar.direct.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			Map.avatars.get(0).setRight(true);
			Map.avatars.get(0).setLastDirection(Avatar.direct.RIGHT);
			break;
		case KeyEvent.VK_DOWN:
			Map.avatars.get(0).setDown(true);
			Map.avatars.get(0).setLastDirection(Avatar.direct.DOWN);
			break;
		case KeyEvent.VK_CONTROL:
			Map.avatars.get(0).setShoot(true);
			System.out.println("SHOOT");
			break;
			

		//Player 2
		case KeyEvent.VK_Z:   //JUMP
			Map.avatars.get(1).setUp(true);
			Map.avatars.get(1).setLastDirection(Avatar.direct.UP);
			break;
		case KeyEvent.VK_Q:
			Map.avatars.get(1).setLeft(true);
			Map.avatars.get(1).setLastDirection(Avatar.direct.LEFT);
			break;
		case KeyEvent.VK_D:
			Map.avatars.get(1).setRight(true);
			Map.avatars.get(1).setLastDirection(Avatar.direct.RIGHT);
			break;
		case KeyEvent.VK_S:
			Map.avatars.get(1).setDown(true);
			Map.avatars.get(1).setLastDirection(Avatar.direct.DOWN);
			break;
		case KeyEvent.VK_SPACE:
			Map.avatars.get(1).setShoot(true);
			System.out.println("SHOOT");
			break;
//
//		//Player 3
//		case KeyEvent.VK_I:   //JUMP
//			Map.avatars.get(2).setUp(true);
//			Map.avatars.get(2).setLastDirection(Player.direct.UP);
//			break;
//		case KeyEvent.VK_J:
//			Map.avatars.get(2).setLeft(true);
//			Map.avatars.get(2).setLastDirection(Player.direct.LEFT);
//			break;
//		case KeyEvent.VK_L:
//			Map.avatars.get(2).setRight(true);
//			Map.avatars.get(2).setLastDirection(Player.direct.RIGHT);
//			break;
//		case KeyEvent.VK_K:
//			Map.avatars.get(2).setLastDirection(Player.direct.DOWN);
//			break;
//		case KeyEvent.VK_EXCLAMATION_MARK:
//			Map.avatars.get(2).setShoot(true);
//			break;
//				
//
//		//Player 4
//		case KeyEvent.VK_NUMPAD8:   //JUMP
//			Map.avatars.get(3).setUp(true);
//			Map.avatars.get(3).setLastDirection(Player.direct.UP);
//			break;
//		case KeyEvent.VK_NUMPAD4:
//			Map.avatars.get(3).setLeft(true);
//			Map.avatars.get(3).setLastDirection(Player.direct.LEFT);
//			break;
//		case KeyEvent.VK_NUMPAD6:
//			Map.avatars.get(3).setRight(true);
//			Map.avatars.get(3).setLastDirection(Player.direct.RIGHT);
//			break;
//		case KeyEvent.VK_NUMPAD5:
//			Map.avatars.get(3).setLastDirection(Player.direct.DOWN);
//			break;
//		case KeyEvent.VK_NUMPAD0:
//			Map.avatars.get(3).setShoot(true);
//			break;
//					
		}
	}
}
