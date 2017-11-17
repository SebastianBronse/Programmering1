package lektion.klasser;

public class Circle {
	private double r = 1.0;
	private String color = "blue";
	
	
	/**
	 * constructor
	 */
	public Circle(String startColor) {
		color = startColor;
		System.out.println(r + " " + color);
		r = 20;
	}
	
	
	
	public double getR() {
		return r;
	}
	public void setR(double newR) {
		r = newR;
		
	}
}
