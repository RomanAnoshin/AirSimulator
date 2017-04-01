package Panel;

import figere.AirPoint;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

/**
 * Created by RomanAnoshin
 */
public class WorkingPanel extends JPanel {

    private java.util.List<AirPoint> coordinatePoints;
    private int count; //счетчик количества КТ  в траектории

    public WorkingPanel(int w, int h){
        setLocation(0, 0);
        setSize((int)(w*0.8)-3,h-33);
        setBorder(new LineBorder(Color.black, 3));
        setOpaque(true);
        MouseHandler mhandler=new MouseHandler();
        addMouseListener(mhandler);
        addMouseMotionListener(mhandler);
        coordinatePoints= new ArrayList<>();
    }

    public void addComponent(AirPoint point){
       // add(point);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.blue);
        int x0=0,y0=0;
        for (AirPoint point : coordinatePoints) {
            g2d.fill(new Ellipse2D.Float(point.getX(), point.getY(), 4, 4));
            if(x0!=0){
               g2d.drawLine(x0, y0, point.getX(), point.getY());
            }
            x0=point.getX();
            y0=point.getY();
            //System.out.println("My number point is "+point.getNumberPoint());
            //point.repaint();
            //addComponent(point);
        }

    }



    public class MouseHandler extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            AirPoint point=new AirPoint(e.getX(),e.getY(),count());
            coordinatePoints.add(point);
            addComponent(point);
            repaint(0);
        }


    }
    private int count (){
        return ++count;
    }

}
