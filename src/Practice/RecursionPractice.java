package Practice;

public class RecursionPractice {
    public static void main(String[] args){
//        using recursion add all numbers upto 10
        display(10);
    }

    public static void display(int val){
        if(val==0){
            return ;
        }
        System.out.print(val+" ");
        display((val*2-1));
    }

}
