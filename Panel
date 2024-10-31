import javax.swing.*;
import java.awt.*;

class Panel extends JFrame {

    private Container c;
    private JPanel panel1, panel2;
    private JButton btn1, btn2, btn3;
    private JLabel label;

    Panel() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
       
        panel1 = new JPanel(); 
        panel1.setBounds(40, 100, 250, 200);
        panel1.setBackground(Color.RED);
        c.add(panel1); 
       
        panel2 = new JPanel(); 
        panel2.setBounds(300, 100, 260, 200); 
        panel2.setBackground(Color.BLUE);
        c.add(panel2);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");

    
        panel1.add(btn1);
        panel2.add(btn2);
        panel1.add(btn3);

        label =  new JLabel("GO");

        label.setBounds(20,20,200,50);
        c.add(label);

    }

    public static void main(String[] args) {
        Panel frame = new Panel();
        frame.setVisible(true);
        frame.setBounds(900, 250, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
