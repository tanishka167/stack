import java.util.Stack;

public class duplicateParenthesis {
    public static void main(String[] args) {
        String str = "(a+(b))";
        Stack<Character> s = new Stack<>();
        int i = 0;
        int flag = 0;
        while (i < str.length()) {
            // closing
            if (str.charAt(i) == ')') {
                int c = 0;
                while (s.pop() != '(') {
                    c++;
                }
                if (c < 1) {
                    flag = 1;
                    break;
                }
                // else {
                //     s.pop(); // opening pair found
                // }
            }
            // opening, opeator,operand
            else{
                s.push(str.charAt(i));
            }
            i++;
        }
        if (flag == 0) {
            System.out.println("No Duplicates");
        } else {
            System.out.println("Duplicates");
        }
    }
}
