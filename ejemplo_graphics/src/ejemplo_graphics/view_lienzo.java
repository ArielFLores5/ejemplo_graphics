package ejemplo_graphics;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class view_lienzo extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    view_lienzo frame = new view_lienzo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public view_lienzo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 409);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel pn_control = new JPanel();
        pn_control.setBackground(Color.GRAY);
        pn_control.setBounds(10, 11, 418, 53);
        contentPane.add(pn_control);

        JPanel pn_control2 = new JPanel();
        pn_control2.setBackground(Color.GRAY);
        pn_control2.setBounds(10, 312, 418, 53);
        contentPane.add(pn_control2);

        lienzo lienzoPanel = new lienzo();
        lienzoPanel.setBounds(10, 75, 418, 226);
        contentPane.add(lienzoPanel);
    }
}
