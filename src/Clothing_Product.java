// This is a subclass of Product that represents clothing products.  
public class Clothing_Product extends Product {
    
        private String size;
        private String Fabric;
    
        public Clothing_Product(){
        }
        public Clothing_Product( String name, int productId, float price , String size, String Fabric) {
            super(name, productId, price);
            this.size = size;
            this.Fabric = Fabric;
        }
    
        public void setSize(String size) {
            this.size = size;
        }
        public void setFabric(String fabric) {
            Fabric = fabric;
        }
        
        public String getSize() {
            return size;
        }
        public String getFabric() {
            return Fabric;
        }
}
