import javax.swing.*;
import java.awt.*;


public class Client {
    public static void main(String[] args) {

        FluentBuilder builder = new BoxFluentBuilder()
                .setColor(Color.RED)
                .setSize(20)
                .setX(1)
                .setY(10);

        Box box = ((BoxFluentBuilder)builder).get();
        JFrame jFrame = new JFrame();
        jFrame.add(box);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}