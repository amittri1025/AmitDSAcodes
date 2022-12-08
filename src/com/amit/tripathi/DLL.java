package com.amit.tripathi;

public class DLL {

    Node head;
    Node prev;
    Node next;
    int size = 0;

    public void insertFirst(int val){
        Node node = new Node(val, null, null);
        node.next = head;
        node.prev = null;

        if(head!=null){
            head.prev = node;
        }
        head=node;
        size++;
    }

    public void insertLast(int val){
       Node node = new Node(val);
       node.next = null;
       Node temp = head;

       if(head==null){
           node.prev = null;
           head = node;
           return;
       }

       while(temp.next!=null){
           temp = temp.next;
       }

       temp.next = node;
       node.prev= temp;

    }

    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.val==value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insert(int after, int val){
        Node p = find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
            node.next.prev = node;
        }
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();

        System.out.println("Reverse order");

        while(last!=null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.print("START ");
    }



    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
