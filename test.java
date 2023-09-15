public class test {
    public String Productname;
    public double Productprice;
    public String Brand;
    public String Model;
    public String Author;
    public double NumberofPager;
    public  Television(String ProductName, double Productprice, String Brand, String Model) {
        this.ProductName = ProductName;
        this.Productprice = Productprice;
        this.Brand = Brand;
        this.Model = Model;
}
public void showDetails() {
    System.out.println("Product Name: " + Television);
    System.out.println("Product Price: " + 20000.0);
    System.out.println("Brand: " + Samsung);
    System.out.println("Model: " + Neo QLED);
}
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }
    
    public void setProductPrice(double Productprice) {
        this.Productprice = Productprice;
    }
    
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
    
    public void setModel(String Model) {
        this.Model = Model;
    }
    
    public static void main(String[] args) {
        Television  = new Television ("Telavision", "20000.0", Samsung, Neo QLED);
        
        Television.showDetails();
         
    }
}



