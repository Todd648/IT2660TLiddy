package com.company;

import javax.swing.*;

public class Node {
    private String name;
    private String gpa;
    private String studentID;

    public static void main(String[] args) {
    public Node(String n, String g, String s) {
            name = n;
            gpa = g;
            studentID = s;
        }
        public String toString () {
            return ("\nStudent with ID number" + studentID + "is named: " + studentID + "\nand their gpa is:" + gpa)
        }

        public Node deepCopy () {
            Node clone = new Node(name, gpa, studentID);
            return clone;
        }
        public int compareTo (String targetKey){
            return (name.compareTo(targetKey));
        }

        public void setGpa (String g){
            gpa = g;
        }

        public void setName (String n){
            name = n;
        }

        public void setStudentID (String s){
            studentID = s;
        }
        public void input () {
            studentID = JOptionPane.showInputDialog("Enter Student ID:");
            name = JOptionPane.showInputDialog("Enter student name:");
            gpa = JOptionPane.showInputDialog("Enter student gpa:");
        }
    }
}