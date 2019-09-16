package com.company;

import javax.swing.*;

public class Node {
    private String name;
    private String studentID;
    private String gpa;

    public Node (String n, String s, String g){
        name = n;
        studentID = s;
        gpa = g;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Node deepCopy() {
        Node clone = new Node(name, studentID, gpa);
        return clone;
    }

    public int compareTo (String targetKey) {
        return (name.compareTo(targetKey));
    }

    public void setName(String n) {
        name = n;
    }

    public void setStudentID(String s) {
        studentID = s;
    }

    public void setGpa(String g) {
        gpa = g;
    }

    public void input() {
        name = JOptionPane.showInputDialog("Enter Student Name:");
        studentID = JOptionPane.showInputDialog("Enter the Student ID:");
        gpa = JOptionPane.showInputDialog("Enter the Student GPA:");
    }
}
