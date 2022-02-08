package Assign3;

public class Rectangle extends Shape {
    public double width = 1.0;
    public double length = 1.0;

    Rectangle() {
    }

    Rectangle(double width, double length) {
    }

    Rectangle(double width, double length, String color, boolean filled) {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = width * length;
        System.out.println("The area of the rectangle [width = " + width + ", length = " + length + " ]: " + area);
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (width + length);
        System.out.println("The perimeter of the rectangle [width = " + width + ", length = " + length + " ]: " + perimeter);
        return perimeter;
    }

    @Override
    public String toString(){
        return "Rectangle{"+
                "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width + '\'' +
                ", length=" + length +
                '}';
    }
    }





