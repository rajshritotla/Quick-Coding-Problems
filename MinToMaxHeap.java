import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

class MinToMaxHeap{

    public static void main(String[] args) {

        PriorityQueue min = new PriorityQueue<>();
        min.add(2);
        min.add(0);
        min.add(-1);
        System.out.println(min.toString());

        /*
        System.out.println("_________________________________________________");
        PriorityQueue max = new PriorityQueue<>(Collections.reverseOrder());
        
        System.out.println("_________________________________________________");
        Object[] ob = min.toArray();
        for(int i=0; i<ob.length; i++){
            max.add(ob[i]);
        }
        System.out.println(max.size());
        System.out.println("using toArray()");
        System.out.println(max.toString());
*/
        System.out.println("_________________________________________________");
        PriorityQueue max3 = new PriorityQueue<>(Collections.reverseOrder());
        max3.addAll(min);
        System.out.println("using add all");
        System.out.println(max3.toString());

/*
        System.out.println("_________________________________________________");
        PriorityQueue max2 = new PriorityQueue<>(Collections.reverseOrder());
        Iterator itr = min.iterator();
        while(itr.hasNext()){
            max2.add(itr.next());
        }
        System.out.println("using iterator on min ");
        System.out.println(max2.toString());

  */      

    }
}