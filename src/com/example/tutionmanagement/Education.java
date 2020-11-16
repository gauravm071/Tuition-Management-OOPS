package com.example.tutionmanagement;

public class Education {
    String courseName;
    String duration;
    String institute;

    @Override
    public String toString() {
        return "Education{" +
                "courseName='" + courseName + '\'' +
                ", duration='" + duration + '\'' +
                ", institute='" + institute + '\'' +
                '}';
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
}
