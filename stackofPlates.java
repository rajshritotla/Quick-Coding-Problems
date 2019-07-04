/**
 * Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
 * Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
 * threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be
 * composed of several stacks and should create a new stack once the previous one exceeds capacity.
 * SetOfStacks. push () and SetOfStacks. pop() should behave identically to a single
 */

import java.util.Stack;
import java.util.ArrayList;

public class stackOfPlates extends Stack{

    private static final long serialVersionUID = 1L;

    ArrayList<Stack> stacks = new ArrayList<Stack>();
    int capacity;

    stackOfPlates(int capacity){
        this.capacity = capacity;
    }

    public Stack getLastStack(){
        if(stacks.size()==0) 
            return null;
        else 
            return stacks.get(stacks.size()-1);
    }

    public void push(int value){
    
        Stack last = getLastStack();

        if(last!=null && last.size()<capacity){
            System.out.println(
                last.push(value)
            );
        }
        else{
            Stack<Integer> s = new Stack<Integer>();
            System.out.println(
                s.push(value)
            );
            stacks.add(s);
        }
    }

    public Object pop() {
        
        Stack last = getLastStack();
        
        if(last!=null){
        
            if(last.size()==1){
                stacks.remove(stacks.size()-1);
                System.out.println(
                    last.pop()
                );
            }
            else{
                System.out.println(
                    last.pop()
                );
            }
        }
        else
            System.out.println("Empty");
        
        return last;    
    }

    public Object peek(){
        Stack last = getLastStack();
        
        if(last!=null){
                System.out.println(
                    last.peek()
                );
        }
        else
            System.out.println("Empty");
        
       return last; 
    }


    public static void main(String[] args) {
            stackOfPlates sp = new stackOfPlates(2);
            sp.push(1);
            sp.push(2);
            sp.push(3);
            sp.peek();   
            sp.pop();
            sp.pop();
    }
}

/**
 * OUTPUT
 * 1
 * 2
 * 3
 * 3
 * 3
 * 2
 */