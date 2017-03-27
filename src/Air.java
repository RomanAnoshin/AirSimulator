/**
 * Created by Роман on 23.03.2017.
 */

import javax.swing.*;
import java.awt.*;
import Panel.*;

public class Air {

    private static void createWindow (){
        JFrame.setDefaultLookAndFeelDecorated(true);
        final JFrame frame = new JFrame("Air Simulator");
        frame.setPreferredSize(getDimension());
        setCenterPosition(frame);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(createPanel());

    }
    private static Dimension getDimension(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        return screenSize;
    }

    private static JPanel createPanel(){
      MainPanel  mPanel=new MainPanel();
      mPanel.add(new WorkingPanel(
             (Toolkit.getDefaultToolkit().getScreenSize().width),
              (Toolkit.getDefaultToolkit().getScreenSize().height)
      ));
      mPanel.add(new ToolsPanel(
              (Toolkit.getDefaultToolkit().getScreenSize().width),
             (Toolkit.getDefaultToolkit().getScreenSize().height)
      ));
        return mPanel;
    }


    private static void setCenterPosition(JFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getPreferredSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
       // frame.setLocation((screenSize.width-frameSize.width) / 2,     //выравнивает frame по центру
       //         (screenSize.height-frameSize.height) / 2);            //
    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createWindow();
            }
        });
    }
}
