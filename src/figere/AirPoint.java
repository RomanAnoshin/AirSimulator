package figere;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by Роман on 26.03.2017.
 */
public class AirPoint extends JComponent {
    private int x, y, h;
    private int numberPoint = 0;

    public AirPoint() {
        this.h = 10000;
        this.x = 0;
        this.y = 0;
    }

    public AirPoint(int x, int y) {
        this();
        this.x = x;
        this.y = y;
        numberPoint=0;
    }
    public AirPoint(int x, int y,int numberPoint ){
        this(x,y);
        this.numberPoint=numberPoint;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public int getNumberPoint(){
        return numberPoint;
    }
    public  void setNumberPoint(int numberPoint){
        this.numberPoint=numberPoint;
    }
    @Override
    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.blue);
        g2d.setClip(new Ellipse2D.Float(getX(), getY(), 6, 6));
        g2d.fill(new Ellipse2D.Float(getX(), getY(), 6, 6));
    }
}
