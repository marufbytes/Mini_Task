import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

class KeyListener1 extends JFrame {

    private Container c;
    private JTextField tf;
    private JTextArea ta;

    KeyListener1() {
        initComponents();
    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        tf = new JTextField();
        tf.setBounds(50, 50, 200, 50);
        c.add(tf);

        ta = new JTextArea();
        ta.setBounds(50, 150, 400, 150);
        c.add(ta);

       
        tf.addKeyListener(new java.awt.event.KeyListener() {

         
            public void keyTyped(KeyEvent k) {
                ta.append("Key Typed: " + k.getKeyChar() + "\n");
            }

          
            public void keyPressed(KeyEvent k) {
                ta.append("Key Pressed: " + k.getKeyChar() + "\n");
            }

          
            public void keyReleased(KeyEvent k) {
                ta.append("Key Released: " + k.getKeyChar() + "\n");
            }
        });
    }

    public static void main(String[] args) {

        KeyListener1 key = new KeyListener1();
        key.setVisible(true);
        key.setBounds(800, 150, 600, 400);
        key.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
