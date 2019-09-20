package com.company;

public class Listing {
    private String name;
    private String address;
    private String number;

    public Listing() {
        name = "";
        address = "";
        number ="";
    }
    public Listing(String n, String a, String num) {
        name =n;
        address = a;
        number = num;
    }
    public String toString () {
        return name + " lives at " + address + " and can be reached at " + number;
    }
    public Listing deepCopy() {
        Listing clone = new Listing(name, address, number);
        return clone;
    }
}
