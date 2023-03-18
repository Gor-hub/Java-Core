package chapter14;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
//        LinkedHashSet<String> nameSet = new LinkedHashSet<>();
//        nameSet.add("Poxos");
//        nameSet.add("Martiros");
//        nameSet.add("Valod");
//        nameSet.add("Arzuman");
//
//        for (String s : nameSet) {
//            System.out.println(s);
//        }

        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        students.add(new Student("poxos","poxosyan",20));
        students.add(new Student("arzuman","martirosyan",19));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}