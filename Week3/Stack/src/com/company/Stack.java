package com.company;

public class Stack <T> {
    private T[] data;
    private int top;
    private int size;

    public Stack() {
        top = -1;
        size = 100;
        data = (T[]) new Object[100];
    }

    public Stack(int n) {
        top = -1;
        size = n;
        data = (T[]) new Object[n];
    }
    public boolean push(T newNode){
        GenericNode node = (GenericNode) newNode;
        if (top == size-1) return false;
        else {
            top = top +1;
            data[top] = (T) node.deepCopy();
            return true;
        }
    }
    public T pop() {
        int topLocation;
        if(top==-1) return null;
        else {
            topLocation = top;
            top = top -1;
            return  data[topLocation];
        }
    }

    public void showAll() {
        for(int i = top; i >= 0; i--)
            System.out.println(data[i].toString());
    }
}
