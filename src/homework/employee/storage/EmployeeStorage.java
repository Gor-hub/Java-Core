package homework.employee.storage;

import homework.employee.model.Company;
import homework.employee.model.Employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (employees.length == size) {
            extend();
        }
        employees[size] = employee;
        size++;

    }

    public void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
    }

    public void printAllEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void printByStatus(boolean active) {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == active) {
                System.out.println(employees[i]);
            }
        }
    }

    public void searchBySalaryRange(double minSalary, double maxSalary) {
        boolean b = false;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= minSalary & employee.getSalary() <= maxSalary) {
                System.out.println(employee);
                b = true;
            }
        }
        if (!b) {
            System.out.println("Employee with salary rang from " + minSalary + " to " + maxSalary + " does not exist !!!");
        }

    }

    public Employee getEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }


    public void searchByCompany(Company company) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getCompany().equals(company)) {
                System.out.println(employee);
            }
        }

    }

}