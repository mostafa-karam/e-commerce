// This is the superclass that represents a generic product. 
public class Product {
    
        private String name;
        private int Product_ID;
        private float price;
    
        public Product(){
        }
        public Product(String name, int Product_ID, float price) {
            this.name = name;
            this.Product_ID = Math.abs(Product_ID);
            this.price = Math.abs(price);
        }
    
        public void setproductid(int Product_ID){
            this.Product_ID = Math.abs(Product_ID);
        }
        public void setname(String name){
            this.name = name;
        }
        public void setprice(float price){
            this.price = Math.abs(price);
        }
        
        public int getProductid(){
            return Product_ID;
        }
        public String getname(){
            return name;
        }
        public float getprice(){
            return price;
        }
}