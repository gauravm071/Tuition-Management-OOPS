package com.example.tutionmanagement;

import java.util.ArrayList;

public class Teacher {
    String schoolName;
    Grade classGrade;
    String name;
    ArrayList<Subject> enrolledSubjects= new ArrayList<>();
    ArrayList<Education> listOfEducation= new ArrayList<>();
    ArrayList<Experience> listOfExperience= new ArrayList<>();

    @Override
    public String toString() {
        return "Teacher{" +
                "schoolName='" + schoolName + '\'' +
                ", classGrade=" + classGrade +
                ", name='" + name + '\'' +
                ", enrolledSubjects=" + enrolledSubjects +
                ", listOfEducation=" + listOfEducation +
                ", listOfExperience=" + listOfExperience +
                '}';
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Grade getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(Grade classGrade) {
        this.classGrade = classGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Subject> getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public void setEnrolledSubjects(ArrayList<Subject> enrolledSubjects) {
        this.enrolledSubjects = enrolledSubjects;
    }

    public ArrayList<Education> getListOfEducation() {
        return listOfEducation;
    }

    public void setListOfEducation(ArrayList<Education> listOfEducation) {
        this.listOfEducation = listOfEducation;
    }

    public ArrayList<Experience> getListOfExperience() {
        return listOfExperience;
    }

    public void setListOfExperience(ArrayList<Experience> listOfExperience) {
        this.listOfExperience = listOfExperience;
    }
}
