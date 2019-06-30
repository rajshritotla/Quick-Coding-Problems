// given two strings, check if one is permutation of other

import java.util.HashMap;
public class checkPermutation{

    public boolean checkStrings(String str1, String str2){
        
        if(str1.length()!=str2.length()) return false;      // string length differ

        HashMap<Character,Boolean> str = new  HashMap<Character,Boolean>();

        for(int i=0; i<str1.length(); i++) {
            str.put(str1.charAt(i), true);
        }

        for(int i=0; i<str2.length(); i++) {
            if(str.containsKey(str2.charAt(i))){
                str.replace(str2.charAt(i), false);
            }
        }

        if(str.values().contains(true)) return false;
        else return true;
    }

    public static void main(String[] args) {

        
        System.out.println(new checkPermutation().checkStrings("hello","elloa")); // F

        System.out.println(new checkPermutation().checkStrings("hola","hloa"));   //T

        System.out.println(new checkPermutation().checkStrings("hell","llop"));   //F

        System.out.println(new checkPermutation().checkStrings("hell","lleh"));   //T


    }
}

/*
OUTPUT:
false
true
false
true

 */