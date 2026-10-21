package geometry;

public class Testing {

	public static void main(String[] args) {
		
		Point p1 = new Point(); //new znaci da se alocira neko mesto na memoriji; konstruktor je ono sto istancira novi objekat
		
		
		p1.setX(50);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		System.out.println(p1.isSelected());
		
	}

}
