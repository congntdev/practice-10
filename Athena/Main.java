package Class10.Athena;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PersonImplement personMain =new PersonImplement();

        List<Student> students = personMain.addStudent();

        Map<ClassId, List<Student>> athena = personMain.deviceStudentToClass(students);

        System.out.println("Show 2 students for each class:  ");
        System.out.println(personMain.limitStudent(athena));

        System.out.println("Show students haven't paid: ");
        System.out.println(personMain.paidStudent(athena));

        System.out.println("Show students haven't phone: ");
        System.out.println(personMain.sortPhoneStudent(athena));

        System.out.println("Show students have excellent score: ");
        System.out.println(personMain.getExcellentStudent(athena));

        System.out.println("Show students study over 1 class: ");
        System.out.println(personMain.showStudentStudy2Class(students));
    }
}
