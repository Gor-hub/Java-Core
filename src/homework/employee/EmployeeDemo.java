package homework.employee;

import homework.employee.model.Company;
import homework.employee.model.Employee;
import homework.employee.storage.CompanyStorage;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();
    static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        Company company = new Company("c001", "Gexam OOO", "Gyumri", "1234567");
        company.setCountOfEmployees(3);
        companyStorage.add(company);
        employeeStorage.add(new Employee("poxos", "poxosyan", "a001", 100.0, company, "jr manager", DateUtil.stringToDate("25/04/2002")));
        employeeStorage.add(new Employee("poxos", "poxosyan", "a002", 200.0, company, "manager", DateUtil.stringToDate("24/02/1982")));
        employeeStorage.add(new Employee("poxos", "poxosyan", "a003", 300.0, company, "sr manager", DateUtil.stringToDate("15/08/1975")));

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                case ADD_EMPLOYEES:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_EMPLOYEES:
                    employeeStorage.printAllEmployee();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    getEmployeesById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY:
                    companyStorage.print();
                    System.out.println("Please input company id");
                    String companyId = scanner.nextLine();
                    Company companyById = companyStorage.getCompanyById(companyId);
                    if (companyById != null) {
                        employeeStorage.searchByCompany(companyById);
                    } else {
                        System.out.println("Company does not exists!");
                    }

                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchEmployeesBySalaryRange();
                    break;
                case CHANGE_EMPLOYEE_POSITION:
                    changeEmployeePositionById();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printByStatus(true);
                    break;
                case INACTIVE_EMPLOYEES:
                    inactivateEmployeeById();
                    break;
                case ACTIVE_EMPLOYEES:
                    activateEmployeeById();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void addCompany() {
        System.out.println("Please input company id,name,address,phone");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById == null) {
            Company company = new Company(companyId, companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("Company added!");
        } else {
            System.out.println("Company with " + companyId + " already exists");
        }
    }

    private static void inactivateEmployeeById() {
        employeeStorage.printByStatus(true);
        System.out.println("Please chose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            employee.setActive(false);
            int countOfEmployees = employee.getCompany().getCountOfEmployees() - 1;
            employee.getCompany().setCountOfEmployees(countOfEmployees);
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
        if (companyStorage.getSize() == 0) {
            System.out.println("Please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("Please choose company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            System.out.println("please input name, surname, employeeId, salary, position,date of birthday(dd/mm/yyy)");
            String employeeDataStr = scanner.nextLine();
            String[] employeeData = employeeDataStr.split(",");
            String employeeId = employeeData[2];
            Date dateOfBirthday = DateUtil.stringToDate(employeeData[5]);
            Employee employee = employeeStorage.getEmployeeById(employeeId);
            if (employee == null) {
                Employee newEmployee = new Employee(employeeData[0], employeeData[1], employeeId, Double.parseDouble(employeeData[3]), companyById, employeeData[4], dateOfBirthday);
                employeeStorage.add(newEmployee);
                companyById.setCountOfEmployees(companyById.getCountOfEmployees() + 1);
                System.out.println("Employee was added");
            } else {
                System.out.println("Employee with id " + employeeId + " already exists!!!");
            }
        } else {
            System.out.println("Please first add company");
        }
    }
}
