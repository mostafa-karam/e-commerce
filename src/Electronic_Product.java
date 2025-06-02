// This is a subclass of Product that represents electronic products. 
public class Electronic_Product extends Product{
    
        private String brand;
        private int Warrannty_Period;
    
        public Electronic_Product(){
        }
        public Electronic_Product( String name, int productId, float price , String brand, int Warrannty_Period) {
            super(name, productId , price);
            this.brand = brand;
            this.Warrannty_Period = Math.abs(Warrannty_Period);
        }
    
        public void setbrand(String brand) {
            this.brand = brand;
        }
        public void setWarrannty_Period(int Warrannty_Period){
            this.Warrannty_Period = Math.abs(Warrannty_Period);
        }
        
        public String getbrand() {
            return brand;
        }
        public int getWarrannty_Period(){
            return Warrannty_Period;
        }
}