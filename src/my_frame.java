import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class my_frame extends JFrame implements ActionListener{
    
    JButton nextbutton = new JButton("Next");
    JLabel mylabel = new JLabel(); 
    ImageIcon image_label = new ImageIcon("img/LOGO.png");
    ImageIcon imge_icon = new ImageIcon("img/LOGO.png"); 
    
    public my_frame(){
        // create the main fram 
        
            // creat a JLABEL
            mylabel.setText("Welcome to our E-commerce System!");
            mylabel.setIcon(image_label);
            mylabel.setHorizontalTextPosition(JLabel.CENTER);
            mylabel.setVerticalTextPosition(JLabel.BOTTOM);
            mylabel.setForeground(new Color(0,0,0));
            mylabel.setFont(new Font("Cavolini",Font.BOLD,20));
            mylabel.setIconTextGap(130);
            mylabel.setVerticalAlignment(JLabel.TOP);
            mylabel.setHorizontalAlignment(JLabel.CENTER);
            
            // creat a jbutton
            nextbutton.setBounds(190,340,90,30);
            nextbutton.setFocusable(false);
            nextbutton.addActionListener(this);
        
        // Creat a jframe
            this.setVisible(true);
            this.setSize(500,500);
            this.setResizable(false);
            this.setTitle("Mostafa programing project");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.getContentPane().setBackground(Color.white);
            this.add(nextbutton); 
            this.add(mylabel);
        
        // creat a IMAGEICON in the frame
            this.setIconImage(imge_icon.getImage());
        
        // for make window in center for screen
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            // determine the new location
                int w = this.getSize().width;
                int h = this.getSize().height;
                int x = (dim.width - w) / 2 ;
                int y =(dim.height - h) / 2;
                    // move to new location
                        this.setLocation(x,y);
    }
    // for next buttom action
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == nextbutton) {
                this.dispose();
                new ncustomerwindow();
            }
        }
}
