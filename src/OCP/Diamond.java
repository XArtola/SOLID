package OCP;

public class Diamond extends Figure {
	int x,y,a;
	public Diamond(int x, int y, int a) {
		
		super();
		
		this.x = x;
		this.y = y;
		this.a = a;
	}
	
	@Override
	public void draw() {
		System.out.println(String.format("Diamond X:%d  Y:%d  R:%d",x,y,a));
	}
}
