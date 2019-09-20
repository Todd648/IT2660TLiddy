package com.company;

public interface KeyMode {
    public abstract KeyMode deepCopy();

    public abstract int compareTo(Object Other);
    public  abstract  String toString();
}
