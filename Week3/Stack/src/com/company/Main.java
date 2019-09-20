package com.company;

public class Main {

    public static void main(String[] args) {
        Stack s = new Stack(3);
        Listing l;

        Listing l1 = new Listing("Todd", "1234 Ash St", "1234567890");
        Listing l2 = new Listing("Roz", "1234 Ash St", "2345678901");
        Listing l3 = new Listing("Wes", "1234 Ash St", "3456789012");


        System.out.println(s.pop());

        System.out.println(s.push(l3));
        System.out.println(s.push(l2));
        System.out.println(s.push(l1));

        s.showAll();

        l=s.pop();
        System.out.println(l.toString());
        l=s.pop();
        System.out.println(l.toString());
        l=s.pop();
        System.out.println(l.toString());
        l=s.pop();

        System.out.println(l);
        System.exit(0);
    }
}
