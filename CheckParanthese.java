import java.util.Stack;

class CheckParanthese{


    public void check(String expression){

        Stack<Character> stack = new Stack<>();
        char[] expr = expression.toCharArray();
        int i;
        for(i=0; i<expr.length; i++){
            if(expr[i]==')'||expr[i]==']'){
                int flag=0;
                if(!stack.isEmpty()){
                    if(expr[i]==')' && stack.peek()=='('){
                        stack.pop();
                        flag=1;
                    }
                    if(expr[i]==']' && stack.peek()=='['){
                        stack.pop();
                        flag=1;
                    }
    
                    if(flag==0){
                        System.out.println("wrong arrangement");
                        //break;
                        return;
                    }
                }else{
                    System.out.println("wrong arrangement");
                    //break;
                    return;
                }
                
            } else if(expr[i]=='('||expr[i]=='['){
                stack.push(expr[i]);
            } 


        }

        if(i==expr.length && stack.isEmpty())
            System.out.println("Correct arrangement");
        if(!stack.isEmpty())
            System.out.println("wrong arrangement");
        
    }

    public static void main(String args[]){

        CheckParanthese ch = new CheckParanthese();
        //System.out.println("1");
        ch.check("(())");           // correct
        //System.out.println("2");
        ch.check("[(]");            // wrong
        //System.out.println("3");
        ch.check("[5*5+2(56-5)]");  // correct
        //System.out.println("4");
        ch.check("66-65(");         // wrong
        //System.out.println("5");
        ch.check("66-65())))");     // wrong
    }
}