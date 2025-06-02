// This class represents a shopping cart. 
public class Cart {
    
        private static int Customer_ID;
        private static int no_of_products;
        private static String[] A_products;
        
    
        public Cart(){
            A_products = new String[no_of_products];
        }
        public Cart(int Customer_ID, int no_of_products){
            Cart.Customer_ID = Math.abs(Customer_ID);
            Cart.no_of_products = Math.abs(no_of_products);
            A_products = new String[no_of_products];
        }
        
        public void setCustomer_ID(){
            Customer_ID = Math.abs(Customer_ID);
        }
        public void setnoproduct(int nofproducts){
            no_of_products = Math.abs(nofproducts);
        }
        public void setproduct(){
            A_products = new String[no_of_products];
        }
        
        public int getnproduct(){
            return no_of_products;
        }
        public static void getproducts(){
            for (int i=0; i<A_products.length; i++){
                System.out.println(A_products[i]);
            }
        }
        public int getCustomerid(){
            return Customer_ID;
        }

    // Methods 
        // add methods 
            public static void addproduct(String addproduct , int productnumber){
                A_products[productnumber] = addproduct;
            }
        // remove methods
            public void removeproduct(String removeproduct){
                for (int i = 0; i <= A_products.length; i++){
                    if (A_products[i] == removeproduct){
                        A_products[i] = null;
                        System.out.println( "Product is removed successfully");
                    }
                }
            }
        
        // calcutate methods
            public static float calculatePrice(float[] price_product_array){
                float total_price=0.0f;
                for(int i=0; i<price_product_array.length; i++){
                    if(A_products != null){
                    float t = price_product_array[i];
                    total_price += t;
                    }
                    else {
                    System.out.println("Skipping null product at index "+i+"Skipping");
                    }
                }
                return total_price;
            }
        // placeorder methods
            public static void placeorder(int user_ques,float[] price_product_array){
                switch (user_ques) {
                    case 1:
                        System.out.println("your order successfully placed");
                        Order.printOrderInfo(no_of_products ,price_product_array);
                        break;  
                    case 2:
                        System.out.println("your order hasn't placed");
                    default:
                    System.out.println("Somthing Went pls try agin");
                        break;
                }
            }
}