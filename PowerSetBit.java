// source - cracking the coding interview
import java.util.ArrayList;
import java.util.Arrays;

class PowerSetBit {

    ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set){

        ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();
        int max = 1 << set.size();
        
        for(int k=0; k<max; k++){
            ArrayList<Integer> subset = convertIntToSet(k,set);
                                                                System.out.println(subset.toString());
            allSubsets.add(subset);
        }
                                                                System.out.println(allSubsets.toString());
        return allSubsets;
    
    }

    ArrayList<Integer> convertIntToSet(int x, ArrayList<Integer> set){

        ArrayList<Integer> subset = new ArrayList<Integer>();
        int index=0;
        
        for(int k=x;k>0;k>>=1){
            System.out.println("index = "+index);
            System.out.println("K: "+k);
            if((k&1)==1){
                subset.add(set.get(index));
                System.out.println(subset.toString());
            }
            index++;
        
        }
        
        System.out.println("...................");
        return subset;
    }


    public static void main(String[] args) {

        ArrayList<Integer> set = new ArrayList<>();
        set.addAll(Arrays.asList(1,2));
        new PowerSetBit().getSubsets(set);
        
    }
}