package com.company;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedListIterator Cleveland = new SinglyLinkedListIterator();
        String number;
        Listing2 l1 = new Listing2("Roz", "01", "2.73");
        Listing2 l2 = new Listing2("Wes", "02", "2.67");
        Listing2 l3 = new Listing2("Todd", "03", "2.93");

        Cleveland.insert(l1);
        Cleveland.insert(l2);
        Cleveland.insert(l3);

        while (Cleveland.i.hasNext()) {
            System.out.println(Cleveland.i.next());
        }
        Cleveland.i.reset();;
        while (Cleveland.i.hasNext()){
            l1 = Cleveland.i.next();
            number = l1.getStudentID();
            number = "S0000" + number;
            l1.setStudentID(number);
            Cleveland.i.set(l1);
        }
        Cleveland.i.reset();
        while(Cleveland.i.hasNext()) {
            System.out.println(Cleveland.i.next());
        }
        System.exit(0);
    }
}