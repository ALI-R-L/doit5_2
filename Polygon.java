import java.util.ArrayList;
import java.util.Objects;

public class Polygon extends Shape{
    private ArrayList<Integer> sides ;

    /**
     * Construct a polygon object with its given side sizes.
     * @param side This is sizes of all sides of the polygon.
     */
    public Polygon(int...side){
        sides = new ArrayList<Integer>();
        for (Integer arg : side){
            sides.add(arg);
        }

    }

    /**
     * this method returns array list of sides
     * @return sides array list .
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    /**
     * Calculate perimeter of a shape.
     * @return peri .
     */
    @Override
    public double calculatePerimeter (){
        double peri = 0 ;
        for (Integer side : sides){
            peri +=side;

        }
        return peri;
    }

    /**
     * Calculate area of a shape.
     * @return area.
     */
    @Override
    public double calculateArea(){
        double area =1;
        return area ;
    }


    /**
     * Return a String of the polygon information like size of its sides.
     * @return explainShape .
     */
    @Override
    public String toString() {
        String explainShape = super.toString();
        for (int i = 0;i<sides.size(); i++){
            explainShape = explainShape + " side"+(i+1)+" : "+ sides.get(i);
        }
        return explainShape;
    }


    @Override
    public void draw(){
        super.draw();
    }

    /**
     * This method checks weather two polygon objects are equal or not.
     * @param obj This is an object wanted to be checked.
     * @return boolean ,that is true when two polygons are equal objects or have equal sizes.
     */
    @Override
    public boolean equals(Object obj){

        if (this == obj){
//            System.out.println("if 1");
            return true;
        }
        if (!(obj instanceof Polygon)){
//            System.out.println("if 2");
            return false;
        }
        Polygon polygon = (Polygon)obj;
 //       System.out.println("here"+sides+"  --"+polygon.sides);
        return Objects.equals(sides,polygon.sides);

    }


    /**
     * Calculate and return a hashCode for polygon
     * @return result
     */
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + sides.hashCode();
        return result;
    }

}
