import java.util.ArrayList;
import java.util.Objects;

public class Rectangle extends Polygon{

 //   private ArrayList<Integer> sides;

    /**
     * construct a rectangle object with 4 given sides .
     * @param side
     */
    public Rectangle(int...side){
  //      sides = new ArrayList<Integer>();
        super(side);

    }

    /**
     * Get sides field.
     * @return sides.
     */
    @Override
    public ArrayList<Integer> getSides() {
        return super.getSides();
    }

    /**
     * Checks if it is a square or not.
     * @return Boolean , this is true if sizes of all side are equal.
     */
    public boolean isSquare(){

        return (getSides().get(0).equals(getSides().get(1)));
        /*
        if (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2) && sides.get(2)== sides.get(3)){
//            System.out.println("this is square");
            return true;
        }
//        System.out.println("this is not square ");
        return false;
        */
    }

    /**
     * Calculate rectangle area .
     * @return  area .
     */
    public double calculateArea(){
        double area = 0;
        area = super.calculateArea();
        if(isSquare()) {
            area = Math.pow(getSides().get(0),2);
            return area;
        }
        else
        {
            if(getSides().get(0) != getSides().get(1))
                area = getSides().get(0) * getSides().get(1);
            else if(getSides().get(0) != getSides().get(2))
                area = getSides().get(0) * getSides().get(2);
        }
        return area;
    }

    /**
     * this method Prints the kind of shape and its perimeter and area .
     */
    public void draw()
    {
        super.draw();
  //      System.out.println("this shape is rectangle and its perimeter: "+ this.calculatePerimeter()+" ,area: "+ this.calculateArea());
    }
    public boolean equals(Object obj){
        return super.equals(obj);
    }
/*
    /**
     * this method checks if 2 objects are equal .
     * @param obj This is an object wanted to be checked.
     * @return
     */
/*
    public boolean equals(Object obj){
        if(obj == this)
            return true;
        if(!(obj instanceof Rectangle))
            return false;
        Rectangle rectangle = (Rectangle) obj;
        return sides.get(0) == rectangle.sides.get(0) &&
                sides.get(1) == rectangle.sides.get(1) &&
                sides.get(2) == rectangle.sides.get(2) &&
                sides.get(3) == rectangle.sides.get(3);
    }
*/
    /**
     * Get objects size of sides and shape type in a String.
     * @return String with information about object.
     */
    @Override
    public String toString()
    {
        return super.toString();
    }


}
