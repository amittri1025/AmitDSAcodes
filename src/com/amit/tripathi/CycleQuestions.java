package com.amit.tripathi;

import java.util.List;

public class CycleQuestions {

    public static boolean detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

//    find length of cycle
    public static int lengthCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
//                length
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp!=fast);
                return length;
            }
        }
      return 0;
    }

    public static ListNode CycleNode(ListNode head){
        int len  = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                len = lengthCycle(slow);
                break;
            }
        }

        if(len ==0 ) return null;

        ListNode f = head;
        ListNode s = head;

        while(len!=0){
                s = s.next;
                len--;
        }

        while(f!=s){
            f = f.next;
            s = s.next;
        }

        return s;
    }


    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

  public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow!=fast);

        if(slow==1){
            return true;
        }
        return false;
  }

  private int findSquare(int number){
        int ans = 0;
        while(number > 0){
            int rem = number  % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
  }
    public static void main(String[] args){
        ListNode list = new ListNode(10);
    }
}
