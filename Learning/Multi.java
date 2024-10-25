import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Cursor;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multi extends JFrame {
                                                                                                                
    private Container c;
    private JLabel imglabel, textLabel;
    private JTextArea ta;
    private JTextField tf;
    private JButton btn;
    private Font f;
    private ImageIcon img;
    private Cursor cr;

    Multi() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Times New Roman",Font.BOLD,25);

        cr = new Cursor(Cursor.HAND_CURSOR);

        img = new ImageIcon(getClass().getResource("download.png"));
        imglabel = new JLabel(img);
        imglabel.setBounds(3, 10, img.getIconWidth(), img.getIconHeight());
        c.add(imglabel);

        textLabel = new JLabel("Enter any digit : ");
        textLabel.setBounds(20,150,250,50);
        textLabel.setForeground(Color.BLUE);
        textLabel.setFont(f);
        c.add(textLabel);

        tf = new JTextField();
        tf.setBounds(230,152,90,45);
        tf.setFont(f);
        tf.setBackground(Color.GREEN);
        tf.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf);

        tf.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                ta.setText("");

                String value = tf.getText();
                if(value.isEmpty()){

                    JOptionPane.showMessageDialog(null,"Enter any digit ! ");
                }

                else {
                    
                int num = Integer.parseInt(tf.getText());

                for( int i = 1; i<=10; i++){

                    int result = num*i;

                    String r = String.valueOf(result);
                    String n = String.valueOf(num);
                    String in = String.valueOf(i);

                    ta.append(n+ " X "+in+" = "+r+ "\n" );
                }
            }
                }

        });

        btn = new JButton("Clear");
        btn.setBounds(20,220,300,40);
        btn.setFont(f);
        btn.setBackground(Color.GREEN);
        btn.setCursor(cr);
        c.add(btn);

        btn.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                ta.setText("");
            }
        });
       
        ta = new JTextArea();
        ta.setBounds(20,280,300,350);
        ta.setBackground(Color.GREEN);
        ta.setFont(f);
        c.add(ta);
    }

    public static void main(String[] args) {

        Multi multi = new Multi();
        multi.setVisible(true);
        multi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multi.setBounds(300, 20, 360, 700);
        multi.setTitle("Multiplication Table ");
    }
}
