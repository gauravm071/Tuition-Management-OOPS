package com.example.tutionmanagement;

import java.util.ArrayList;

public class Teacher extends Student {
    String SchoolName;
    String classGrade;
    String Name;
    ArrayList<String> EnrolledSubjects= new ArrayList<>();
    @Override
    public String getSchoolName() {
        return SchoolName;
    }

    @Override
    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    @Override
    public String  getClassGrade() {
        return classGrade;
    }

    @Override
    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    @Override
    public ArrayList<String> getEnrolledSubjects() {
        return EnrolledSubjects;
    }

    @Override
    public void setEnrolledSubjects(ArrayList<String> enrolledSubjects) {
        EnrolledSubjects = enrolledSubjects;
    }
}
