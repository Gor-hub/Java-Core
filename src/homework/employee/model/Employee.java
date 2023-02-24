package homework.employee.model;

import homework.employee.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String Id;
    private Double salary;
    private Company company;
    private String position;
    private boolean active = true;
    private Date dateOfBirthday;
    private Date registerDate = new Date();

    public Employee(String name, String surname, String id, Double salary, Company company, String position, Date dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        Id = id;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.dateOfBirthday = dateOfBirthday;
    }


    Employee() {
    }


    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return active == employee.active && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(Id, employee.Id) && Objects.equals(salary, employee.salary) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position) && Objects.equals(dateOfBirthday, employee.dateOfBirthday) && Objects.equals(registerDate, employee.registerDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, Id, salary, company, position, active, dateOfBirthday, registerDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Id='" + Id + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", active=" + active +
                ", registerDate=" + DateUtil.dateToString(registerDate) +
                ", dateOfBirthday=" + DateUtil.dateToString(dateOfBirthday) +
                '}';
    }
}