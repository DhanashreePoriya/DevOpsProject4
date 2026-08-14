// Base class
class Employee {
    int employeeId;
    String name;
    double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
    }
}

// First derived class (Inherits from Employee)
class Programmer extends Employee {
    String programmingLanguage;
    int experience;

    Programmer(int employeeId, String name, double basicSalary, String programmingLanguage, int experience) {
        super(employeeId, name, basicSalary); // Calls base class constructor
        this.programmingLanguage = programmingLanguage;
        this.experience = experience;
    }

    void displayProgrammerDetails() {
        displayEmployeeDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Experience: " + experience + " years");
    }
}

// Second derived class (Inherits from Programmer to achieve Multilevel Inheritance)
class Tester extends Programmer {
    String testingTool;
    String automationFramework;

    Tester(int employeeId, String name, double basicSalary, String programmingLanguage, int experience, String testingTool, String automationFramework) {
        super(employeeId, name, basicSalary, programmingLanguage, experience); // Calls Programmer constructor
        this.testingTool = testingTool;
        this.automationFramework = automationFramework;
    }

    void displayTesterDetails() {
        displayProgrammerDetails();
        System.out.println("Testing Tool: " + testingTool);
        System.out.println("Automation Framework: " + automationFramework);
    }
}

// Third derived class (Inherits from Employee to show Hierarchical structure)
class HR extends Employee {
    int recruitmentCount;
    String region;

    HR(int employeeId, String name, double basicSalary, int recruitmentCount, String region) {
        super(employeeId, name, basicSalary); // Calls base class constructor
        this.recruitmentCount = recruitmentCount;
        this.region = region;
    }

    void displayHRDetails() {
        displayEmployeeDetails();
        System.out.println("Recruitment Count: " + recruitmentCount);
        System.out.println("Region: " + region);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Tester Details (Multilevel Inheritance: Employee -> Programmer -> Tester) ---");
        Tester tester = new Tester(101, "Alice Smith", 85000, "Java", 5, "Selenium", "TestNG");
        tester.displayTesterDetails();

        System.out.println("\n--- HR Details (Hierarchical Inheritance: Employee -> HR) ---");
        HR hr = new HR(102, "Bob Jones", 70000, 25, "North America");
        hr.displayHRDetails();
    }
}
