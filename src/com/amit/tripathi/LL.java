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
        node.next = head;
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

//insert using recurstion
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index==0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
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
            deleteFirst();
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

    public void duplicates(){
        Node node = head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }else{
                node = node.next;
            }
            tail = node;
            tail.next= null;
        }
    }



    private static class Node{
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

    public static LL merge(LL first , LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f!=null && s!=null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f=f.next;
            }else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }

        while(f!=null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public static boolean checkCycle(LL list){
        Node slow = list.head;
        Node fast = list.head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                return true;
            }else return false;
        }
        return false;

    }

    public static void main(String[] args){

        LL list1 = new LL();
        LL list2 = new LL();

        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list1.insertLast(4);
        list1.insertLast(5);



        list1.display();

        System.out.println(checkCycle(list1));

    }
}
