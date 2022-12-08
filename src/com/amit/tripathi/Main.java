package com.amit.tripathi;

import java.util.Objects;

public class Main {
    public static void main(String[] args){
//        LL list = new LL();
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);

//        System.out.println("Original List");
//        list.display();
//        System.out.println();
//        list.insert(10, 3);
//        list.deleteFirst();
//        list.display();
//        list.deleteLast();
//        list.display();
//        System.out.println(list.size);
//        list.delete(5);
//        list.display();


//        DLL list = new DLL();
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//
//        list.display();
//
//        list.insertLast(6);
//        list.insertLast(7);
//        list.insertLast(8);
//        list.insert(5, 65);
//        list.display();

        CLL list = new CLL();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();

        list.delete(3);
        list.display();

    }
}
