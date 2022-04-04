package javaPractice;

public abstract class Circle extends NewAbstruct {
	private double redius;
	
	public Circle() {
		
	}

	public Circle(double redius) {
		this.redius = redius;
	}
	public Circle(double redius, String color, boolean filled) {
		this.redius = redius;
		setColor(color);
		setFilled(filled);
	}

	public double getRedius() {
		return redius;
	}

	public void setRedius(double redius) {
		this.redius = redius;
	}
	
	public double getDiameter() {
		return 2*redius;
	}
	public double getPerimeter() {
		return 2*redius*Math.PI;
	}
	
	public void printd() {
		System.out.println(getDateCreate()+" "+redius);
	}
	
}
