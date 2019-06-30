/**
 * Write a method to replace all spaces in a string with '%20: 
 * You may assume that the string has sufficient space at the end to hold the additional characters, 
 * and that you are given the "true" length of the string. 
 * (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class URLify{

    public void replaceUrl(char[] url, int truelength){

        int space=0;
        // count number of spaces
        for(int i=0; i<truelength; i++){
            if(url[i]==' '){
                space++;
            }
        }

        //if(truelength<url.length) url[truelength]='\0'; // End array
        
        // replace
        int len = truelength + 2*space;
        for(int i=truelength-1; i>=0; i--){
            if(url[i]==' '){
                
                url[len-1]='0';
                url[len-2]='2';
                url[len-3]='%';
                len-=3;
            }
            else{
                url[len-1] = url[i];
                len--;
            }
        }
        System.out.println(url);
    }

    public static void main(String[] args) {
        URLify urLify = new URLify();
        urLify.replaceUrl(("Make this URL    ").toCharArray(), 13);
        
    }
}


/**
 * OUTPUT
 * Make%20this%20URL
 */