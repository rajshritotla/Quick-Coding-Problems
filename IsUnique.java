/**
 * Implement an algorithm to determine if a string has all unique characters. 
 */

import java.util.HashSet;

public class IsUnique{

    public boolean checkUnique(String str){
        HashSet<String> characters = new HashSet<String>();
        for(int i=0; i<str.length() && i<128; i++)          // considering 128 char
        {
            // if char exists
            if(characters.contains(str.charAt(i)+"")) return false;
            // else add char to set
            else characters.add(str.charAt(i)+"");
        }
        return true;
    }

    public static void main(String[] args) {
        
        String str = "cat";
        System.out.println(str+" isUnique "+new IsUnique().checkUnique(str));
        str = "hello";
        System.out.println(str+" isUnique "+new IsUnique().checkUnique(str));

    }

}

/*

OUTPUT
cat isUnique true
hello isUnique false

 */