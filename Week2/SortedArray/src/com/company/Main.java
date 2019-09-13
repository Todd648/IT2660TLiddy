package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        class StudentListings {
            private String name;
            private String gpa;
            private String idNumber;

            public StudentListings (String n, String i, String g) {
                name =n;
                idNumber = i;
                gpa =g;
            }
            public String toString() {
                return ("Name is " + name + "\nStudent ID number is " + idNumber + "\nStudent GPA is " + gpa);
            }
            public StudentListings deepCopy(){
                StudentListings clone = new StudentListings(name, idNumber,gpa);
                return clone;
            }

            public int compareTo (String targetKey){
                return (name.compareTo(targetKey));
            }

            public void input() {
                name = JOptionPane.showInputDialog("Enter student name:");
                idNumber = JOptionPane.showInputDialog("Enter student id number:");
                gpa = JOptionPane.showInputDialog("Enter student gpa:");
            }

    	}
        class StudentUtilities {
            private int next;
            private int size;
            private StudentListings[] data;

            public StudentUtilities() {
                next = 0;
                size = 100;
                data = new StudentListings[size];
            }
            public StudentUtilities(int s) {
                next = 0;
                size = s;
                data = new StudentListings[s];
            }
            public boolean insert (StudentListings newStudentListings){
                if(next >=size) return false;
                data[next] = newStudentListings.deepCopy();

                if (data[next] == null) return false;
                next =next +1;
                return true;
                }
            public StudentListings fetch(String targetKey) {
                StudentListings node;
                StudentListings temp;
                int i =0;
                while(i<next && !(data[i].compareTo(targetKey)==0)) {
                    i++;
                }

                if(i==next) return null;
                node = data[i].deepCopy();

                if(i !=0) {
                    temp = data[i-1];
                    data[i-1]=data[i];
                    data[i] = temp;
                }
                return node;
            }

            public boolean delete(String targetKey){
                int i =0;
                while(i<next && !(data[i].compareTo(targetKey)==0)) {
                    i++;
                }
                if (i == next) return false;
                data[i] = data[next -1];
                data[next -1] = null;
                next = next -1;
                return true;
            }

            public boolean update (String targetKey, StudentListings newNode) {
                if(delete(targetKey)==false) return false;
                else if (insert(newNode)==false) return false;
                else return true;
            }

            public void showAll(){
                for (int i =0; i < next; i++) {
                    System.out.println(data[i].toString());
                }
            }
        }
    }
}
