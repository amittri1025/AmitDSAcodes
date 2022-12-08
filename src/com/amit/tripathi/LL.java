package com.amit.tripathi;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next =head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(tail==null){
   //        insertFirst(value);
           return;
        }
        tail.next = node;
        node.next = null;
        tail=node;
        size+=1;
    }

    public void insert(int value, int idx){
      if(idx==0){
          insertFirst(value);
          return;
      }
      if(idx==size){
          insertLast(value);
          return;
      }
      Node node = new Node(value);
      Node temp = head;
      int i=1;
      while(i<idx){
            temp = temp.next;
            i++;
        }
      node.next = temp.next;
      temp.next = node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
