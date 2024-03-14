package model;
import model.Person;
public class Professor extends Person {
    private String course;

    private Integer year;
    public Professor(String nume, String phone_number, String email, String course,Integer year){
        super(nume,phone_number,email);
        this.course = course;
        this.year = year;
    }
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
