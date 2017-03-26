/**
 * Created by Роман on 23.03.2017.
 */
import javax.swing.*;
import java.awt.*;
import Panel.*;

public class Air {

    public static void createWindow (){
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
              (int)(Toolkit.getDefaultToolkit().getScreenSize().width*0.8),
              (int)(Toolkit.getDefaultToolkit().getScreenSize().height*1)
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
