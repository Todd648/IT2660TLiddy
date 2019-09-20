package com.company;

import javax.swing.text.Keymap;

public class Utilities <T> {
    private int next;
    private int size;
    private T[] data;

    public Utilities() {
        next =0;
        size = 100;
        data = ( T[] ) new Object[100];
    }

    public Utilities(int s) {
        next =0;
        data = (T[]) new Object[s];
        size =s;
    }
    public boolean insert(T newListing) {
        KeyMode node =(KeyMode) newListing;
        if(next>=size) return false;
        data[next] = (T) node.deepCopy();

        if (data[next]==null) return false;
        next = next + 1;
        return true;
    }

    public KeyMode fetch (Object targetKey) {
        KeyMode node =(KeyMode) data[0];
        T temp;

        int i = 0;
        while(i < next && node.compareTo(targetKey) != 0) {
            i++;
            node = (KeyMode) data[i];
        }
        if (i == next ) return null;
        node = node.deepCopy();
        if(i !=0) {
            temp = data[i-1];
            data[i-1] = data[i];
            data[i]=temp;
        }
        return node;
    }
    public boolean delete (Object targetKey){
        KeyMode node = (KeyMode) data [0];

        int i =0;
        while (i < next && node.compareTo(targetKey) !=0); {
            i++;
            node = (KeyMode) data[i];
        }
        if (i==next) return false;
        data[i] = data[next -1];
        data[next -1]=null;
        next = next -1;
        return true;
    }

    public boolean update (Object targetKey, T newNode) {
        if(delete(targetKey) == false) return false;
        else if (insert(newNode)==false) return false;
        else return true;
    }
    public void showAll() {
        for(int i = 0; i< next; i++)
            System.out.println(data[i].toString());
    }
}
