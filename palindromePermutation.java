/**
 * Given a string, write a function to check if it is a permutation of a palindrome. 
 * A palindrome is a word or phrase that is the same forwards and backwards. 
 * A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 */
import java.util.HashMap;

public class palindromePermutation{

    public boolean checkStrings(String str1, String str2){
        
        if(str1.length()!=str2.length()) return false;      // string length can't be different

        HashMap<Character,Boolean> str = new  HashMap<Character,Boolean>();

        for(int i=0; i<str1.length(); i++) {
            str.put(str1.charAt(i), false);
            
            // check spaces, both string should have space at same position
            if(str1.charAt(i)==' ' && str2.charAt(i)!=' ')  return false;
        }

        for(int i=0; i<str2.length(); i++) {
            if(str.containsKey(str2.charAt(i))){    
                str.replace(str2.charAt(i), true); // character present
            }
        }

        if(str.values().contains(false)) return false; // all characters not matched
        else return true;
    }

    public static void main(String[] args) {

        
        System.out.println(new palindromePermutation().checkStrings("coco cola","cola coco")); // T

        System.out.println(new palindromePermutation().checkStrings("coco hola","coco cola"));   //F

        System.out.println(new palindromePermutation().checkStrings("coco cola","colaco co"));   //F


    }
}

/**
 * OUTPUT
 *  true
    false
    false
 */