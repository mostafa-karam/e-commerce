// This is a subclass of Product that represents book products
public class Book_Product extends Product{
    
        private String author;
        private String publisher;
    
        public Book_Product(){
        }
        public Book_Product( String name, int productId, float price , String author, String publisher){
            super(name, productId, price);
            this.author = author;
            this.publisher = publisher;
        }
    
        public void setauthor(String author){
            this.author = author;
        }
        public void setpublisher(String publisher){
            this.publisher = publisher;
        }
        
        public String getauthor(){
            return author;
        }
        public String getpublisher(){
            return publisher;
        }
}