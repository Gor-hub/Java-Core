package classwork.student;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name");
        String name = scanner.nextLine();
        System.out.println("Please enter student's surname");
        String surname = scanner.nextLine();
        System.out.println("Please enter student's age");
        int age = scanner.nextInt();
        System.out.println("Please enter student's email");
        String email = scanner.nextLine();
        System.out.println("Please enter student's phonenumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please enter student's course name");
        String courseName = scanner.nextLine();

        Student student = new Student(name, surname, age, phoneNumber, courseName, email);
        System.out.println(" Student " + student.name + " registered");
    }

}
