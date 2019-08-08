/**
 * There are three types of edits that can be performed on strings: 
 * insert a character, remove a character, or replace a character. Given two strings, 
 * write a function to check if they are one edit (or zero edits) away.
 */

public class OneOrZeroEdits{

    public void count(StringBuilder original_str, StringBuilder edited_str){

        // we are checking more only 0 or 1 edit so remove other cases
        if(Math.abs(original_str.length()-edited_str.length())!=1){
            System.out.println("More than one edit"); return;
        }

        // 0 edits
        if(original_str.equals(edited_str)){
            System.out.println("0 edits"); return;
        }



        
        

    }
    
       
    
    public static void main(String[] args) {
        StringBuilder o = "pale";
        StringBuilder e = "ple";
        
        new OneOrZeroEdits().count(o,e);

        o="pale";e="bake";
        new OneOrZeroEdits().count(o,e);
        
    }
}