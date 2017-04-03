package Panel;

import figere.AirPoint;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Роман on 23.03.2017.
 */
public class ToolsPanel extends JPanel {

    public static JComboBox jcbAirPoint=new JComboBox();;
    public static java.util.List<AirPoint> coordinatePoints;
    private int count=0;
    private int w,h;

    public ToolsPanel(int w, int h ){
        this.w=w;
        this.h=h;
        setVisible(true);
        setLayout(null);
        setOpaque(true);
        setLocation((int)(w*0.8-3), 0);
        setSize((int)(w*0.2-6),h-33);
        setOpaque(true);
        coordinatePoints= new ArrayList<>();
        add(createReferenceObject());
    }
    public  void addPoint(AirPoint point){
        coordinatePoints.add(point);
        jcbAirPoint.addItem(point.getNumberPoint());
        repaint();
    }

    private JPanel createReferenceObject(){
        JPanel panel=new JPanel();
        panel.setBorder(new LineBorder(Color.yellow, 3));
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setSize((int)(w*0.2-6),h-300);
        JLabel labelNumberRAO= new JLabel("№ ЭВО"); //number of reference air object
        labelNumberRAO.setSize(60,20);
        labelNumberRAO.setLocation(30,30);

        JComboBox jcbRAO=new JComboBox();// создание выпадающего списка (ЭВО) эталонных воздушных объектов
        jcbRAO.setPreferredSize(new Dimension(100,20));//размер выпадающего списка
        jcbRAO.setSize(100,20);
        jcbRAO.setLocation(90,30);

        JButton addNewRAO=new JButton("Новый ЭВО");//кнопка для добавления нового ЭВО
        addNewRAO.setLocation(20,h-340);
        addNewRAO.setSize(110,20);
        addNewRAO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jcbRAO.addItem(++count);
                repaint();
            }
        });

        JLabel labelNumberPoint=new JLabel("№ точки");
        labelNumberPoint.setSize(60,20);
        labelNumberPoint.setLocation(30,70);

        // выпадающей список для выбора эталонной воздушной точки
        jcbAirPoint.setLocation(90,70);
        jcbAirPoint.setPreferredSize(new Dimension(100,20));
        jcbAirPoint.setSize(100,20);

        panel.add(labelNumberRAO);
        panel.add(jcbRAO);
        panel.add(addNewRAO);
        panel.add(labelNumberPoint);
        panel.add(jcbAirPoint);
        return panel;
    }

}
