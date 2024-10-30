import javax.swing.*;
import java.awt.*;

class Label extends JFrame{

    private Container c;
    private JLabel label;
    private ImageIcon image;

    Label(){
        initComponents();
    }

    public void initComponents(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        image = new ImageIcon(getClass().getResource("download.png"));

        label = new JLabel("Image Icon",image,JLabel.LEFT);
        label.setBounds(50,50,300,300);
        c.add(label);

    }

    public static void main(String[] args){

        Label frame = new Label();
        frame.setVisible(true);
        frame.setBounds(900,200,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}