package OCP;

public class Square extends Figure {
	int x,y;
	
	public Square(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw() {
		System.out.println(String.format("Square X:%d  Y:%d",x,y));
	}
}
