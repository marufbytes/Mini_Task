import java.awt.*;
import javax.swing.*;

class BorderLayoutDemo extends JFrame {

    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;

    BorderLayoutDemo() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
       c.setLayout(new BorderLayout()); // Set the layout manager to BorderLayout

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        // Add buttons to the content pane in specified locations
        c.add(btn1, BorderLayout.NORTH);
        c.add(btn2, BorderLayout.WEST);
        c.add(btn3, BorderLayout.CENTER);
        c.add(btn4, BorderLayout.EAST);
        c.add(btn5, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        BorderLayoutDemo frame = new BorderLayoutDemo();
        frame.setVisible(true);
        frame.setBounds(900, 200, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
