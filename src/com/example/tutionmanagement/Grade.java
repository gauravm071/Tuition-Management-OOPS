package com.example.tutionmanagement;

public class Grade {
    String shift;
    String board;
    boolean hasBoardExamination;

    @Override
    public String toString() {
        return "Grade{" +
                "shift='" + shift + '\'' +
                ", board='" + board + '\'' +
                ", hasBoardExamination=" + hasBoardExamination +
                '}';
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public boolean isHasBoardExamination() {
        return hasBoardExamination;
    }

    public void setHasBoardExamination(boolean hasBoardExamination) {
        this.hasBoardExamination = hasBoardExamination;
    }
}
