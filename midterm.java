import java.util.ArrayList;

public class Employee {
    private String name;
    private int age;
    private String position;
    private String empID;
    private ArrayList<Project> myProjects;

    public Employee(String name, int age, String position, String empID) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.empID = empID;
        this.myProjects = new ArrayList<Project>();
    }

    public void addProject(Project project) {
        myProjects.add(project);
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Employee ID: " + empID);
        System.out.println("Projects:");
        for (Project project : myProjects) {
            System.out.println("- " + project.getProjectName());
        }
    }
   public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Job {
    private String position;
    private int empID;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
}
public class Project {
    private String projectName;
    private String description;

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getDescription() {
        return description;
    }
}
public class Main {
    public static void main(String[] args) {
       
        Employee employee = new Employee("John", 30, "Manager", "E12345");

        Project project1 = new Project("Project A", "Description A");
        Project project2 = new Project("Project B", "Description B");
        employee.addProject(project1);
        employee.addProject(project2);

        employee.showDetails();
    }
}


 
}


         


    