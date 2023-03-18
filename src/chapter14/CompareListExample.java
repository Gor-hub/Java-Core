package chapter14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareListExample {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("poxos","poxosyan",18));
        studentList.add(new Student("arzuman","poxosyan",13));
        studentList.add(new Student("arzuman","martirosyan",4));
        studentList.add(new Student("asqanaz","petrosyan",6));

        Comparator<Student> comparator = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        Collections.sort(studentList, comparator);

        System.out.println(studentList);

    }

}