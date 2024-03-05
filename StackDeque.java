import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;
public class StackDeque {
    static class Stack {
    Deque<Integer> deque=new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Peek "+ s.peek());
        System.out.println("Peek "+ s.pop());
        System.out.println("Peek "+ s.pop());
        System.out.println("Peek "+ s.pop());
        System.out.println("Peek "+ s.pop());
    }
    }

