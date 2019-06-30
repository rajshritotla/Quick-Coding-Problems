// convert spaces in string to %20 [assume length of array is equal to new/updated array]
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