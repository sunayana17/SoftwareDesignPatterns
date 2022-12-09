public class ShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equals("Rectangle")){
            return new RoundedRectangle();
        } else if(shapeType.equals("Square")){
            return new RoundedSquare();
        }
        return null;
    }
}
