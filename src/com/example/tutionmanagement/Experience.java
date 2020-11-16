package com.example.tutionmanagement;

public class Experience {
    String profile;
    String placeName;
    String duration;

    @Override
    public String toString() {
        return "Experience{" +
                "profile='" + profile + '\'' +
                ", placeName='" + placeName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
