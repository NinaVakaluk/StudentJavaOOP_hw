package Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student Alex = new Student("Alex", "Popov", 20, "22a");
        Student Masha = new Student("Masha", "Ivanova", 22, "22a");
        Student Aleksandr = new Student("Aleksandr", "Popovich", 25, "23a");

        List<Student> numberoFGroup = new ArrayList<>();
        numberoFGroup.add(Alex);
        numberoFGroup.add(Masha);
        numberoFGroup.add(Aleksandr);

        /**
         first
         for (Student number:numberoFGroup) {
         System.out.println(number);
         }

         second
         System.out.println("Iteration by List:");
         for (Student student : numberoFGroup) {
         System.out.println("Name: " + student.getName());
         System.out.println("Surname: " + student.getSurname());
         System.out.println("Age: " + student.getAge());

         third
         **/
        System.out.println("iterating:");
        Iterator<Student> iterator = numberoFGroup.iterator();
        while (iterator.hasNext()) {
            Student person = iterator.next();
            System.out.println("Name: " + person.getName());
            System.out.println("Surname: " + person.getSurname());
            System.out.println("Age: " + person.getAge());
            System.out.println("Name of group: " + person.getNameofGroup());
        }

        Comparator<Student> studentComp = new StudentComporator()
                .thenComparing(new StudentComporator.StudentAgeComparator());
        TreeSet<Student> checkStudents = new TreeSet<>(studentComp);
        checkStudents.add(new Student("Kolya", "Popov", 20, "22a"));
        checkStudents.add(new Student("Stepan", "Ivanov", 22, "22a"));
        checkStudents.add(new Student("Aleksey", "Popovich", 25, "23a"));
        checkStudents.add(new Student("Vera", "Ivanova", 22, "22a"));
        checkStudents.add(new Student("Svetlana", "Zhukova", 25, "23a"));
        for(Student std : checkStudents){

            System.out.println(std.getName() + " -> " + std.getAge() + " years old");
        }
    }
}