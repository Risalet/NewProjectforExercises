package com.newproject.exercises;

public class InterfaceComparable implements Comparable<InterfaceComparable> {
    private String studentName;
    private String studentId;
    private int point;

    public InterfaceComparable() {
    }

    public InterfaceComparable(String studentName, String studentId, int point) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.point = point;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return
                "studentName :" + studentName + '\'' +
                        ", studentId :" + studentId + '\'' +
                        ", point :" + point;
    }

    @Override
    public int compareTo(InterfaceComparable interfaceComparable) {
        return 0;
    }
}

