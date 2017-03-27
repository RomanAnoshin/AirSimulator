package Panel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Created by Роман on 23.03.2017.
 */
public class ToolsPanel extends JPanel {
    public ToolsPanel(int w, int h ){
        setLocation((int)(w*0.8-3), 0);
        setSize((int)(w*0.2-6),h-33);
        setBorder(new LineBorder(Color.red, 3));
        setOpaque(true);
    }

}
