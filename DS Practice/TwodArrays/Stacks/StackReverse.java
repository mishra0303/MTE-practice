package Stacks;
import java.util.*;

public class StackReverse {
    public static Stack<Integer> reverseStack(int arr[]){
        Stack<Integer>st=new Stack<>();
        
        int n=arr.length;
        for(int i=0;i<n;i++){
            st.push(arr[i]);
        

        }
        Stack<Integer>reversed=new Stack<>();
       
        while(!st.isEmpty()){
            
            reversed.push(st.pop());
        }
        return reversed;
        

    }
    public static void main(String[] args) {
        int arr[]={1,3,2,4};
        System.out.println(reverseStack(arr));
    }
    
}
