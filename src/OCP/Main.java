package OCP;

public class Main {
	public static void main(String[] args) {
		Sheet sh = new Sheet();
		
		Square s = new Square(2,5);
		Circle c1 = new Circle(2,3,4);
		Circle c2 = new Circle(2,3,3);
		Diamond d = new Diamond(2,4,3);
		
		sh.addFigure(s);
		sh.addFigure(c1);
		sh.addFigure(c2);
		sh.addFigure(d);
		
		sh.drawFigures();
		
		sh.calcArea();
	}
}
