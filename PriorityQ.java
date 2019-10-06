import java.util.PriorityQueue;

public class PriorityQ {

    public static void main(String[] args) {
        
        PriorityQueue<Integer> q = new  PriorityQueue<Integer>();
        
        q.add(31);

        q.add(0);

        q.add(20);

        q.add(5);

        q.add(-1);

        
        System.out.println(q.remove());
        System.out.println(q.toString());

        System.out.println(q.peek());
        System.out.println(q.toString());
        
        System.out.println(q.poll());
        System.out.println(q.toString());

        System.out.println(q.removeIf(n->(n<21)));
        System.out.println(q.toString());

    
    }




}