package com.example.tutionmanagement;

import java.util.ArrayList;

public class Student {
    String SchoolName;
    String classGrade;
    String Name;
    ArrayList<String> EnrolledSubjects= new ArrayList<>();
    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<String> getEnrolledSubjects() {
        return EnrolledSubjects;
    }

    public void setEnrolledSubjects(ArrayList<String> enrolledSubjects) {
        EnrolledSubjects = enrolledSubjects;
    }
}
