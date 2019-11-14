package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        String number;
        Listing l1 = new Listing("John", "01", "2.73");
        Listing l2 = new Listing("Tim", "02", "2.67");
        Listing l3 = new Listing("Todd", "03", "2.93");
        Listing l4 = new Listing("Justin", "04", "3.72");
        Listing l5 = new Listing("Eric", "05", "2.67");
        Listing l6 = new Listing("Ben", "06", "3.32");
        Listing l7 = new Listing("Ike", "07", "3.24");
        Listing l8 = new Listing("Larry", "08", "2.87");
        Listing l9 = new Listing("Roy", "09", "3.13");

        t.insert(l1);
        t.insert(l9);
        t.insert(l2);
        t.insert(l8);
        t.insert(l3);
        t.insert(l7);
        t.insert(l4);
        t.insert(l6);
        t.insert(l5);

        System.exit(0);
    }
}