package com.amit.tripathi;
public class Main {
    public static void main(String[] args){
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insert(33, 3);
        list.display();

        System.out.println(list);

    }
}
