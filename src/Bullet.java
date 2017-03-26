import MG2D.geometrie.Point;
import MG2D.geometrie.Texture;

public class Bullet extends Texture{
	
	// --------------------- Attributes --------------------- //
	public enum direct{UP, DOWN, LEFT, RIGHT};
	private direct direction;
	
	// --------------------- Getters & Setters --------------------- //
	public direct getDirection() {
		return direction;
	}

	public void setDirection(direct direction) {
		this.direction = direction;
	}
	
	// --------------------- Functions --------------------- //
	public Bullet(String img, int n, int l, int h){
		super(img, new Point(Map.avatars.get(n).getA().getX(),Map.avatars.get(n).getA().getX()), l, h);
		
		System.out.println("ayy");
		
		if(img.contains("Up")){
			setDirection(direct.UP);
			this.getA().setX(Map.avatars.get(n).getA().getX()+this.getLargeur()/2);
			this.getA().setY(Map.avatars.get(n).getA().getY()+Map.avatars.get(n).getHauteur());
			this.getB().setX(Map.avatars.get(n).getB().getX()+this.getLargeur()/2);
			this.getB().setY(Map.avatars.get(n).getB().getY()+Map.avatars.get(n).getHauteur());
		}
		else if(img.contains("Down")){
			setDirection(direct.DOWN);
			this.getA().setX(Map.avatars.get(n).getA().getX()+this.getLargeur()/2);
			this.getA().setY(Map.avatars.get(n).getA().getY()-Map.avatars.get(n).getHauteur());
			this.getB().setX(Map.avatars.get(n).getB().getX()+this.getLargeur()/2);
			this.getB().setY(Map.avatars.get(n).getB().getY()-Map.avatars.get(n).getHauteur());
		}
		else if(img.contains("Right")){
			setDirection(direct.RIGHT);
			this.getA().setX(Map.avatars.get(n).getA().getX()+this.getLargeur());
			this.getA().setY(Map.avatars.get(n).getA().getY()+Map.avatars.get(n).getHauteur()/2);
			this.getB().setX(Map.avatars.get(n).getB().getX()+this.getLargeur());
			this.getB().setY(Map.avatars.get(n).getB().getY()+Map.avatars.get(n).getHauteur()/2);
		}
		else if(img.contains("Left")){
			setDirection(direct.LEFT);
			this.getA().setX(Map.avatars.get(n).getA().getX()-this.getLargeur());
			this.getA().setY(Map.avatars.get(n).getA().getY()+Map.avatars.get(n).getHauteur()/2);
			this.getB().setX(Map.avatars.get(n).getA().getX()-this.getLargeur());
			this.getB().setY(Map.avatars.get(n).getB().getY()+Map.avatars.get(n).getHauteur()/2);
		}

		
		System.out.println("Bullet created");
	}

	
	public void update(){
		move();
	}
	
	public void move(){
		if(getDirection() == direct.UP){
			this.getA().setY(this.getA().getY()+6);
			this.getB().setY(this.getB().getY()+6);
		}
		else if(getDirection() == direct.DOWN){
			this.getA().setY(this.getA().getY()-6);
			this.getB().setY(this.getB().getY()-6);
		}
		else if(getDirection() == direct.RIGHT){
			this.getA().setX(this.getA().getX()+6);
			this.getB().setX(this.getB().getX()+6);
		}
		else if(getDirection() == direct.LEFT){
			this.getA().setX(this.getA().getX()-6);
			this.getB().setX(this.getB().getX()-6);
		}
		
	}
}
