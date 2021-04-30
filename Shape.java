/**
 * This is a abstract superclass for all geometric shapes to inherit from this class.
 * It has all necessary methods for every shape.
 */
abstract class Shape {



    /**
     * Calculate perimeter of a shape.
     * @return Value perimeter of a shape.
     */
    abstract double calculatePerimeter();

    /**
     * Calculate area of a shape.
     * @return Value of area of a shape.
     */
    abstract double calculateArea();

    /**
     * Prints the kind of shape and its perimeter and area.
     */
    public void draw(){
        System.out.println("this shape is a "+ this.getClass().getName()+" and its perimeter is :  "+this.calculatePerimeter()+" and its area is : "+this.calculateArea());
    }

    /**
     * this method checks if 2 objects are equals or not
     * @param obj
     * @return boolean , true when 2 objects are equal or have same size .
     */
    @Override
    public boolean equals(Object obj){

        return super.equals(obj);
    }

    /**
     * Return a String of the shape information like size of its sides and its type.
     * @return A string containing shapes information
     */
    @Override
    public String toString() {
        String explainShape = this.getClass().getName();
        return explainShape;
//        return super.toString();
    }
}
