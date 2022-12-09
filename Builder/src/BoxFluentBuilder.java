import javax.swing.*;
import java.awt.*;

public class BoxFluentBuilder implements FluentBuilder{

    private Color color;
    private int size,x,y;


    @Override
    public FluentBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    @Override
    public FluentBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public FluentBuilder setX(int x) {
        this.x = x;
        return this;
    }

    @Override
    public FluentBuilder setY(int y) {
        this.y = y;
        return this;
    }

    public Box get(){
        //Box b= new Box(x);
        //return new Box(color, size, x,y);
        return new Box(x);

    }
}
