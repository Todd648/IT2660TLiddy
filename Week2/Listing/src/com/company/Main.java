package com.company;

public class Main {

    public static void main(String[] args) {
        Utilities<StudentListing> Cleveland = new Utilities<StudentListing>(500);
        StudentListing roz = new StudentListing("Roz", "S00001", "2.73");
        StudentListing wes = new StudentListing("Wes", "S00002", "2.67");
        StudentListing todd = new StudentListing("Todd", "S00003", "2.93");

        Cleveland.insert(roz);
        Cleveland.insert(wes);
        Cleveland.insert(todd);

        System.out.println(Cleveland.fetch("Roz").toString());
        System.out.println(Cleveland.fetch("Wes").toString());
        System.out.println(Cleveland.fetch("Todd").toString());

    }
}
