import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class Button extends JFrame{

    private Container c;
    private JButton btn1,btn2;
    private  Font f;
    private Cursor cu;
    private ImageIcon img1,img2;

    Button(){
        initComponents();
    }

    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        f = new Font("Arial",Font.CENTER_BASELINE,15);
        cu = new Cursor(Cursor.HAND_CURSOR);

        img1 = new ImageIcon(getClass().getResource("submit.png"));
        img2 = new ImageIcon(getClass().getResource("cancel.png"));

        btn1= new JButton(img1);
        btn1.setBounds(100,180,100,40);
        btn1.setFont(f);
        btn1.setCursor(cu);
        c.add(btn1);

        btn2= new JButton(img2);
        btn2.setBounds(250,180,100,40);
        btn2.setFont(f);
        btn2.setCursor(cu);
        c.add(btn2);
    }

    public static void main(String[] args) {
      
        Button password = new Button();
        password.setVisible(true);
        password.setBounds(500, 300, 500, 300);
        password.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        password.setTitle("Password");
    }
}
