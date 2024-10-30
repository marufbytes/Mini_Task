import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

class VowelCounter extends JFrame {

    private Container c;
    private JLabel promtLabel, vowelLabel, aLabel, eLabel, iLabel, oLabel, uLabel;
    private JTextArea ta;
    private JScrollPane scroll;

    int totalVowel = 0;
    int letter_a = 0;
    int letter_e = 0;
    int letter_i = 0;
    int letter_o = 0;
    int letter_u = 0;

    VowelCounter() {
        initComponents();
    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        promtLabel = new JLabel("Enter the Text : ");  // Fixed: Changed "Texxt" to "Text"
        promtLabel.setBounds(10, 20, 100, 30);
        c.add(promtLabel);        

        ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        scroll = new JScrollPane(ta);
        scroll.setBounds(120, 20, 450, 100);
        c.add(scroll);

        vowelLabel = new JLabel();
        vowelLabel.setBounds(110, 150, 250, 30);
        c.add(vowelLabel);

        aLabel = new JLabel();
        aLabel.setBounds(110, 190, 250, 30);
        c.add(aLabel);

        eLabel = new JLabel();
        eLabel.setBounds(110, 230, 250, 30);
        c.add(eLabel);

        iLabel = new JLabel();
        iLabel.setBounds(110, 270, 250, 30);
        c.add(iLabel);

        oLabel = new JLabel();
        oLabel.setBounds(110, 310, 250, 30);
        c.add(oLabel);

        uLabel = new JLabel();
        uLabel.setBounds(110, 360, 250, 30);
        c.add(uLabel);

        ta.addKeyListener(new KeyListener(){

            public void keyTyped(KeyEvent k) {

            }

            public void keyPressed(KeyEvent k) {

                if (k.getSource() == ta) {
                    
                    if (KeyEvent.VK_A == k.getKeyCode()) {
                        letter_a++;
                        totalVowel++;
                    }

                    if (KeyEvent.VK_E == k.getKeyCode()) {
                        letter_e++;
                        totalVowel++;
                    }

                    if (KeyEvent.VK_I == k.getKeyCode()) {
                        letter_i++;
                        totalVowel++;
                    }

                    if (KeyEvent.VK_O == k.getKeyCode()) {
                        letter_o++;
                        totalVowel++;
                    }

                    if (KeyEvent.VK_U == k.getKeyCode()) {
                        letter_u++;
                        totalVowel++;
                    }
                }
                vowelLabel.setText("Total number of vowels: " + totalVowel);
                aLabel.setText("Total number of A: " + letter_a);
                eLabel.setText("Total number of E: " + letter_e);
                iLabel.setText("Total number of I: " + letter_i);
                oLabel.setText("Total number of O: " + letter_o);  // Fixed: Changed "if" to "of"
                uLabel.setText("Total number of U: " + letter_u);
            }

            public void keyReleased(KeyEvent k) {

            }
        });
    }

    public static void main(String[] args) {

        VowelCounter counter = new VowelCounter();
        counter.setVisible(true);
        counter.setBounds(800, 150, 600, 400);
        counter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
