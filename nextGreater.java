import java.util.Stack;
public class nextGreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nextGreater[]=new int[arr.length];
        // next greater in right                    Hint:-------for left next greater i=0 to n and check for arr[s.peek()]>=arr[i]
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}
