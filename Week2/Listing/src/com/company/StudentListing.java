package com.company;

import javax.swing.*;

public class StudentListing implements  KeyMode {
    private String name;
    private String studentID;
    private String gpa;

    public StudentListing(String n, String s, String g) {
        name = n;
        studentID = s;
        gpa = g;
    }

    public String toString() {
        return name + " has a student id of: " + studentID + " and currently has a gpa of: " + gpa;
    }
    public KeyMode deepCopy() {
        StudentListing clone = new StudentListing(name, studentID, gpa);
        return clone;
    }
    public int compareTo(Object targetKey) {
        String tKey = (String) targetKey;
        return(name.compareTo(tKey));
    }
}
