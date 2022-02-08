package Assign3;


public class Square extends Rectangle{

    Square(int i, int i1, String green, boolean b){}
    Square (double side) {
      width = 1.0;
       length = 1.0;
    }

    Square(double side, String color, boolean filled){
        super(side, side, "green", true);

    }


    public double getSide() {
        return length;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }


    public void setWidth(double side){
        this.width = width;

    }
    public void setLength(double side){
        this.length = length;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
