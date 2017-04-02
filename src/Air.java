/**
 * Created by RomanAnoshin
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
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new WorkingPanel(
                (Toolkit.getDefaultToolkit().getScreenSize().width),
                (Toolkit.getDefaultToolkit().getScreenSize().height)
        ));
        frame.getContentPane().add(new ToolsPanel(
                (Toolkit.getDefaultToolkit().getScreenSize().width),
                (Toolkit.getDefaultToolkit().getScreenSize().height)
        ));
        frame.setSize(getDimension());
        //frame.setResizable(false);//  возможность изменить размер окна
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private static Dimension getDimension(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        return screenSize;
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
