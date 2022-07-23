package com.apps.university.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "UNITS")
public class Unit {
    @Id
    @Column (name = "Unit_Code")
    private  int Unit_Code;
    @Column(name = "Unit_Name")
    private String UnitName;

    @OneToMany
    @JoinColumn(name = "LecturerId")
    private List<Lecturer>Lecturers;

    public Unit(int Unit_Code,String Unit_Name,List<Lecturer>Lecturers) {
        this.Unit_Code= Unit_Code;
        this.UnitName = Unit_Name;
        this.Lecturers= Lecturers;
    }
    public Unit(){

    }

    public int getUnit_Code() {
        return Unit_Code;
    }

    public void setUnit_Code(int unit_Code) {
        Unit_Code = unit_Code;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public List<Lecturer> getLecturers() {
        return Lecturers;
    }

    public void setLecturers(List<Lecturer> lecturers) {
        Lecturers = lecturers;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "Unit_Code=" + Unit_Code +
                ", UnitName='" + UnitName + '\'' +
                ", Lecturers=" + Lecturers +
                '}';
    }
}
