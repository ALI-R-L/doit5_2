import java.util.ArrayList;

public class Paint {
    private ArrayList<Shape> shapes ;

    /**
     * Construct a new paint object .
     */
    public Paint(){
        shapes = new ArrayList<Shape>();
    }

    /**
     * Add a new shape to list of shapes.
     * @param shape The shape to be added.
     */
    public void addShape(Shape shape)
    {
        shapes.add(shape);
    }

    /**
     * Call draw method on all the shapes in the array list
     */
    public void drawAll()
    {
        for (Shape shape: shapes)
            shape.draw();
    }

    /**
     * this method prints shapes tostring information .
     */
    public void printAll(){
        for (Shape shape : shapes){
            System.out.println(shape.toString());
        }
    }

    /**
     * Print shapes with equal side sizes like squares and equilaterals
     */
    public void describeEqualSides(){

        for (Shape shape : shapes){
            if (shape instanceof  Rectangle){
                if (((Rectangle)shape).isSquare()){
                    System.out.println(shape.toString()+" its sqaure");
                }

            }
            if (shape instanceof Triangle){
                if (((Triangle)shape).isEquilateral()){
                    System.out.println(shape.toString()+" its equilateral");
                }
            }


        }

    }



}
