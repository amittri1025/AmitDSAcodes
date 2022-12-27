package com.amit.tripathi;

import java.util.Objects;

public class Main {
    public static void main(String[] args){
        LL list1 = new LL();
        LL list2 = new LL();

        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);

        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);
        list1.display();
        list2.display();

        LL ans = new LL();










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
//
//        CLL list = new CLL();
//
//        list.insert(1);
//        list.insert(2);
//        list.insert(3);
//        list.insert(4);
//        list.display();
//
//        list.delete(3);
//        list.display();

    }
}
