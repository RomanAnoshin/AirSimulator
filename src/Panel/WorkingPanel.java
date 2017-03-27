package Panel;

import figere.AirPoint;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by Роман on 23.03.2017.
 */
public class WorkingPanel extends JPanel {

    private java.util.List<AirPoint> coordinatePoints;

    public WorkingPanel(int w, int h ){
        setLocation(0, 0);
        setSize((int)(w*0.8)-3,h-33);
        setBorder(new LineBorder(Color.black, 3));
        setOpaque(true);
        MouseHandler mhandler=new MouseHandler();
        addMouseListener(mhandler);
        addMouseMotionListener(mhandler);
        coordinatePoints= new ArrayList<>();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.blue);
        for (AirPoint point : coordinatePoints) {
            g2d.drawOval(point.getX(), point.getY(), 3, 3);
        }
        System.out.println("hi");
    }

    public class MouseHandler extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            AirPoint point=new AirPoint(e.getX(),e.getY());
            coordinatePoints.add(point);
            repaint(0);
        }


    }


}
