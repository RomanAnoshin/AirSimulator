package figere;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by Роман on 26.03.2017.
 */
public class AirPoint extends JButton {
    private int x, y, h;
    private int numberPoint = 0;

    public AirPoint() {
        setSize(new Dimension(6,6));
        setPreferredSize(new Dimension(6,6));
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
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setPaint(Color.BLACK);
        g2.setPaint(new GradientPaint(
                new Point(0, 0),
                Color.BLUE,
                new Point(0, getHeight()),
                Color.PINK.darker()));
        g2.fillOval(0,0,
                (int)(getSize().width), (int)(getSize().height));
        g2.dispose();
        Shape shape = new Ellipse2D.Float(0,0,
                (int)(getSize().width), (int)(getSize().height));
        g2.setClip(shape);
        super.paintComponent(g2);
    }
    protected void paintBorder(Graphics g)
    {/*
        g.setColor(Color.GREEN);
        g.drawOval(0-(getSize().width)/2,0-(getSize().height-1)/2,
                (int)(getSize().width), (int)(getSize().height-1));*/
    }


}
