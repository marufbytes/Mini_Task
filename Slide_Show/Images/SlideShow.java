import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class SlideShow extends JFrame implements ActionListener{

    private Container c;
    private  JPanel panel;
    private JButton btn1, btn2;
    private  ImageIcon icon;
    private JLabel label;
    private CardLayout card;

    SlideShow(){

        initcomponents();
        ShowImage();
    }

    //Image ride
    public void ShowImage(){

        String[] imageName = {"1.png","2.png","3.png"};

        for(String n: imageName){
         
            icon = new ImageIcon("C://Users//hp//OneDrive - American International University-Bangladesh//Programming//Norepad++//New folder (37)//Images//"+n);
            
            //Resize Image
            Image img = icon.getImage();
            Image newImage = img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(newImage);

            label = new JLabel(icon);
            panel.add(label);
        }

    }

    public void initcomponents(){

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        //Import Card Layot
        card = new CardLayout();

        //Panel
        panel = new JPanel(card);
        panel.setBounds(20,20,550,250);
        c.add(panel);

        //Next Button
        btn1 = new JButton("NEXT");
        btn1.setBounds(450,280,100,50);
        c.add(btn1);

        //Previout Button
        btn2 = new JButton("PREVIOUS");
        btn2.setBounds(40,280,100,50);
        c.add(btn2);

        //Action listener
        btn1.addActionListener(this);
        btn2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
  
        if(e.getSource()==btn1){
            card.next(panel);
        }
       
        if(e.getSource()==btn2){
            card.previous(panel);
        }
    }

    public static void main(String[] args) {
        
        SlideShow frame = new SlideShow();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(900,200,600,400);
    }

}