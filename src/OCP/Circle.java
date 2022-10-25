package OCP;

public class Circle extends Figure {

	int x,y,r;
	public Circle(int x, int y, int r) {
		
		super();
		
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	@Override
	public void draw() {
		System.out.println(String.format("Circle X:%d  Y:%d  R:%d",x,y,r));
	}
	
}
