public class student {
    private String ID;
    private String name;
    private int admissionYear;
    private double GPA;
    
    public student(String ID, String name, int admissionYear, double GPA) {
        this.ID = ID;
        this.name = name;
        this.admissionYear = admissionYear;
        this.GPA = GPA;
    }
    
    public void showDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("GPA: " + GPA);
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }
    
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    public static void main(String[] args) {
        student student = new student("65022476", "kaning", 2020, 3.);
        
        student.showDetails();
         
    }
}
