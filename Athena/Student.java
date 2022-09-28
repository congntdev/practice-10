package Class10.Athena;

import java.time.LocalDate;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private String phone;
    private ClassId classId;
    private LocalDate birthday;
    private List<Integer> studentScores;
    private boolean paid;

    public Student() {

    }

    public Student(String id, String name, String phone, ClassId classId, LocalDate birthday, List<Integer> studentScores, boolean paid) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.classId = classId;
        this.birthday = birthday;
        this.studentScores = studentScores;
        this.paid = paid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ClassId getClassId() {
        return classId;
    }

    public void setClassId(ClassId classId) {
        this.classId = classId;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<Integer> getStudentScores() {
        return studentScores;
    }

    public void setStudentScores(List<Integer> studentScores) {
        this.studentScores = studentScores;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", classId='" + classId + '\'' +
                ", birthday=" + birthday +
                ", studentScores=" + studentScores +
                ", paid=" + paid +
                '}';
    }
}
