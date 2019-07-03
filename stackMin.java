import java.util.Stack;

/**
 * Design a stack which, in addition to push and pop, has a function min
 * which returns the minimum element. Push, pop and min should all operate in 0(1) time.
*/

public class stackMin extends Stack<NodeWithMin>{

    private static final long serialVersionUID = 1L;

    public void push(int value) {
        int newMin= Math.min(value, checkMin());
        super.push(new NodeWithMin(value, newMin));

    }

    public int checkMin(){
        if(this.isEmpty()){
            return Integer.MAX_VALUE;
        }else{
            return this.peek().min;
        }


    }
    public static void main(String[] args) {
       
        stackMin s= new stackMin();
        s.push(5);
        s.push(8);
        s.push(3);
        s.push(7);
        System.out.print("Top value= "+s.peek().value+" Min Value= "+s.peek().min);

    }
}

class NodeWithMin{
    public int value;
    public int min;
    public NodeWithMin(int v, int m){
        value = v;
        min = m;
    }
}

/**
 * OUTPUT:
 * Top value= 7 Min Value= 3
 */