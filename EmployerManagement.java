import java.util.Scanner;

class Employer {
    private int eNo;
    private String eName;
    private double eSalary;
    
    public Employer(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
    
    public int getENo() {
        return eNo;
    }
    
    public String getEName() {
        return eName;
    }
    
    public double getESalary() {
        return eSalary;
    }
}

public class EmployerManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        
        Employer[] employees = new Employer[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            
            System.out.print("eNo: ");
            int eNo = scanner.nextInt();
            
            System.out.print("eName: ");
            String eName = scanner.next();
            
            System.out.print("eSalary: ");
            double eSalary = scanner.nextDouble();
            
            employees[i] = new Employer(eNo, eName, eSalary);
        }
        
        System.out.print("Enter the employee number to search for: ");
        int searchENo = scanner.nextInt();
        
        boolean found = false;
        for (Employer employee : employees) {
            if (employee.getENo() == searchENo) {
                System.out.println("Employee Found!");
                System.out.println("eNo: " + employee.getENo());
                System.out.println("eName: " + employee.getEName());
                System.out.println("eSalary: " + employee.getESalary());
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Employee not found!");
        }
        
        scanner.close();
    }
}
