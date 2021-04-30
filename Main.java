public class Main {

    public static void main(String[] args) {
	// write your code here

        Shape tri1 = new Triangle(3,3,4);
        Shape tri2 = new Triangle(12,13,15);
        Shape tri3 = new Triangle(5,5,5);
        Triangle triangle1 = new Triangle(7,7,7);
        Triangle triangle2 = new Triangle(7,7,7);
        System.out.println("are these 2 triangles  equal ? "+ triangle1.equals(triangle2));

        Circle circle1 = new Circle(2);
        Rectangle rectangle1 = new Rectangle(1,2,1,2);
        Rectangle rectangle2 = new Rectangle(3,3,3,3);
        Rectangle rectangle3 = new Rectangle(3,5);
        Rectangle rectangle4 = new Rectangle(6,6);
        System.out.println("are these 2 rectangles  equal? "+ rectangle1.equals(rectangle4));
        Paint paint = new Paint();

        paint.addShape(tri1);
        paint.addShape(tri2);
        paint.addShape(tri3);
        paint.addShape(circle1);
        paint.addShape(rectangle1);
        paint.addShape(rectangle2);
        paint.addShape(triangle1);
        paint.addShape(triangle2);
        rectangle1 = rectangle3;

//        System.out.println("\nis equ ?"+triangle1.isEquilateral()+"\n");
        System.out.println("Draw all -------------");
        paint.drawAll();
        System.out.println("Print all ------------");
        paint.printAll();
        System.out.println("Equal sides -----------");
        paint.describeEqualSides();




    }
}
