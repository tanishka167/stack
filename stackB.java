import java.util.Stack;
public class stackB {
    public static void pushBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom(s, data);
        s.push(top);
    }
    
    // reverse string
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int index=0;
        while(index<str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder res=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            res.append(curr);
        }
        return res.toString();
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }

    public static void printStack(Stack <Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
    // Stack<Integer> s=new Stack<>();
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // // s.push(4);
    // // while(!s.isEmpty()){
    // //     System.out.println(s.peek());
    // //     s.pop();
    // // }   
    // pushBottom(s,4);
    //  while(!s.isEmpty()){
    //     System.out.println(s.pop());
    // } 
    
    // String str= "abc";
    // String res= reverseString(str);
    // System.out.println(res);

    Stack<Integer> s=new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    reverseStack(s);
    printStack(s);
    }
}
