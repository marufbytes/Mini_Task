import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Radio extends JFrame {

    private Container c;
    private JRadioButton male, female;
    private ButtonGroup grp;
    private JTextArea ta;

    Radio() {
        initcomponents();
    }

    public void initcomponents() {

        this.setVisible(true);
        this.setBounds(500, 300, 500, 300);
        this.setTitle("Radio button ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        Font f = new Font("Arial", Font.BOLD, 20);

        male = new JRadioButton("Male");
        male.setBounds(50, 50, 100, 50);
        male.setFont(f);
        male.setBackground(Color.PINK);
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(250, 50, 100, 50);
        female.setFont(f);
        female.setBackground(Color.PINK);
        c.add(female);

        grp = new ButtonGroup();
        grp.add(male);
        grp.add(female);

        ta = new JTextArea("Nothing is selected");
        ta.setBounds(50, 150, 300, 50);
        ta.setFont(f); 
        ta.setBackground(Color.WHITE); 
        c.add(ta);

        c.repaint();

        male.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setText("Male Selected");
            }
        });

        female.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setText("Female Selected");
            }
        });
    }

    public static void main(String[] args) {
        new Radio();
    }
}
