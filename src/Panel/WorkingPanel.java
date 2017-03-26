package Panel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Created by Роман on 23.03.2017.
 */
public class WorkingPanel extends JPanel {

    public WorkingPanel(int w, int h ){
        setLocation(0, 0);
        setSize(w,h);
        setBorder(new LineBorder(Color.black, 3));
        add(new JButton("Кнопка"));
    }
}
