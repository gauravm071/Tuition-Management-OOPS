package com.example.tutionmanagement;

public class Subject {
    int hoursRequiredForOneClass;
    int classesRequiredForSubjectPerWeek;
    @Override
    public String toString() {
        return "Subject{" +
                "hoursRequiredForOneClass=" + hoursRequiredForOneClass +
                ", classesRequiredForSubjectPerWeek=" + classesRequiredForSubjectPerWeek +
                '}';
    }

    public int getHoursRequiredForOneClass() {
        return hoursRequiredForOneClass;
    }

    public void setHoursRequiredForOneClass(int hoursRequiredForOneClass) {
        this.hoursRequiredForOneClass = hoursRequiredForOneClass;
    }

    public int getClassesRequiredForSubjectPerWeek() {
        return classesRequiredForSubjectPerWeek;
    }

    public void setClassesRequiredForSubjectPerWeek(int classesRequiredForSubjectPerWeek) {
        this.classesRequiredForSubjectPerWeek = classesRequiredForSubjectPerWeek;
    }
}
