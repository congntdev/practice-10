package Class10.Athena;

import java.util.List;
import java.util.Map;

public interface IStudent {

    List<Student> addStudent();

    Map<ClassId, List<Student>> deviceStudentToClass(List<Student> students);

    Map<ClassId, List<Student>> limitStudent(Map<ClassId, List<Student>> athena);

    Map<ClassId, List<Student>> paidStudent(Map<ClassId, List<Student>> athena);

    Map<ClassId, List<Student>> sortPhoneStudent(Map<ClassId, List<Student>> athena);

    Map<ClassId, List<Student>> getExcellentStudent(Map<ClassId, List<Student>> athena);

    Map<String, List<Student>> showStudentStudy2Class(List<Student> athena);

}
