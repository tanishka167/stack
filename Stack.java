import java.util.ArrayList;
public class Stack {
    static class  Node {
        int data;
        Node next;
        // constructor
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
   static class  StackB{
    // ArrayList

    // static ArrayList<Integer> list=new ArrayList<>();
    // public static boolean isEmpty(){
    //     return list.size()==0;
    // } 

    // // push
    // public static void push(int data){
    //     list.add(data);
    // }

    // // pop
    // public static int pop(){
    //     if (isEmpty()) {
    //         return -1;
    //     }
    //     int top=list.get(list.size()-1);
    //     list.remove(list.size()-1);
    //     return top;
    // }

    // // peek
    // public static int peek(){
    //     if (isEmpty()) {
    //         return -1;
    //     }
    //     return (list.size()-1);
    // }

    // LinkedList
    static Node head=null;
    public static boolean isEmpty(){
        return head==null;
    }

    // push
    public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=newNode;
            return; 
        }
        newNode.next=head;
        head=newNode;
    }

    // pop
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int val=head.data;
        head=head.next;
        return val;
    }

    // peek
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        int val=head.data;
        return val;
    }
    public static void main(String[] args) {
        StackB s=new StackB();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
   }
    
}
