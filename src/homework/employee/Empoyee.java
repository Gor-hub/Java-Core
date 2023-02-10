package homework.employee;

import java.util.Objects;

public class Empoyee {
    private String name;
    private String surname;
    private String employeeId;
    private Double salary;
    private String company;
    private String position;

    public Empoyee(String name, String surname, String employeeId, Double salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.employeeId = employeeId;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public Empoyee() {
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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
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
        Empoyee empoyee = (Empoyee) o;
        return name.equals(empoyee.name) && surname.equals(empoyee.surname) && employeeId.equals(empoyee.employeeId) && salary.equals(empoyee.salary) && company.equals(empoyee.company) && position.equals(empoyee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeeId, salary, company, position);
    }

    @Override
    public String toString() {
        return "Empoyee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
