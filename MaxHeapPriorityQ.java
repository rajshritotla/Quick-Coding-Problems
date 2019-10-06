import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Iterator;

public class MaxHeapPriorityQ{  

    public static void main(String[] args) {
        PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());
        

        max.add(1000);
        max.add(-1);
        max.add(100);
        max.add(10);

        System.out.println(max.toString());

        // get max
        System.out.println(max.peek());
        System.out.println(max.toString());

        // extract max
        System.out.println(max.poll());
        System.out.println(max.toString());

        System.out.println("....................................");
        System.out.println(max.contains(1000));
        System.out.println(max.toString());

        System.out.println("....................................");
        System.out.println(max.size());

        System.out.println("....................................");
        System.out.println(max.isEmpty());

        System.out.println("....................................");
        System.out.println(max.element());
        System.out.println(max.toString());

        System.out.println("....................................");
        Iterator itr = max.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            
        }

        System.out.println("....................................");
        System.out.println(max.toString());
        System.out.println("Size " + max.size());
        /*for(int i = 0; i <= max.size(); i++){
            System.out.println(i + " " + max.poll());
        }*/
        while(max.size()>0){
            System.out.println(max.poll());
        }
        System.out.println(max.toString());

        System.out.println("....................................");
        max.offer(5);
        max.offer(-2);
        max.offer(5);
        max.offer(-2);
        System.out.println("Wrongggggg when offer: "+max.toString());
        max.add(7);
        System.out.println("Correct after add: "+max.toString());
        //max.add(0);
        
        Object[] x;// = new Object[2];
        x = max.toArray();
        System.out.println("array:" + x.length);
        
        
        System.out.println(max.toString());




        System.out.println("....................................");
        System.out.println();
        max.clear();
        System.out.println(max.toString());



    }
}