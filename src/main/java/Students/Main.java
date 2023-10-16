package Students;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        StudentComporator.StudentAgeComparator StAgeCompr = new StudentComporator.StudentAgeComparator();
        TreeSet<Student> people = new TreeSet<Student>(StAgeCompr);
        people.add(new Student("Ivan", "Popov", 20, "22a"));
        people.add(new Student("Petr", "Ivanov", 22, "22a"));
        people.add(new Student("Aleksey", "Petrov", 25, "23a"));
        people.add(new Student("Lera", "Kotova", 18, "22a"));
        people.add(new Student("Svetlana", "Orlova", 67,"23a"));
        for(Student  p : people){

            System.out.println(p.getName() + ", Age=" + p.getAge());
        }
    }
}