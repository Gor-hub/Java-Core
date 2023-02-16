package homework.employee;

import homework.employee.model.Employee;
import homework.employee.storage.EmployeeStorage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();
    static SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        employeeStorage.addEmployee(new Employee("poxos", "poxosyan", "a001", 100.0, "company", "jr manager", sd.parse("25/02/1985")));
        employeeStorage.addEmployee(new Employee("poxos", "poxosyan", "a002", 200.0, "company", "manager", sd.parse("24/02/1982")));
        employeeStorage.addEmployee(new Employee("poxos", "poxosyan", "a003", 300.0, "company", "sr manager", sd.parse("15/08/1975")));

        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.printAllEmployee();
                    break;
                case "3":
                    getEmployeesById();
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByCompany(companyName);
                    break;
                case "5":
                    searchEmployeesBySalaryRange();
                    break;
                case "6":
                    changeEmployeePositionById();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inactivateEmployeeById();
                    break;
                case "9":
                    activateEmployeeById();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void inactivateEmployeeById() {
        employeeStorage.printByStatus(true);
        System.out.println("Please chose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            employee.setActive(false);
            System.out.println("Employee inactivated!");
        } else {
            System.out.println("Employee does not exists,please try again6");
        }
    }

    private static void activateEmployeeById() {
        employeeStorage.printByStatus(false);
        System.out.println("Please chose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null && !employee.isActive()) {
            employee.setActive(true);
            System.out.println("Employee activated!");
        } else {
            System.out.println("Employee does not exists,or employee already active");
        }
    }

    private static void changeEmployeePositionById() {
        employeeStorage.printAllEmployee();
        System.out.println("Please chose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            System.out.println("please input new position");
            String newPosition = scanner.nextLine();
            employee.setPosition(newPosition);
            System.out.println("Position changed!");
        } else {
            System.out.println("Employee does not exists,please try again6");
        }
    }


    private static void searchEmployeesBySalaryRange() {
        System.out.println("Please input min of range");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minSalary = Double.parseDouble(salaryRange[0]);
        double maxSalary = Double.parseDouble(salaryRange[1]);
        if (minSalary > maxSalary) {
            System.out.println("min salary should by less than max salary");
        } else {
            employeeStorage.searchBySalaryRange(minSalary, maxSalary);
        }
    }


    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print all employees");
        System.out.println("Please input 3 for search by id");
        System.out.println("Please input 4 for search by company name");
        System.out.println("Please input 5 for search employees by salary range");
        System.out.println("Please input 6 for change employee position by id");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactive employee by id");
        System.out.println("Please input 9 for activate employee by id");

    }

    private static void getEmployeesById() {
        System.out.println("Please input Id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Employee with " + employeeId + "does nt exists");
        } else {
            System.out.println(employee);
        }
    }

    static void addEmployee() throws ParseException {
        System.out.println("please input name, surname, employeeId, salary, company, position,date of birthday(dd/mm/yyy)");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Date dateOfBirthday = sd.parse(employeeData[6]);
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            Employee newEmployee = new Employee(employeeData[0], employeeData[1], employeeData[2], Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5], dateOfBirthday);
            employeeStorage.addEmployee(newEmployee);
            System.out.println("Employee was added");
        } else {
            System.out.println("Employee with " + employeeId + " already exists!!!");
        }
    }
}
