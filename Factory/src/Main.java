public class Main {
    public static void main(String[] args) {

        AbstractFactory abstractFactory = new ShapeFactory();

        Shape shape1 = abstractFactory.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = abstractFactory.getShape("Square");
        shape2.draw();
    }
}