import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ncustomerwindow implements ActionListener{
    static String Customer_name;
    static int Customer_id;
    static String Customer_address;
    static int number_of_products;
    
    JFrame new_window_Frame_customer = new JFrame();
    
    JLabel welcome_label = new JLabel("Welcome Sir  "); 
    JLabel customer_name = new JLabel("Your name: ");
    JLabel customer_address = new JLabel("Your Address: ");
    JLabel customer_id = new JLabel("Your ID: ");
    JLabel noprosucts = new JLabel("No of products ?: ");
    
    ImageIcon image_label = new ImageIcon("img/LOGO.png");
    ImageIcon imge_icon = new ImageIcon("img/LOGO.png"); 
    
    JTextField text_field_customer_name = new JTextField();
    JTextField text_field_customer_address = new JTextField();
    JTextField text_field_customer_id = new JTextField();
    JTextField text_field_no_of_products = new JTextField();
    
    JButton add_customer_Submit = new JButton("Submit");
    
    public ncustomerwindow(){
        // create the main fram 
        
            // creat a wlecome Jlabel
                welcome_label.setHorizontalTextPosition(JLabel.CENTER); 
                welcome_label.setVerticalTextPosition(JLabel.BOTTOM); 
                welcome_label.setVerticalAlignment(JLabel.TOP);
                welcome_label.setHorizontalAlignment(JLabel.CENTER);
                welcome_label.setIconTextGap(35);
                welcome_label.setIcon(image_label);
                welcome_label.setForeground(new Color(0,0,0)); 
                welcome_label.setFont(new Font("Cavolini",Font.BOLD,20)); 
            
            // create a customer name JLabel
                customer_name.setForeground(new Color(0,0,0)); 
                customer_name.setFont(new Font("Cavolini",Font.BOLD,20));
                customer_name.setBounds(60,180 ,200 ,100 );
                // create A TEXTFILD FOR USER NAME
                    text_field_customer_name.setBounds(290,220,230,25);
            
            // crear a customer address JLabel
                customer_address.setForeground(new Color(0,0,0)); 
                customer_address.setFont(new Font("Cavolini",Font.BOLD,20));
                customer_address.setBounds(60,240,200,100);
                // create A TEXTFILD FOR USER address
                    text_field_customer_address.setBounds(290,280,230,25);
            
            // crear a customer ID JLabel
                customer_id.setForeground(new Color(0,0,0)); 
                customer_id.setFont(new Font("Cavolini",Font.BOLD,20));
                customer_id.setBounds(60,290,200,100);
                // create A TEXTFILD FOR USER address
                    text_field_customer_id.setBounds(290,330,230,25);
            
            // crear a customer noprosucts JLabel
                noprosucts.setForeground(new Color(0,0,0));
                noprosucts.setFont(new Font("Cavolini",Font.BOLD,20));
                noprosucts.setBounds(60,340,580,100);
                // create A TEXTFILD FOR noprosucts
                    text_field_no_of_products.setBounds(290,380,230,25);
            
            // creat a jbotom
                add_customer_Submit.setBounds(220,450,100,30);
                add_customer_Submit.setFocusable(false);
                add_customer_Submit.addActionListener(this);
            
            // Creat a jframe and its componnents
                new_window_Frame_customer.add(customer_name); 
                new_window_Frame_customer.add(text_field_customer_name);
                new_window_Frame_customer.add(customer_id);
                new_window_Frame_customer.add(text_field_customer_id);
                new_window_Frame_customer.add(noprosucts);
                new_window_Frame_customer.add(text_field_no_of_products);
                new_window_Frame_customer.add(customer_address); 
                new_window_Frame_customer.add(text_field_customer_address);
                new_window_Frame_customer.add(add_customer_Submit);
                new_window_Frame_customer.add(welcome_label);
                new_window_Frame_customer.setVisible(true); 
                new_window_Frame_customer.setSize(580,550); 
                new_window_Frame_customer.setResizable(false);
                new_window_Frame_customer.setTitle("Mostafa programing project"); 
                new_window_Frame_customer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                new_window_Frame_customer.getContentPane().setBackground(Color.white); 
                new_window_Frame_customer.setIconImage(imge_icon.getImage());
                
                // for make window in center for screen
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                // determine the new location
                    int w = new_window_Frame_customer.getSize().width;
                    int h = new_window_Frame_customer.getSize().height;
                    int x = (dim.width - w) / 2 ;
                    int y =(dim.height - h) / 2;
                        // move to new location
                            new_window_Frame_customer.setLocation(x,y);
        
    }
    // getters
        public static int getCustomerid(){
            return Customer_id;
        }
        public static String getCustomer_name(){
            return Customer_name;
        }
        public static String getaddress(){
            return Customer_address;
        }
        public static int getnoofproduct(){
            return number_of_products;
        }

    // for the buttom acttion
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == add_customer_Submit) {
                new_window_Frame_customer.setVisible(false);
                fill();
                new norderwindow();     
            }
        }

    // method to fill customer class
        public void fill(){
            String customername = text_field_customer_name.getText();
                Customer_name =customername;
            String address = text_field_customer_address.getText();
                Customer_address =address;
            int id = Integer.parseInt(text_field_customer_id.getText());
                Customer_id =id;
            int npro = Integer.parseInt(text_field_no_of_products.getText());
                number_of_products = npro;
            new Customer(Customer_id , Customer_name , Customer_address);
            }
}
