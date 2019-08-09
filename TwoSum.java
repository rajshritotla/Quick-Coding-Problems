/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.HashSet;

import com.sun.javafx.collections.MappingChange.Map;

public class TwoSum{
  
  public int[] solution(int[] nums, int target){

    HashSet<Integer> numset = new HashSet<Integer>();

    for(int index=0; index < nums.length; index++){
      
      int complement = target - nums[index];

      if(numset.contains(complement)){
        return new int[] {nums[index],complement};
      }
      
      numset.add(nums[index]);
    }

    return null;
  }

  public static void main(String[] args) {
    int [] x = new int[2];
    x = new TwoSum().solution(new int[] {3,2,1}, 3);
    System.out.println(
      x[0] + " " + x[1] 
    );
    
    x = new TwoSum().solution(new int[] {5,6,7}, 5);
    System.out.println(
      x[0]
    );
    
  }

}