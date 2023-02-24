package homework.employee.storage;

import homework.employee.model.Company;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company Company) {
        if (companies.length == size) {
            extend();
        }
        companies[size] = Company;
        size++;

    }

    public void extend() {
        Company[] tmp = new Company[companies.length + 10];
        System.arraycopy(companies, 0, tmp, 0, companies.length);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
        }
    }


    public Company getCompanyById(String id) {
        for (int i = 0; i < size; i++) {
            Company company = companies[i];
            if (company.getId().equals(id)) {
                return company;
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }
}