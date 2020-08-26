package latihan;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("Circle");

        //call draw method of circle
        shape1.draw();

        //get an object of rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
        
        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();

    }
    
}