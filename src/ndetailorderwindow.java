import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Timer;

public class ndetailorderwindow implements ActionListener{
    static JFrame new_window_detail_order = new JFrame();
    
    JLabel welcome_label_3;
    JLabel order_summary;
    JLabel id_label_3 ;
    JLabel order_id_label ;
    JLabel place_order;
    JLabel message_label;
    JLabel message_Label2;
    JLabel timer_label;
    
    ImageIcon image_label = new ImageIcon("img/LOGO.png");
    ImageIcon imge_icon = new ImageIcon("img/LOGO.png"); 
    
    JButton YES = new JButton("YES");
    JButton NO = new JButton("NO");
    
    int seconds = 5;
    Timer time = new Timer(1000,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            seconds --;
            timer_label.setText(String.valueOf(seconds)+" seconds lefts");
            if (seconds == 0) {
                System.exit(0);
            }
        }
    });
    
    public ndetailorderwindow(float[] price_product){
        welcome_label_3 = new JLabel("Welcome: "+Customer.getCustomer_name());
        id_label_3 = new JLabel("Your ID: "+Customer.getCustomerid());
        order_summary = new JLabel("Here's your order's summary");
        order_id_label = new JLabel("Order ID: "+Order.getOrderid());
        place_order = new JLabel();
        message_label = new JLabel();
        message_Label2 = new JLabel();
        timer_label = new JLabel();
        
        // create the main fram 
        
            // creat a wlecome Jlabel
                welcome_label_3.setHorizontalTextPosition(JLabel.CENTER); 
                welcome_label_3.setVerticalTextPosition(JLabel.BOTTOM); 
                welcome_label_3.setVerticalAlignment(JLabel.TOP);
                welcome_label_3.setHorizontalAlignment(JLabel.CENTER);
                welcome_label_3.setIconTextGap(35);
                welcome_label_3.setIcon(image_label);
                welcome_label_3.setForeground(new Color(0,0,0)); 
                welcome_label_3.setFont(new Font("Cavolini",Font.BOLD,20));
            
            // creat a id Jlabel
                id_label_3.setHorizontalTextPosition(JLabel.CENTER); 
                id_label_3.setVerticalTextPosition(JLabel.BOTTOM); 
                id_label_3.setVerticalAlignment(JLabel.TOP);
                id_label_3.setHorizontalAlignment(JLabel.CENTER);
                id_label_3.setBounds(180,150,200,50);
                id_label_3.setForeground(new Color(0,0,0)); 
                id_label_3.setFont(new Font("Cavolini",Font.BOLD,20));
            
            // creat order summeray labels
                order_summary.setFont(new Font("Cavolini",Font.BOLD,20));
                order_summary.setForeground(new Color(0,0,0));
                order_summary.setBounds(30,200,400,30);
            
            // creat order id label
                order_id_label.setFont(new Font("Cavolini",Font.BOLD,20));
                order_id_label.setForeground(new Color(0,0,0));
                order_id_label.setBounds(30,240,400,30);
            
            // creat order detail 
                Order.printOrderInfolabel(ncustomerwindow.getnoofproduct(),price_product);
            
            // creat place order label
                place_order.setText("Would you like to place the order ? :");
                place_order.setFont(new Font("Cavolini",Font.BOLD,20));
                place_order.setForeground(new Color(0,0,0));
                place_order.setBounds(80,530,400,30);
            
            // creat a Jbuttom for the place order
            
                // Creat yes buttom
                    YES.setFocusable(false);
                    YES.addActionListener(this);
                    YES.setBounds(90,580,80,30);
                
                // Creat no buttom
                    NO.setFocusable(false);
                    NO.addActionListener(this);
                    NO.setBounds(370,580,80,30);
                
            // Create message label 
                message_label.setFont(new Font("Cavolini",Font.BOLD,20));
                message_label.setBounds(80,650,500,30);
            
            // Create message label 2
                message_Label2.setFont(new Font("Cavolini",Font.BOLD,20));
                message_Label2.setBounds(80, 700, 500, 30);
            
            // create timer label
                timer_label.setText(String.valueOf(seconds)+" seconds lefts");
                timer_label.setForeground(Color.GREEN);
                timer_label.setFont(new Font("Cavolini",Font.BOLD,20));
                timer_label.setBounds(320,700,220,30);
                timer_label.setVisible(false);
            
            // creat jfram and its components
                new_window_detail_order.add(place_order);
                new_window_detail_order.add(order_summary);
                new_window_detail_order.add(order_id_label);
                new_window_detail_order.add(YES);
                new_window_detail_order.add(NO);
                new_window_detail_order.add(message_label);
                new_window_detail_order.add(message_Label2);
                new_window_detail_order.add(timer_label);
                new_window_detail_order.add(id_label_3);
                new_window_detail_order.add(welcome_label_3);
                new_window_detail_order.setVisible(true); 
                new_window_detail_order.setSize(580,800); 
                new_window_detail_order.setResizable(false);
                new_window_detail_order.setTitle("Mostafa programing project"); 
                new_window_detail_order.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                new_window_detail_order.getContentPane().setBackground(Color.white); 
                new_window_detail_order.setIconImage(imge_icon.getImage());
            
            // for make window in center for screen
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                // determine the new location
                    int w = new_window_detail_order.getSize().width;
                    int h = new_window_detail_order.getSize().height;
                    int x = (dim.width - w) / 2 ;
                    int y =(dim.height - h) / 2;
                        // move the new window
                            new_window_detail_order.setLocation(x,y);
    }
    
    // for the buttom place order action
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == YES) {
                message_label.setText("your order successfully placed");
                message_label.setVisible(true);
                message_label.setForeground(Color.GREEN);
                message_Label2.setText("Thanks for use our system");
                message_Label2.setVisible(true);
                message_Label2.setForeground(Color.GREEN);
            }
            else if (e.getSource() == NO) {
                message_Label2.setText("Thanks for use our system");
                message_Label2.setVisible(true);
                message_Label2.setBounds(80,650,500,30);
                message_Label2.setForeground(Color.GREEN);
                message_label.setText("System will exit after ");
                timer_label.setVisible(true);
                message_label.setForeground(Color.GREEN);
                message_label.setBounds(80, 700, 300, 30);
                time.start();
            }
        }
}
