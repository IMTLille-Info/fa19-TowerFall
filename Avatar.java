import MG2D.geometrie.Point;
import MG2D.geometrie.Texture;

public class Avatar extends Texture{

	
	// --------------------- Attributes --------------------- //
	private int numPlayer;
	
	int life;
	
	private boolean left, right, up, down, shoot;
	public enum direct{UP, DOWN, LEFT, RIGHT};

	private double speedFall = 0;
	private double speedJump = 0;
	private boolean jump = false;
	private direct lastDirection;
	private long lastShot = 0; 
	
	
	// --------------------- Getters & Setters --------------------- //
	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public int getNumPlayer() {
		return numPlayer;
	}

	public void setNumPlayer(int numPlayer) {
		this.numPlayer = numPlayer;
	}

	public double getSpeedFall() {
		return speedFall;
	}

	public void setSpeedFall(double speedFall) {
		this.speedFall = speedFall;
	}

	public double getSpeedJump() {
		return speedJump;
	}

	public void setSpeedJump(double speedJump) {
		this.speedJump = speedJump;
	}

	public boolean isJump() {
		return jump;
	}

	public void setJump(boolean jump) {
		this.jump = jump;
	}

	public direct getLastDirection() {
		return lastDirection;
	}

	public void setLastDirection(direct lastDirection) {
		this.lastDirection = lastDirection;
	}

	public long getLastShot() {
		return lastShot;
	}

	public void setLastShot(long lastShot) {
		this.lastShot = lastShot;
	}
	
	public boolean isShoot() {
		return shoot;
	}

	public void setShoot(boolean shoot) {
		this.shoot = shoot;
	}
	
	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
		if(life<=0){
			Map.playersAlive--;
		}
	}
	
	
	// --------------------- Functions --------------------- //
	public Avatar(String chemin, Point p, int largeur, int hauteur, int numPlayer){
		super(chemin, p, largeur, hauteur);
		this.numPlayer=numPlayer;
		this.life = 1;
	}
	
	public void update(){
		move();
		shoot();
	}
	
	public void touchBullet(){
		for ( int i = 0 ; i < Map.bullets.size() ; i++ ){
			if(this.getBoiteEnglobante().intersection(Map.bullets.get(i).getBoiteEnglobante())){
				Map.bullets.remove(i);
			}
		}
	}
	
	public void move(){
		if(life>0){
			if(left){
				if(this.getA().getX()-2 > 0){
					this.getA().setX(this.getA().getX()-2);
					this.getB().setX(this.getB().getX()-2);
				}
			}
			if(right){
				if(this.getB().getX()+2 < Application.getMyFenetre().getWidth()-6){
					this.getA().setX(this.getA().getX()+2);
					this.getB().setX(this.getB().getX()+2);
				}
			}
			//Jump
			if(jump){
				this.getA().setY(this.getA().getY()+(int)speedJump);
				this.getB().setY(this.getB().getY()+(int)speedJump);
				speedJump -= 0.1;
				if(speedJump <= 0){
					speedJump = 0;
					jump = false;
				}
			}
			else if(up && speedFall == 0){
				jump = true;
				speedJump = 6;
			}
			
			
			//Fall
			if(!jump && this.getA().getY() == 0){
				speedFall = 0;
			}
			else if(!jump && this.getA().getY() > 0){
				if(this.getA().getY()-speedFall <= 0){
					this.getA().setY(0);
					this.getB().setY(0+this.getHauteur());
				}
				if(this.getA().getY()-speedFall > 0){
					if(speedFall == 0)
						speedFall = 1;
					this.getA().setY(this.getA().getY()-(int)speedFall);
					this.getB().setY(this.getB().getY()-(int)speedFall);
					speedFall+=0.1;
				}
			}
		}
		else{
			if(jump){
				this.getA().setY(this.getA().getY()+(int)speedJump);
				this.getB().setY(this.getB().getY()+(int)speedJump);
				speedJump -= 0.1;
				if(speedJump <= 0){
					speedJump = 0;
					jump = false;
				}
			}
			
			//Fall
			if(!jump && this.getA().getY() == 0){
				speedFall = 0;
			}
			else if(!jump && this.getA().getY() > 0){
				if(this.getA().getY()-speedFall <= 0){
					this.getA().setY(0);
					this.getB().setY(0+this.getHauteur());
				}
				if(this.getA().getY()-speedFall > 0){
					if(speedFall == 0)
						speedFall = 1;
					this.getA().setY(this.getA().getY()-(int)speedFall);
					this.getB().setY(this.getB().getY()-(int)speedFall);
					speedFall+=0.1;
				}
			}
		}
		

	}
	
	public void shoot(){
		if(life>0){
			if(shoot && lastShot == 0){
				if(left && right){
					if(lastDirection==direct.LEFT)
						Map.bullets.add(new Bullet("SpearLeft.png", this.getNumPlayer(),22,4));
					if(lastDirection==direct.RIGHT)
						Map.bullets.add(new Bullet("SpearRight.png", this.getNumPlayer(),22,4));
				}
				else if (left)
					Map.bullets.add(new Bullet("SpearLeft.png", this.getNumPlayer(),22,4));
				else if(right)
					Map.bullets.add(new Bullet("SpearRight.png", this.getNumPlayer(),22,4));
				
				else if(up && down){
					if(lastDirection==direct.UP)
						Map.bullets.add(new Bullet("SpearUp.png", this.getNumPlayer(),4,22));
					if(lastDirection==direct.DOWN)
						Map.bullets.add(new Bullet("SpearDown.png", this.getNumPlayer(),4,22));
				}
				else if (up)
					Map.bullets.add(new Bullet("SpearUp.png", this.getNumPlayer(),4,22));
				else if(down)
					Map.bullets.add(new Bullet("SpearDown.png", this.getNumPlayer(),4,22));
				else{
					if(lastDirection==direct.LEFT)
						Map.bullets.add(new Bullet("SpearLeft.png", this.getNumPlayer(),22,4));
					else if(lastDirection==direct.RIGHT)
						Map.bullets.add(new Bullet("SpearRight.png", this.getNumPlayer(),22,4));
					else if(lastDirection==direct.UP)
						Map.bullets.add(new Bullet("SpearUp.png", this.getNumPlayer(),4,22));
					else if(lastDirection==direct.DOWN)
						Map.bullets.add(new Bullet("SpearDown.png", this.getNumPlayer(),4,22));
				}
				lastShot=100;
					
			}
			else if(lastShot>0){
				lastShot-=0.2;
				if(lastShot<=0)
					lastShot = 0;
			}
		}
	}

}
