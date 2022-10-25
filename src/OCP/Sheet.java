package OCP;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet {
	Vector<Figure> figures = new Vector<Figure>();

	public void addFigure(Figure f) {
		figures.add(f);
	}
	
	public void drawFigures() {
		Enumeration<Figure> efigures = figures.elements();
		Figure f;
		while (efigures.hasMoreElements()) {
			f = efigures.nextElement();
			f.draw();
		}
	}
	
	public void calcArea() {
		Enumeration<Figure> efigures = figures.elements();
		Figure f;
		float total = 0;
		while (efigures.hasMoreElements()) {
			f = efigures.nextElement();
			total += f.getArea();
		}
		System.out.println("Azalera totala: " + total);
	}
}
