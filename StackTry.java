import java.util.Iterator;
import java.util.Stack;

public class StackTry {


    public static void main(String args[]){

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.contains(5));      // true
        
        System.out.println(stack.toString());       //[1, 2, 3, 4, 5]
        
        System.out.println(stack.indexOf(3));       //2
        
        System.out.println(stack.firstElement());   //1
        System.out.println(stack.lastElement());    //5
        
        System.out.println(stack.size());           //5
        
        System.out.println(stack.peek());           //5
        System.out.println(stack.size());           //5
        
        System.out.println(stack.pop());           //5
        System.out.println(stack.size());           //4
  

        Iterator i = stack.iterator();
        while(i.hasNext()){
            System.out.println(i.next());       // 1 2 3 4
        }
    }



}