package com.amit.tripathi;

public class LL {
    private Node head;
    private Node tail;
    public int size;
    LL(){
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
           insertFirst(value);
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
      Node temp = head;
      for(int i=1; i<idx; i++){
          temp = temp.next;
      }
      Node node = new Node(value, temp.next);
      temp.next = node;

      size++;
    }

    public void deleteFirst(){
        int val = head.value;
        head = head.next;

        if(head==null){
            tail=null;
        }

        System.out.println("Removed: "+val);
        size--;
    }

    public void deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        int val = tail.value;
        Node secondLast = get(size-1);
        tail = secondLast;
        tail.next = null;
        System.out.println("Removed: "+val);
        size--;
    }

    public void delete(int idx){
        if(idx==0){
            deleteLast();
            return;
        }
        if(idx==size){
            deleteLast();
            return;
        }
        Node prevelem = get(idx-1);
        Node sel_ele = get(idx);
        prevelem.next = sel_ele.next;
        size--;
    }

    public Node get(int index){
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        return temp;
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
