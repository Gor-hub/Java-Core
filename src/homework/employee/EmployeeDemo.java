package homework.employee;


import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        Boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for printing all employees");
            System.out.println("Please input 3 for search employee by employeeID");
            System.out.println("Please input 4 for search employee by company");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employeeID");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input salary");
                    String salaryStr = scanner.nextLine();
                    double salary = Double.parseDouble(salaryStr);
                    System.out.println("Please input company");
                    String company = scanner.nextLine();
                    System.out.println("Please input position");
                    String position = scanner.nextLine();
                    Empoyee  employee = new Empoyee(name,surname, employeeID,salary,company,position);
                    employeeStorage.add(employee);
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input employeeID");
                    String ID = scanner.nextLine();
                    employeeStorage.searchByID(ID);
                    break;
                case "4":
                    System.out.println("Please input company");
                    String companyIn = scanner.nextLine();
                    employeeStorage.searchByCompany(companyIn);
                    break;
                default:

                    System.err.println("WRONG COMMAND. Please try again");
            }
        }
        System.out.println("Bay bay");
    }
}