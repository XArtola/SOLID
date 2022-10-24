package OCP;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet {
	
	Vector<Figure> figures = new Vector<Figure>();	
	
	public void addFigure(Figure f) {
		
		figures.add(f);
			
	}


	public void drawFigures() {
		
		Enumeration<Figure> figures = figures.elements();
		Figure f;
		
		while(figures.hasMoreElements()) {	
			
			f = figures.nextElement();
			f.draw();
		}
		
	}
}