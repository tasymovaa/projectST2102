package Assign3;


public class Circle extends Shape {
    public double radius = 1.0;

    Circle(){}
    Circle(double radius){}
        Circle(double radius, String color,boolean filled){
    }
     public double getRadius(){
        return radius;
     }

     public void setRadius(double radius){
        this.radius = radius;
     }

     public double getArea(){
         double area = radius * radius * Math.PI;
         System.out.println("The area of the circle [radius = " + radius + "]: " + area);
         return area;
     }

     public double getPerimeter(){
         double perimeter = 2 * radius * Math.PI;
         System.out.println("The perimeter of the circle [radius = " + radius + "]: " + perimeter);
         return perimeter;
     }
    @Override
     public String toString(){
         return "Circle{"+
                 "Shape{" +
                 "color='" + color + '\'' +
                 ", filled=" + filled +
                 ",A circle with radius=" + radius +
                 '}';
     }
     }



