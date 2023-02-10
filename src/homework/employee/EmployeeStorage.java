package homework.employee;

public class EmployeeStorage {
    private Empoyee[] array = new Empoyee[10];

    private int size = 0;

    public void add(Empoyee empoyee) {
        if (size > array.length - 1) {
            extend();
            array[size++] = empoyee;

        } else {
            array[size++] = empoyee;
        }
    }

    private void extend() {
        Empoyee[] arr = new Empoyee[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        array = arr;
    }


    public void print() {
        for (Empoyee i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void searchByID(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Empoyee empoyee = array[i];
            if (empoyee.getEmployeeId().contains(keyword)) {
                System.out.println(empoyee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with " + keyword + " not found!");
        }

    }

    public void searchByCompany(String company) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Empoyee empoyee = array[i];
            if (empoyee.getCompany().contains(company)) {
                System.out.println(empoyee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee from " + company + " company not found!");
        }
    }


}
