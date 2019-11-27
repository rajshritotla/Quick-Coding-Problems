// source - cracking the coding interview
import java.util.ArrayList;
import java.util.Arrays;

class PowerSet{

    ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){

        ArrayList<ArrayList<Integer>> allSubsets;

        if(set.size()==index){                                  // stop condition | when all elements are taken    
            allSubsets =  new ArrayList<ArrayList<Integer>>();
            allSubsets.add(new ArrayList<Integer>());           // empty set
        
        } else {
            
            allSubsets = getSubsets(set, index+1);              // call for every element
            int item = set.get(index);
            ArrayList<ArrayList<Integer>> moreSubsets = new  ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> subset: allSubsets){                         System.out.println("___________________");
                ArrayList<Integer> newSubset = new ArrayList<Integer>();
                newSubset.addAll(subset);               System.out.println("1: "+ newSubset.toString());
                newSubset.add(item);                    System.out.println("2: "+ newSubset.toString());
                moreSubsets.add(newSubset);             System.out.println("3: "+ moreSubsets.toString());
            }
            allSubsets.addAll(moreSubsets);             System.out.println("4: "+ allSubsets.toString());
        }                                               System.out.println();System.out.println("5: "+ allSubsets.toString());System.out.println();
        
        return allSubsets;
    }



    public static void main(String[] args) {

        ArrayList<Integer> set = new ArrayList<>();
        set.addAll(Arrays.asList(1,2));
        new PowerSet().getSubsets(set, 0);
    }
}