/**
 * Given a string, write a function to check if it is a permutation of a palindrome. 
 * A palindrome is a word or phrase that is the same forwards and backwards. 
 * A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
public class palindromePermutation{

    public boolean checkPalindromeConditions(String str1, String str2){
        
        if(str1.length()!=str2.length()) return false;      // checked in previous;
        int spaces=0;
        HashMap<Character,Integer> str = new  HashMap<Character,Integer>();     // character and their count
        
        for(int i=0; i<str1.length(); i++) {
            char key = str1.charAt(i); 
            
            if(key==' ') spaces++;

            if(str.containsKey(key)) 
                str.replace(key, str.get(key), str.get(key)+1); // update value i.e. count
            else 
                str.put(str1.charAt(i), 1);
        }

        if((str1.length()-spaces)%2==0){     // even length -> all count even
            Collection<Integer> count = str.values();
            for (int var : count) {

                if(var%2!=0)
                    return false;
            }
        }
        else                       //odd length -> exact one odd
        {   
            int odd = 0;
            Collection<Integer> count = str.values();
            for (int var : count) {
                
                if(var%2!=0 && odd==0)  odd = 1;
                else 
                    if(var%2!=0 && odd==1)  return false;
                
                
            }
        }

        return true;
    }

    public boolean checkStrings(String str1, String str2){

        System.out.println(checkPalindromeConditions(str1, str2));
        if(!checkPalindromeConditions(str1, str2)) return false;

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

        /*
        System.out.println(new palindromePermutation().checkStrings("coco cola","cola coco")); // F

        System.out.println(new palindromePermutation().checkStrings("coco hola","coco cola"));   //F

        System.out.println(new palindromePermutation().checkStrings("coco cola","colaco co"));   //F

        System.out.println(new palindromePermutation().checkStrings("okok popo","pook pook"));   //T
*/
        System.out.println(new palindromePermutation().checkStrings("okok p","pkok o"));   //T


    }
}

/**
 * OUTPUT
 *  true
    false
    false
 */