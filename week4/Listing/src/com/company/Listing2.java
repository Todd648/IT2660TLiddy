package com.company;

import javax.swing.*;

public class Listing2 {
    private String name;
    private String studentID;
    private String gpa;

    public Listing2(String n, String s, String g) {
        name = n;
        studentID = s;
        gpa = g;
    }

    public String toString() {
        return name + " has a student id of: " + studentID + " and currently has a gpa of: " + gpa;
    }
    public Listing2 deepCopy() {
        Listing2 clone = new Listing2(name, studentID, gpa);
        return clone;
    }
    public int compareTo(Object targetKey) {
        String tKey = (String) targetKey;
        return(name.compareTo(tKey));
    }
    public void input(){
        name= JOptionPane.showInputDialog("Enter the Student Name");
        studentID = JOptionPane.showInputDialog("Enter the Student ID");
        gpa = JOptionPane.showInputDialog("Enter the Student's Grade Point Average");
    }
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
    public String getGpa() {
        return gpa;
    }

    public void setGpa(String g) {
        gpa = g;
    }
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String s) {
        studentID = s;
    }
}
