import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
;

class LearnJava{

    public static void main(String[] args) {
        
        System.out.println("********************* ARRAY");
        int[] intArray1 = {1,2,3};
        int[] intArray2 = new int[5];
        System.out.println(intArray2[0]);           //0
        System.out.println(intArray2[4]);           //0
            //System.out.println(intArray2[5]);     //index out of bound
        String[] stringArray = new String[] {"abc","cbna"};
        
        // ARRAYS.FILL
        Arrays.fill(intArray2,22);
        System.out.println(intArray2[4]);           //22
        
        Arrays.fill(intArray1,33);
        System.out.println(intArray1[1]);           //33
        

        char[] ch = {'h','i'};
        System.out.println(ch);                 //hi
        System.out.println(String.valueOf(ch)); //hi

        // STRING.VALUEOF
        String s = String.valueOf(ch);
        System.out.println(s);                  //s

        // BINARY VALUES
        System.out.println("********************* BINARY VALUES");
        System.out.println(
                    Integer.toBinaryString(2)                                           //10
            );

        System.out.println(
                String.format("%02d",Integer.valueOf(Integer.toBinaryString(4)))        //100
        );

        System.out.println(
                String.format("%04d",Integer.valueOf(Integer.toBinaryString(4)))        //0100
        );

        System.out.println("Double min value " + Double.MIN_VALUE);                     //4.9E-324
        System.out.println("Double max value " + Double.MAX_VALUE);                     //1.7976931348623157E308
        
        System.out.println(Math.max(Double.MIN_VALUE,0.0d));                            // 4.9E-324
        System.out.println(Math.max(Double.MIN_VALUE,0.0f));                            // 4.9E-324
        System.out.println(Math.max(Double.MIN_VALUE,0.0));                             // 4.9E-324
        System.out.println();

        // check is NaN
        System.out.println(Double.NaN == Double.NaN);                                   // false
        System.out.println(Double.isNaN(Double.NaN));                                   // true


        System.out.println("********************* ARRAYLIST");
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println("Arraylist size with 5 elements is "+a.size());  //5
        System.out.println("But while getting element do -1 "+a.get(a.size()-1)); //5
        System.out.println("But while getting element do -1 "+a.get(4)); //5
        System.out.println("But while getting element do -1 "+a.get(0)); //1
        System.out.println("Arraylist index starts with 0 to size-1");

        System.out.println();
        System.out.println("**************************************");
        ArrayList<Integer> b = new ArrayList<Integer>();
        System.out.println("1: " + b.toString());
        b.add(5);
        System.out.println("2: " + b.toString());
        b.addAll(Arrays.asList(1,2));
        System.out.println("3: " + b.toString());

        System.out.println();
        
        ArrayList<Integer> c = new ArrayList<Integer>();
        System.out.println("1: " + c.toString());
        c.addAll(Arrays.asList(1,2));
        System.out.println("2: " + c.toString());
        c.add(5);
        System.out.println("3: " + c.toString());
        c.addAll(Arrays.asList(3,4));
        System.out.println("4: " + c.toString());
        System.out.println();



        /*
        LinkedHashSet h = new LinkedHashSet<Integer>();
        h.add(5);
        h.addAll(a);
        // iterating
        Iterator i = h.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        */
    }


}