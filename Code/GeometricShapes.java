import java.util.Date;

// Base class representing a geometric object
class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    // Default constructor
    public GeometricObject() {
        this("white", false);
    }

    // Parameterized constructor
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and Setter for filled
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Getter for date created
    public Date getDateCreated() {
        return dateCreated;
    }

    // Override toString method to display details
    @Override
    public String toString() {
        return "Created on: " + dateCreated + "\nColor: " + color + "\nFilled: " + filled;
    }
}

// Subclass Circle extending GeometricObject
class Circle extends GeometricObject {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0);
    }

    // Constructor with radius
    public Circle(double radius) {
        this(radius, "white", false);
    }

    // Constructor with all properties
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate diameter
    public double getDiameter() {
        return 2 * radius;
    }

    // Method to print circle details
    public void printCircle() {
        System.out.println("The circle was created on " + getDateCreated() + " with radius " + this.radius);
    }
}

// Subclass Rectangle extending GeometricObject
class Rectangle extends GeometricObject {
    private double width;
    private double height;

    // Default constructor
    public Rectangle() {
        this(1.0, 1.0);
    }

    // Constructor with width and height
    public Rectangle(double width, double height) {
        this(width, height, "white", false);
    }

    // Constructor with all properties
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Getter and Setter for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter and Setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// Main class to test Circle and Rectangle
public class GeometricShapes {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle circle1 = new Circle(5.0, "red", true);
        System.out.println("Circle Details:");
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        circle1.printCircle();

        // Creating a Rectangle object
        Rectangle rectangle1 = new Rectangle(4.0, 6.0, "blue", false);
        System.out.println("\nRectangle Details:");
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
    }
}
