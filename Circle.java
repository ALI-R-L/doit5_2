public class Circle extends Shape{

    private int radius;

    /**
     * construct of Circle class that makes a circle with given radius .
     * @param r
     */
    public Circle(int r){
        super();
        radius = r;
    }

    /**
     * Get radius field.
     * @return radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculate circle perimeter.
     * @return peri .
     */
    public double calculatePerimeter(){
        double peri = 2 * Math.PI * radius;
        return peri;
    }

    /**
     * Calculate circle area .
     * @return area .
     */
    public double calculateArea(){

        double area = Math.PI * Math.pow(radius,2);
        return area;

    }

    /**
     * Print the kind of shape and its perimeter and area value.
     */
    public void draw()
    {
//        System.out.println("this shape is circle,and its perimeter: "+ this.calculatePerimeter()+" ,area: "+ this.calculateArea());
        super.draw();
    }

/*
    /**
     * Checks if two objects are equal or have equal radius.
     * @param obj The object to check equality with.
     * @return Boolean, this is true if two objects are the same or have same radius.
     */
/*
    @Override
    public boolean equals(Object obj)
    {
        if(obj == this)
            return true;
        if(!(obj instanceof Circle))
            return false;
        Circle circle = (Circle) obj;
        return radius == circle.radius;
    }
    */

    /**
     * Get objects size of sides and shape type in a String.
     * @return String with information about object.
     */
    @Override
    public String toString() {
        String explainShape = super.toString();
        return explainShape+" its radius = "+this.radius;
//        return super.toString();
    }

}
