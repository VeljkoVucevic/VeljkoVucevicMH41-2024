package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;

	// implicitno podrazumevani konstruktor
	// Ukoliko ne postoje drugi konstruktori, ne mora eksplicitno da se navodi
	public Point() { // naziv konsttruktora mora biti identican nazivu klase

	}

	// u Javi je moguce imati vise metoda koje imaju identican naziv ali je samo pod
	// uslovom da imaju razlicitu kombinaciju parametara
	// Ova pojava se naziva - Overloading
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, boolean selected) {
		// Primer nasledjivanja konstruktora
		// this.x = x;
		// this.y = y;
		this(x, y);
		this.selected = selected;
	}

	public double distance(Point p) {
		int dx = x - p.getX(); // this nije potrebno jer nemao nikakakv konflikt, zna se na sta se odnosi
		int dy = y - p.getY();
		return Math.sqrt(dx * dx + dy * dy);
	}

	public boolean contains(int x, int y) {
		return distance(new Point(x,y)) <= 2
	}

	@Override
	public String toString() {
		String.format("(%s, %s)", x, y);
		return "(" + x + "," + y + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Point) {
			Point temp = (Point) o;
			if (this.x == temp.getX() && this.y == temp.getY())
				return true;
		}
		return false;
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
		this.x = x; // this je referenca na objekat koji poziva ovu metodu, referencira izmedju
					// atributa i parametara
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
