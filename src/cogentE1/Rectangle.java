package cogentE1;

public class Rectangle {
	int length;
	int breadth;
	int area;
	int perimeter;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public void calcArea() {
		// TODO Auto-generated method stub
		area = length*breadth;
	}
	public void calcPeri() {
		// TODO Auto-generated method stub
		perimeter= 2*(length+breadth);
	}	
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Rec Area"+ area);
		System.out.println("REc primeter" + perimeter);
	}
	
}
