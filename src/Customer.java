// This class represents a customer. 
public class Customer {
    
        protected static int Customer_ID;
        protected static String Customer_name;
        protected String address;
    
        public Customer(){
        }
        public Customer(int Customer_ID, String Customer_name, String address) {
            Customer.Customer_ID = Math.abs(Customer_ID);
            Customer.Customer_name = Customer_name;
            this.address = address;
        } 
        public void setcustomerid(int customerid){
            Customer_ID = Math.abs(customerid);
        }
        public void setaddress(String address){
            this.address = address;
        }
        public void setCustomer_name(String Customer_name){
            Customer.Customer_name = Customer_name;
        }
        
        public static String getCustomer_name(){
            return Customer_name;
        }
        public static int getCustomerid(){
            return Customer_ID;
        }
        public String getaddress(){
            return address;
        }
}