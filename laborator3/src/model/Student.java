package model;
import model.Person;
public class Student extends Person {
    private Integer student_number;
    private Double avg_mark;
    private Integer classs;

    public Student(String nume, String phone_number, String email, Integer student_number, Double avg_mark, Integer classs){
        super(nume, phone_number, email);
        this.student_number = student_number;
        this.avg_mark = avg_mark;
        this.classs = classs;
    }
    public Integer getStudent_number() {
        return student_number;
    }

    public void setStudent_number(Integer student_number) {
        this.student_number = student_number;
    }

    public Double getAvg_mark() {
        return avg_mark;
    }

    public void setAvg_mark(Double avg_mark) {
        this.avg_mark = avg_mark;
    }

    public Integer getClasss() {
        return classs;
    }

    public void setClasss(Integer classs) {
        this.classs = classs;
    }



}
