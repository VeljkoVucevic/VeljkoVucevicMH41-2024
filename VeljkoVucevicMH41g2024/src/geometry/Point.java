package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
	public double distance(Point p) {
		int dx = x - p.getX(); // this nije potrebno jer nemao nikakakv konflikt, zna se na sta se odnosi
		int dy = y - p.getY();
		return Math.sqrt(dx*dx + dy*dy);
		
	}
	
	// get metode - vracaju nam isti tip podatka kao i sam atribut
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean isSelected() {
		return selected;
	}
	
	// set metode
	
	public void setX(int x) {
		this.x = x; // this je referenca na objekat koji poziva ovu metodu, referencira izmedju atributa i parametara
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
