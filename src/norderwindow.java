import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;

public class norderwindow  implements ActionListener{
    static float[] priceprod = new float[ncustomerwindow.getnoofproduct()];
    static String[] prod = new String[ncustomerwindow.getnoofproduct()];
    static Cart c= new Cart (Customer.getCustomerid() ,ncustomerwindow.getnoofproduct());
    
    int x =ncustomerwindow.getnoofproduct();
    int y=0;
    static float tprice =0;
    
    JFrame new_window_Frame_order = new JFrame();
    
    JLabel welcome_label_2;
    JLabel id_label ;
    JLabel Electronic_Product_IMG_Label ;
    JLabel Clothing_Product_IMG_Label;
    JLabel Book_Product_IMG_Label;
    JLabel messagLabel;
    JLabel numberlabel;
    
    ImageIcon image_label;
    ImageIcon imge_icon ;
    ImageIcon Electronic_Product_IMG ;
    ImageIcon Clothing_Product_IMG;
    ImageIcon Book_Product_IMG;
    
    JButton Electronic_Product_IMG_addButton ;
    JButton Clothing_Product_IMG_addButton;
    JButton Book_Product_IMG_addButton;
    JButton next;
    
    Electronic_Product new_E_product;
    Clothing_Product new_C_product;
    Book_Product new_B_product;
    
    public norderwindow() {
        new_E_product = new Electronic_Product("Smartphone",1,599.99f,"Samsung",1);
        new_C_product = new Clothing_Product("T-Shirt", 2 , 19.99f, "Medium", "Cotton");
        new_B_product = new Book_Product("OOP", 3, 39.99f, "O’Reill", "X Publication");
        
        welcome_label_2 = new JLabel("Welcome: "+Customer.getCustomer_name());
        id_label = new JLabel("Your ID: "+Customer.getCustomerid());
        
        image_label = new ImageIcon("img/LOGO.png");
        imge_icon = new ImageIcon("img/LOGO.png");
        
        Electronic_Product_IMG = new ImageIcon("img/Electronic_Product.png");
        Electronic_Product_IMG_Label = new JLabel("");
        Electronic_Product_IMG_addButton = new JButton("Add phone");
        
        Clothing_Product_IMG = new ImageIcon("img/Clothing_Product.png");
        Clothing_Product_IMG_Label = new JLabel("");
        Clothing_Product_IMG_addButton = new JButton("Add T-shirt");
        
        Book_Product_IMG = new ImageIcon("img/Book_product.png");
        Book_Product_IMG_Label = new JLabel("");
        Book_Product_IMG_addButton = new JButton("Add Book");
        
        messagLabel = new JLabel();
        numberlabel = new JLabel();
        
        next = new JButton("Next");
        
        // create the main fram 
        
            // creat Electronic_product img
                Electronic_Product_IMG_Label.setIcon(Electronic_Product_IMG);
                Electronic_Product_IMG_Label.setBounds(35,220,100,106);
                // creat Electronic_product buttom
                    Electronic_Product_IMG_addButton.setBounds(35,360,100,25);
                    Electronic_Product_IMG_addButton.setFocusable(false);
                    Electronic_Product_IMG_addButton.addActionListener(this);
            
            // creat Clothing_product img
                Clothing_Product_IMG_Label.setIcon(Clothing_Product_IMG);
                Clothing_Product_IMG_Label.setBounds(230,220,100,100);
                // creat Clothing_product boutton
                    Clothing_Product_IMG_addButton.setBounds(230,360,100,25);
                    Clothing_Product_IMG_addButton.setFocusable(false);
                    Clothing_Product_IMG_addButton.addActionListener(this);
            
            // creat book_product img
                Book_Product_IMG_Label.setIcon(Book_Product_IMG);
                Book_Product_IMG_Label.setBounds(440,220,100,115);
                // creat book_product botton
                    Book_Product_IMG_addButton.setBounds(440,360,100,25);
                    Book_Product_IMG_addButton.setFocusable(false);
                    Book_Product_IMG_addButton.addActionListener(this);
            
            // creat message label
                messagLabel.setFont(new Font("Cavolini",Font.BOLD,20));
                messagLabel.setBounds(100,420,500,40);
            
            // creat number label
                numberlabel.setFont(new Font("Cavolini",Font.BOLD,20));
                numberlabel.setBounds(100,460,500,40);
            
            // creat Next button
                next.setBounds(250,510,90,40);
                next.setVisible(false);
                next.setFocusable(false);
                next.addActionListener(this);
            
            // creat a wlecome Jlabel
                welcome_label_2.setHorizontalTextPosition(JLabel.CENTER); 
                welcome_label_2.setVerticalTextPosition(JLabel.BOTTOM); 
                welcome_label_2.setVerticalAlignment(JLabel.TOP);
                welcome_label_2.setHorizontalAlignment(JLabel.CENTER);
                welcome_label_2.setIconTextGap(35);
                welcome_label_2.setIcon(image_label);
                welcome_label_2.setForeground(new Color(0,0,0)); 
                welcome_label_2.setFont(new Font("Cavolini",Font.BOLD,20));
            
            // creat a id Jlabel
                id_label.setHorizontalTextPosition(JLabel.CENTER); 
                id_label.setVerticalTextPosition(JLabel.BOTTOM); 
                id_label.setVerticalAlignment(JLabel.TOP);
                id_label.setHorizontalAlignment(JLabel.CENTER);
                id_label.setBounds(180,150,200,50);
                id_label.setForeground(new Color(0,0,0)); 
                id_label.setFont(new Font("Cavolini",Font.BOLD,20));
            
            // creat jfram and its components
                new_window_Frame_order.add(next);
                new_window_Frame_order.add(messagLabel);
                new_window_Frame_order.add(numberlabel);
                new_window_Frame_order.add(Electronic_Product_IMG_Label);
                new_window_Frame_order.add(Clothing_Product_IMG_Label);
                new_window_Frame_order.add(Electronic_Product_IMG_addButton);
                new_window_Frame_order.add(Book_Product_IMG_Label);
                new_window_Frame_order.add(Clothing_Product_IMG_addButton);
                new_window_Frame_order.add(Book_Product_IMG_addButton);
                new_window_Frame_order.add(id_label);
                new_window_Frame_order.add(welcome_label_2);
                new_window_Frame_order.setVisible(true); 
                new_window_Frame_order.setSize(580,600); 
                new_window_Frame_order.setResizable(false);
                new_window_Frame_order.setTitle("Mostafa programing project"); 
                new_window_Frame_order.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                new_window_Frame_order.getContentPane().setBackground(Color.white); 
                new_window_Frame_order.setIconImage(imge_icon.getImage());
            
            // for make window in center for screen
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                // determine the new location
                    int w = new_window_Frame_order.getSize().width;
                    int h = new_window_Frame_order.getSize().height;
                    int x = (dim.width - w) / 2 ;
                    int y =(dim.height - h) / 2;
                        // move to new location
                            new_window_Frame_order.setLocation(x,y);
    } 
    
    // for the buttom
        @Override
        public void actionPerformed(ActionEvent e) {
            // for electronic buttom
                if (e.getSource() == Electronic_Product_IMG_addButton && y<x && y!=(x-1)) {
                    messagLabel.setText("The Phone product add successfully");
                    messagLabel.setForeground(Color.GREEN);
                    numberlabel.setText((y+1)+" item/s add to cart");
                    numberlabel.setForeground(Color.GREEN);
                    prod[y]=new_E_product.getname();
                    priceprod[y] = new_E_product.getprice();
                    tprice = tprice + new_E_product.getprice();
                    ++y;
                }
                else if (e.getSource() == Electronic_Product_IMG_addButton && y==(x-1)) {
                    messagLabel.setText("The Phone product add successfully");
                    messagLabel.setForeground(Color.GREEN);
                    numberlabel.setText((y+1)+" item/s add to cart");
                    numberlabel.setForeground(Color.GREEN);
                    prod[y]=new_E_product.getname();
                    priceprod[y] = new_E_product.getprice();
                    tprice = tprice + new_E_product.getprice();
                    ++y;
                    next.setVisible(true);
                }
                else if (e.getSource() == Electronic_Product_IMG_addButton && y==x) {
                    messagLabel.setText("The Cart is full");
                    messagLabel.setForeground(Color.red);
                    numberlabel.setVisible(false);
                    next.setVisible(true);
                }
            
            // for clothing buttom
                else if (e.getSource() == Clothing_Product_IMG_addButton && y<x && y!=(x-1)) {
                    messagLabel.setText("The Clothing product add successfully");
                    messagLabel.setForeground(Color.GREEN);
                    numberlabel.setText((y+1)+" item/s add to cart");
                    numberlabel.setForeground(Color.GREEN);
                    prod[y] = new_C_product.getname();
                    priceprod[y] = new_C_product.getprice();
                    tprice = tprice + new_C_product.getprice();
                    ++y;
                } 
                else if (e.getSource() == Clothing_Product_IMG_addButton && y==(x-1)) {
                    messagLabel.setText("The Clothing product add successfully");
                    messagLabel.setForeground(Color.GREEN);
                    numberlabel.setText((y+1)+" item/s add to cart");
                    numberlabel.setForeground(Color.GREEN);
                    prod[y] = new_C_product.getname();
                    priceprod[y] = new_C_product.getprice();
                    tprice = tprice + new_C_product.getprice();
                    ++y;
                    next.setVisible(true);
                }
                else if (e.getSource() == Clothing_Product_IMG_addButton && y==x) {
                    messagLabel.setText("The Cart is full");
                    messagLabel.setForeground(Color.red);
                    numberlabel.setVisible(false);
                    next.setVisible(true);
                }
            
            // for book buttom
                else if(e.getSource() == Book_Product_IMG_addButton && y<x && y!=(x-1)){
                    messagLabel.setText("The Book product add successfully");
                    messagLabel.setForeground(Color.GREEN);
                    numberlabel.setText((y+1)+" item/s add to cart");
                    numberlabel.setForeground(Color.GREEN);
                    prod[y] = new_B_product.getname();
                    priceprod[y] = new_B_product.getprice();
                    tprice = tprice + new_B_product.getprice();
                    ++y;
                }
                else if(e.getSource() == Book_Product_IMG_addButton && y==(x-1)){
                    messagLabel.setText("The Book product add successfully");
                    messagLabel.setForeground(Color.GREEN);
                    numberlabel.setText((y+1)+" item/s add to cart");
                    numberlabel.setForeground(Color.GREEN);
                    prod[y] = new_B_product.getname();
                    priceprod[y] = new_B_product.getprice();
                    tprice = tprice + new_B_product.getprice();
                    ++y;
                    next.setVisible(true);
                }
                else if (e.getSource() == Book_Product_IMG_addButton && y==x) {
                    messagLabel.setText("The Cart is full");
                    messagLabel.setForeground(Color.red);
                    numberlabel.setVisible(false);
                    next.setVisible(true);
                }
            
            // for next buttom
                else if (e.getSource() == next){
                    new Order(Customer.getCustomerid(),prod,priceprod,tprice);
                    new_window_Frame_order.setVisible(false);
                    new ndetailorderwindow(priceprod);
                }
        }
}