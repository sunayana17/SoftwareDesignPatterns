public class Main {
    public static void main(String[] args) {

        Shape shape = new RectangleAdapter();

        int x1 = 20, y1 = 20;
        int x2 = 30, y2 = 60;

        shape.draw(x1,y1,x2,y2, new Rectangle());
    }
}