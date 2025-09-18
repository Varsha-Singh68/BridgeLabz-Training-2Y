package constructors;

public class Circle {
	    private double radius;
	    public Circle() {
	        this(10.9); 
	    }
	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    public double getRadius() {
	        return radius;
	    }
	    public void setRadius(double radius) {
	        this.radius = radius;
	    }
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	    public double getCircumference() {
	        return 2 * Math.PI * radius;
	    }
	    public void displayInfo() {
	        System.out.println("Radius: " + radius);
	        System.out.println("Area: " + getArea());
	        System.out.println("Circumference: " + getCircumference());
	    }
	    public static void main(String[] args) {
	        Circle c1 = new Circle();
	        c1.displayInfo();
	        System.out.println();
	        Circle c2 = new Circle(45.1);
	        c2.displayInfo();
	    }
	}



