import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;

    void getEmployeeDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
        sc.nextLine();
    }

    void displayEmployeeDetails() {
        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Programmer extends Employee {
    String programmingLanguage;
    int experience;

    void getProgrammerDetails(Scanner sc) {
        getEmployeeDetails(sc);

        System.out.print("Enter Programming Language: ");
        programmingLanguage = sc.nextLine();

        System.out.print("Enter Experience (Years): ");
        experience = sc.nextInt();
        sc.nextLine();
    }

    void displayProgrammerDetails() {
        displayEmployeeDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Experience: " + experience + " Years");
    }
}

class Tester extends Employee {
    String testingTool;
    String automationFramework;

    void getTesterDetails(Scanner sc) {
        getEmployeeDetails(sc);

        System.out.print("Enter Testing Tool: ");
        testingTool = sc.nextLine();

        System.out.print("Enter Automation Framework: ");
        automationFramework = sc.nextLine();
    }

    void displayTesterDetails() {
        displayEmployeeDetails();
        System.out.println("Testing Tool: " + testingTool);
        System.out.println("Automation Framework: " + automationFramework);
    }
}

class HR extends Employee {
    int recruitmentCount;
    String region;

    void getHRDetails(Scanner sc) {
        getEmployeeDetails(sc);

        System.out.print("Enter Recruitment Count: ");
        recruitmentCount = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Region: ");
        region = sc.nextLine();
    }

    void displayHRDetails() {
        displayEmployeeDetails();
        System.out.println("Recruitment Count: " + recruitmentCount);
        System.out.println("Region: " + region);
    }
}

public class Employeee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Programmer Details -----");
        Programmer p = new Programmer();
        p.getProgrammerDetails(sc);
        p.displayProgrammerDetails();

        System.out.println("\n----- Tester Details -----");
        Tester t = new Tester();
        t.getTesterDetails(sc);
        t.displayTesterDetails();

        System.out.println("\n----- HR Details -----");
        HR h = new HR();
        h.getHRDetails(sc);
        h.displayHRDetails();

        sc.close();
    }
}
