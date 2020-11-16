package com.example.tutionmanagement;

public class Student {
    String schoolName;
    Grade classGrade;
    String name;
    Subject enrolledSubjects;

    @Override
    public String toString() {
        return "Student{" +
                "schoolName='" + schoolName + '\'' +
                ", classGrade=" + classGrade +
                ", name='" + name + '\'' +
                ", enrolledSubjects=" + enrolledSubjects +
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

    public Subject getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public void setEnrolledSubjects(Subject enrolledSubjects) {
        this.enrolledSubjects = enrolledSubjects;
    }
}
