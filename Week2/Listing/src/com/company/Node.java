package com.company;

import javax.swing.*;

public class Node {
    private String name;
    private String studentID;
    private String gpa;

    public Node(String n, String s, String g) {
        name = n;
        studentID = s;
        gpa = g;
    }

    public String toString() {
        return name + " has a student id of: " + studentID + " and currently has a gpa of: " + gpa;
    }
    public Node deepCopy() {
        Node clone = new Node(name, studentID, gpa);
        return clone;
    }
    public int compareTo(String targetKey) {
        return(name.compareTo(targetKey));
    }
    public void input() {
        name = JOptionPane.showInputDialog("Enter Student Name:");
        studentID = JOptionPane.showInputDialog("Enter Student ID:");
        gpa = JOptionPane.showInputDialog("Enter Student GPA:");
    }
}
