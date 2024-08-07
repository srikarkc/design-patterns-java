public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape shape1 = sf.getShape("CIRCLE");
        shape1.draw();
    }
    
}
