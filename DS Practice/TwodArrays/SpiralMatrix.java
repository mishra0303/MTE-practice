import java.util.*;
public class SpiralMatrix {
    public static List<Integer> spiralMatrix(int [][]arr){
        List<Integer>ans=new ArrayList<>();
        int m=arr.length;
        int n=arr[0].length;
        int startRow=0,EndCol=n-1,StartCol=0,EndRow=m-1;
        while(startRow<=EndRow&&StartCol<=EndCol){
            //top
       
       for(int i=StartCol;i<=EndCol;i++){
            ans.add(arr[startRow][i]);
       }
       //right
       for(int j=startRow+1;j<=EndRow;j++){
            ans.add(arr[j][EndCol]);
       }
       //bottom
       for(int k=EndCol-1;k>=StartCol;k--){
        if(startRow==EndRow){
            break;
        }
            ans.add(arr[EndRow][k]);
       }
       //left
       for(int l=EndRow-1;l>=startRow+1;l--){
        if(StartCol==EndCol){
            break;
        }
        ans.add(arr[l][StartCol]);
       }
       startRow++;
       StartCol++;
       EndCol--;
       EndRow--;
    }
        return ans;

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.print(spiralMatrix(arr));
    }
    
}
