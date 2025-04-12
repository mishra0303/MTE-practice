import java.util.ArrayList;

public class SnakePattern {
    static ArrayList<Integer> snakePattern(int arr[][])
    {
        // code here 
        ArrayList<Integer>ans=new ArrayList<>();
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                ans.add(arr[i][j]);
            }
        }
        else{
            for(int j=n-1;j>=0;j--){
                ans.add(arr[i][j]);
            }
        }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{50,60,70,80},{27,29,47,48},{32,33,39,50}};
        System.out.print(snakePattern(arr));
        
    }
}
