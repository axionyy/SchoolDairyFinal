package com.example.bottomnavbar;

public class Mark {

    private int studentId, lessonMark, lessonId;
    private String lessonDate, visit;

    public Mark() {
    }

    public Mark(int studentId, int lessonMark, int lessonId, String lessonDate, String visit) {
        this.studentId = studentId;
        this.lessonMark = lessonMark;
        this.lessonId = lessonId;
        this.lessonDate = lessonDate;
        this.visit = visit;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getLessonMark() {
        return lessonMark;
    }

    public void setLessonMark(int lessonMark) {
        this.lessonMark = lessonMark;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(String lessonDate) {
        this.lessonDate = lessonDate;
    }

    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit;
    }
}
