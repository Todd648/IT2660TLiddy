package com.company;

public class Main {

    public static void main(String[] args) {
    Queue q = new Queue(3);
    Listing l;
    Listing l1 = new Listing("Todd", "1234 Ash St", "1234567890");
    Listing l2 = new Listing("Roz", "1234 Ash St", "2345678901");
    Listing l3 = new Listing("Wes", "1234 Ash St", "3456789012");
    Listing l4 = new Listing("Gizmo", "1234 Ash St", "4567890123");


    System.out.println(q.deque());

    System.out.println(q.enque(l1));
    System.out.println(q.enque(l2));
    System.out.println(q.enque(l3));
    System.out.println(q.enque(l4));
    q.showAll();

    l=q.deque();
    System.out.println(l.toString());
    l=q.deque();
    System.out.println(l.toString());
    l=q.deque();
    System.out.println(l.toString());
    l=q.deque();

    System.out.println(l);
    System.exit(0);
    }
}
