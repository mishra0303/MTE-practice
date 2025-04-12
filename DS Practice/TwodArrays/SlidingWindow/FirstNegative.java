package SlidingWindow;
import java.util.*;

public class FirstNegative {
    public static Deque<Integer> firstNegative(int arr[],int k){
        Deque<Integer>dq=new LinkedList<>();
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(!dq.isEmpty()&&dq.peek()<i-k+1){
                dq.pop();
            }
            if(!dq.isEmpty()&&arr[i]<0){
                dq.offer(i);
            }
            if(!dq.isEmpty()&&i>=k-1){
               int result=arr[dq.peek()];
            }else{
                dq.offer(0);
            }

        }
        return dq;

    }
    public static void main(String[] args) {
        int arr[]={-8,2,-3,4,-1,6};
        System.out.println(firstNegative(arr, 3));
        
    }
}
