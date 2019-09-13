package com.company;
import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class
public class Main<Person> {

        public static void main(String[] args) {
        Scanner nameObj = new Scanner(System.in);
        System.out.println("Enter your name:");
        final String[] name = {nameObj.next()};

        Scanner ageObj = new Scanner(System.in);
        System.out.println("Enter age:");
        final int[] age = {ageObj.nextInt()};

        class Listing {
            private int a;
            private String n;

            public Listing(int a, String n) {

                }

            public void setN(String n) {
                this.n = n;
            }

            public void setA(int a) {
                this.a = a;
            }

            public String getN () {
                    return n;
                }

                public int getA () {

                    return a;
                }
            }
        System.out.println(Arrays.toString(name) + " is " + Arrays.toString(age) + " years old.");
        }
    }