// This class represents an order placed by a customer. 
// for GUI
    import javax.swing.JLabel;
    import java.awt.Color;
    import java.awt.Font;
    import javax.swing.JTextArea;
    import javax.swing.JScrollPane;

public class Order {
    // for GUI
        static JLabel yproduct;
        static JLabel proddetail;
        static JLabel newline;
        static JLabel total;
        
        static JTextArea text_detail;
        static JScrollPane sp ;
        static StringBuilder sb;
    
        private static int Customer_id;
        private static int Order_id = 0;
        private static String[] products;
        private static float total_price;
    
        public Order(){
            ++Order_id;
        }
        public Order(int Customer_id , String[] product ,float[] price_product_array,float totalprice){
            Order.Customer_id = Math.abs(Customer_id);
            Order.products = product;
            Order.total_price = totalprice;
            ++Order_id ;
            // for GUI
                yproduct = new JLabel();
                yproduct.setFont(new Font("Cavolini",Font.BOLD,20));
                yproduct.setForeground(new Color(0,0,0));
                proddetail = new JLabel();
                proddetail.setFont(new Font("Cavolini",Font.BOLD,20));
                proddetail.setForeground(new Color(0,0,0));
                total = new JLabel();
                total.setFont(new Font("Cavolini",Font.BOLD,20));
                total.setForeground(new Color(0,0,0));
        }
        public static int getOrderid (){
            return Order_id;
        }
    // Print order info methods
        public static void printOrderInfo(int no_of_products,float[] priceorder){
            System.out.println("Here's your order's summary");
            System.out.println("Order ID: "+Order_id);
            System.out.println("Customer ID: "+Customer_id);
            System.out.println("Your  Products: ");
                for(int i=0; i<no_of_products; i++){
                    System.out.println((i+1)+" - "+products[i]+" - "+priceorder[i]);
                    }
            System.out.println("total price: $"+total_price);
        }
    
    // for GUI 
        public static void printOrderInfolabel(int no_of_products,float[] priceorder){
            yproduct.setText("Your  Products: ");
            yproduct.setBounds(30,280,200,20);
            ndetailorderwindow.new_window_detail_order.add(yproduct);
            text_detail = new JTextArea();
            text_detail.setFont(new Font("Cavolini",Font.BOLD,20));
            text_detail.setForeground(new Color(0,0,0));
            text_detail.setEditable(false);
            text_detail.setLineWrap(true);
            text_detail.setWrapStyleWord(true);
            sp = new JScrollPane(text_detail);
            sb = new StringBuilder();
                for(int i = 0 ; i < no_of_products ; i++){
                    sb.append((i+1)+" - "+products[i]+" - $"+priceorder[i]).append("\n");
                }
            text_detail.setText(sb.toString());
            text_detail.setCaretPosition(0);
            sp.setBounds(30,310,350,165);
            ndetailorderwindow.new_window_detail_order.add(sp);
            total.setText("total price: $"+total_price);
            total.setBounds(30, 490, 400,20);
            ndetailorderwindow.new_window_detail_order.add(total);
        }
}