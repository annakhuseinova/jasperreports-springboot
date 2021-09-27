package com.annakhuseinova.jasperreportsspringboot.model;

public class Subject {

    private String subjectName;
    private long markObtained;

    public Subject(String subjectName, long markObtained) {
        this.subjectName = subjectName;
        this.markObtained = markObtained;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public long getMarkObtained() {
        return markObtained;
    }

    public void setMarkObtained(long markObtained) {
        this.markObtained = markObtained;
    }
}
