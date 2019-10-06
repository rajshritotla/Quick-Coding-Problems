import java.util.PriorityQueue;

import java.util.Iterator;

public class MinHeapPriorityQ{  

    public static void main(String[] args) {
        PriorityQueue<Integer> min = new PriorityQueue<Integer>();

        min.add(1000);

        min.add(-1);

        min.add(100);

        min.add(10);

        System.out.println(min.toString());

        // get min
        System.out.println(min.peek());
        System.out.println(min.toString());

        // extract min
        System.out.println(min.poll());
        System.out.println(min.toString());

        System.out.println(min.contains(1000));
        System.out.println(min.toString());

        System.out.println(min.size());

        System.out.println(min.isEmpty());

        System.out.println(min.element());
        System.out.println(min.toString());

        System.out.println("....................................");
        Iterator itr = min.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            
        }

        System.out.println("....................................");
        System.out.println(min.toString());
        System.out.println("Size " + min.size());
        /*for(int i = 0; i <= min.size(); i++){
            System.out.println(i + " " + min.poll());
        }*/
        while(min.size()>0){
            System.out.println(min.poll());
        }
        System.out.println(min.toString());

        System.out.println("....................................");
        min.offer(5);
        min.offer(-2);
        min.offer(5);
        min.offer(-2);
        
        Object[] x = new Object[1];
        x = min.toArray();
        System.out.println("array:" + x.length);
        
        
        System.out.println(min.toString());




        System.out.println("....................................");
        System.out.println();
        min.clear();
        System.out.println(min.toString());



    }
}