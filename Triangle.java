import java.util.ArrayList;

public class Triangle extends Polygon{

 //   private ArrayList<Integer> sides ;

    /**
     * construct a triangle object with 4 given sides .
     * @param side
     */
    public Triangle(int...side){
        super(side);
    }

    /**
     * Get sides field.
     * @return sides . An array list of double which is size of each side.
     */
    @Override
    public ArrayList<Integer> getSides() {
        return super.getSides();
    }

    /**
     * Checks if it is a equilateral triangle or not.
     * @return Boolean , this is true if sizes of all side were equal.
     */
    public boolean isEquilateral(){
        if(getSides().get(0) == getSides().get(1) && getSides().get(0) == getSides().get(2))
            return true;
        else
            return false;
    }



    /**
     * Calculate triangle area .
     * @return area.
     */
    public double calculateArea(){
        double p ;
        p = super.calculateArea();
        p = (this.calculatePerimeter())/2;
        return Math.sqrt(p*(p-getSides().get(0))*(p-getSides().get(1))*(p-getSides().get(2)));
    }
    /**
     * Print the kind of shape and its perimeter and area value.
     */
    public void draw()
    {
        super.draw();
//        System.out.println("this shape is triangle,and its perimeter: "+ this.calculatePerimeter()+" ,area: "+ this.calculateArea());
    }

    /**
     * Checks if 2 objects are equal or have equal sides.
     * @param obj The object to check equality with.
     * @return Boolean, that is true if 2 objects are the same or have same sizes.
     */
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

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
