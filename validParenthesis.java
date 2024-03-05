import java.util.Stack;
public class validParenthesis {
    public static void main(String[] args) {
        String str="[]";
        Stack<Character> s=new Stack<>();
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
                s.push(str.charAt(i));
            }
            else{
                // if only closing brackets are there ))))),]]]],...
                if(s.isEmpty()){
                    System.out.println("False");
                    break;
                }
                if((str.charAt(i)=='}' && s.peek()=='{') || (str.charAt(i)==']' && s.peek()=='[') || (str.charAt(i)==')' && s.peek()=='(')){
                    s.pop();
                }
                else{
                    System.out.println("False");
                    break;
                }
            }
            i++;
        }
        if(!s.isEmpty()){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}
