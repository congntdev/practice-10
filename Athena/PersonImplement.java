package Class10.Athena;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonImplement implements IStudent {
    @Override
    public List<Student> addStudent() {
        var listStudent = new LinkedList<Student>();
        listStudent.add(new Student("1", "Laura", "123455667", ClassId.AD, LocalDate.parse("1998-12-05"), List.of(7,8,9,7), true)) ;
        listStudent.add(new Student("2", "James", "123455694", ClassId.JB, LocalDate.parse("2002-12-06"), List.of(6,8,9,7), false)) ;
        listStudent.add(new Student("3", "Maya", "123455625", ClassId.RJ, LocalDate.parse("1997-02-17"), List.of(9,9,9,8), true)) ;
        listStudent.add(new Student("4", "Jay", "123455685", ClassId.RN, LocalDate.parse("2000-04-06"), List.of(8,9,8,7), false)) ;
        listStudent.add(new Student("5", "Jessica", "123455696", ClassId.JSB, LocalDate.parse("1999-12-05"), List.of(8,9,9,7), true)) ;
        listStudent.add(new Student("6", "Mark", " ", ClassId.AD, LocalDate.parse("2003-04-05"), List.of(9,9,9,9), true)) ;
        listStudent.add(new Student("7", "Maria", " ", ClassId.JB, LocalDate.parse("2003-07-19"), List.of(9,8,9,8), true)) ;
        listStudent.add(new Student("8", "Michael", "123455685", ClassId.RN, LocalDate.parse("2003-04-05"), List.of(7,8,9,8), false)) ;
        listStudent.add(new Student("9", "Linda", " ", ClassId.RJ, LocalDate.parse("2003-04-05"), List.of(10,9,9,9), true)) ;
        listStudent.add(new Student("10", "David", " ", ClassId.JSB, LocalDate.parse("2003-04-05"), List.of(7,8,9,8), true)) ;
        listStudent.add(new Student("11", "Jennifer", " ", ClassId.RJ, LocalDate.parse("2003-04-05"), List.of(9,9,9,9), false)) ;
        listStudent.add(new Student("11", "Jennifer", " ", ClassId.AD, LocalDate.parse("2003-04-05"), List.of(8,8,9,8), false)) ;
        listStudent.add(new Student("5", "Jessica", "123455696", ClassId.JB, LocalDate.parse("1999-12-05"), List.of(8,9,9,7), true)) ;
        return listStudent;
    }

    @Override
    public Map<ClassId, List<Student>> deviceStudentToClass(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                            Student::getClassId,
                                HashMap::new,
                                Collectors.mapping(Function.identity(), Collectors.toList())));
    }

    @Override
    public Map<ClassId, List<Student>> limitStudent(Map<ClassId, List<Student>> athena) {
        var limitStudent = new HashMap<ClassId, List<Student>>();
        athena.forEach((classId, students) -> {
            limitStudent.put(classId,
                    students.stream()
                            .limit(2)
                            .collect(Collectors.toList()));
        });
        return limitStudent;
    }

    @Override
    public Map<ClassId, List<Student>> paidStudent(Map<ClassId, List<Student>> athena) {
        var paidStudent = new HashMap<ClassId, List<Student>>();
        athena.forEach(((classId, students) -> {
            paidStudent.put(classId,
                    students.stream()
                            .filter(student -> !student.isPaid())
                            .collect(Collectors.toList()));
        }));
        return paidStudent;
    }

    @Override
    public Map<ClassId, List<Student>> sortPhoneStudent(Map<ClassId, List<Student>> athena) {
        var nonPhoneStudent = new HashMap<ClassId, List<Student>>();
        athena.forEach(((classId, students) -> {
            nonPhoneStudent.put(classId,
                    students.stream()
                    .filter(student -> student.getPhone().length() != 9)
                    .collect(Collectors.toList()));
        }));
        return nonPhoneStudent;
    }

    @Override
    public Map<ClassId, List<Student>> getExcellentStudent(Map<ClassId, List<Student>> athena) {
        var excellentStudent = new HashMap<ClassId, List<Student>>();
        athena.forEach((classId, students) -> {
            excellentStudent.put(classId,
                    students.stream()
                            .filter(student -> student.getStudentScores().stream().allMatch(studentScore -> studentScore > 8))
                            .collect(Collectors.toList()));
        });
        return excellentStudent;
    }

    @Override
    public Map<String, List<Student>> showStudentStudy2Class(List<Student> athena) {
        Map<String, List<Student>> studentStudy2Class = new HashMap<>();
        athena.forEach(student -> {
            List<Student> classStudent = studentStudy2Class.get(student.getId());
            if (classStudent == null) {
                classStudent = new ArrayList<Student>() {{
                    add(student);
                }};
            } else {
                classStudent.add(student);
            }
            studentStudy2Class.put(student.getId(), classStudent);
        });
        return studentStudy2Class;
    }

}
