public class midterm {
class Product {
        private String name;
        private Double price;

       
        public String getName(){
            return this.name;
        }
        public void setName(String name){
                this.name = name ;
                System.out.println("Product Name : " + name);
        }

        
        public Double getPrice(){
            return this.price;
        }
        public void setPrice(Double price){
            this.price = price;
            System.out.println("Product Price : " + price);
        }
       
    }

    class Electronics extends Product{
        private String brand;
        private String model;

        
      
        public String getBrand(){
            return this.brand;
        }
        public void setBrand(String brand){
            this.brand = brand;
            System.out.println("Brand : " + brand);
        }

        public String getModel(){
            return this.model;
        }
        public void setModel(String model){
            this.model = model;
            System.out.println("Modle : " + model);
        }

        
    }
    class Smartphone extends Electronics{
        private String operatingSystem;

        public String getOperatingSystem(){
            return this.operatingSystem;
        }
        public void setOperatingSydtem(String operatingSystem){
            this.operatingSystem = operatingSystem;
            System.out.println("Operating System : " + operatingSystem);
        }
    }
    class Book extends Product {
        private String author;
        private int pages;

        
        public String getAuthor(){
            return this.author;
        }
        public void setAuthor(String author){
            this.author = author;
            System.out.println("Author : " + author);
        }
        public int getpages(){
            return this.pages;
        }
        public void setPages(int pages){
            this.pages = pages;
            System.out.println("Number of Pages : " + pages);        }

    }
    public class midthem2 {
    public static void main(String[] args) {
        Product PN = new Product();
        PN.setName("chair");
        PN.setPrice(500.0);
        

        Electronics E = new Electronics();
        E.setName("Television");
        E.setPrice(20000.0);
        E.setBrand("Samsung");
        E.setModel("Neo QLED");

        Smartphone s = new Smartphone();
        s.setName("Iphone");
        s.setPrice(40000.0);
        s.setBrand("Apple");
        s.setModel("Iphone 99");
        s.setOperatingSydtem("ios");

        Book b = new Book();
        b.setName("OOP Programming");
        b.setPrice(250.0);
        b.setAuthor("John Doe");
        b.setPages(300);
        

        
    }   
         
    }
 }
}

    
