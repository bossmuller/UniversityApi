package com.apps.university.Model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table (name="Students")
public class Student {
    @Id
    @Column(name = "Student_Id")
    private Long Student_Id;
    @Column(name = "Student_Name")
    private String Student_Name;
    @Column(name = "Gender")
    private char Gender;
    @Column(name = "Course")
    private String Course;
    @Column(name = "Faculty")
    private String Faculty;
    @OneToMany
    @JoinColumn(name="Unit_Code")
    private List<Unit>UNITS;

    public Student(Long Student_Id, String Student_Name, char Gender, String Course, String Faculty,List<Unit>UNITS) {
        this.Student_Id = Student_Id;
        this.Student_Name = Student_Name;
        this.Gender = Gender;
        this.Course = Course;
        this.Faculty = Faculty;
        this.UNITS=UNITS;
    }
public Student(){

}
public Long getStudent_Id(){
        return Student_Id;
    }

    public void setStudent_Id(Long studentId) {
        Student_Id = studentId;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String studentName) {
        Student_Name = studentName;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        Gender = gender;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public List<Unit> getUNITS() {
        return UNITS;
    }

    public void setUNITS(List<Unit> UNITS) {
        this.UNITS = UNITS;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Student_Id=" + Student_Id +
                ", Student_Name='" + Student_Name + '\'' +
                ", Gender=" + Gender +
                ", Course='" + Course + '\'' +
                ", Faculty='" + Faculty + '\'' +
                ", UNITS=" + UNITS +
                '}';
    }
}
