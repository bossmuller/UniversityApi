package com.apps.university.Model;

import javax.persistence.Entity;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Lecturers")
public class Lecturer {
    @Id
    @Column(name = "LecturerId")
    private Long LecturerId;
    @Column(name = "LecturerName")
    private String LecturerName;
    @Column(name = "Gender")
    private char Gender;
    @Column(name = "Faculty")
    private String Faculty;
    @OneToMany
    @JoinColumn(name = "Student_Id")
    private List<Student>Students;

    public Lecturer(Long LecturerId,String LecturerName,char Gender,String Faculty,List <Student>Students){
        this.Faculty=Faculty;
        this.LecturerId=LecturerId;
        this.LecturerName=LecturerName;
        this.Gender=Gender;
        this.Students=Students;
    }
    public Lecturer(){

    }

    public Long getLecturerId() {
        return LecturerId;
    }

    public void setLecturerId(Long lecturerId) {
        LecturerId = lecturerId;
    }

    public String getLecturerName() {
        return LecturerName;
    }

    public void setLecturerName(String lecturerName) {
        LecturerName = lecturerName;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        Gender = gender;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setstudent(List<Student> Students) {
        this.Students = Students;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "LecturerId=" + LecturerId +
                ", LecturerName='" + LecturerName + '\'' +
                ", Gender=" + Gender +
                ", Faculty='" + Faculty + '\'' +
                ", Students=" + Students +
                '}';
    }
}
