package Assign3;


public class Main {
    public static void main(String[] args){
        Shape shape = new Shape("green", true);
        System.out.println(shape.toString());


        Circle circle = new Circle( 1.0, "green", true);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(1, 1, "green", true);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());


        Square square = new Square(1, 1, "green", true) ;
        System.out.println(square.getWidth());
        System.out.println(square.getLength());
        System.out.println(square.toString());



    }

}
