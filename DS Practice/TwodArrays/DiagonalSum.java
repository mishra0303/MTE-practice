package TwodArrays;

public class DiagonalSum {
    public static int diagonalSum(int arr[][]){
        int m=arr.length;
        int n=arr.length;
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                else if(j==n-i-1){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(arr));
    }
    
}
