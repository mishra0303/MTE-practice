import java.util.*;
public class TransposeMatrix {
    public static void transposeMatrix(int mat[][]){
        int n=mat.length;
       
        int temp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j]=mat[j][i];

            }
        }
        
        for(int i=0;i<n;i++){
            for( int j=0;j<n;j++){
                mat[i][j]=temp[i][j];
               
            }
           
        }
        for(int i=0;i<n;i++){
            for( int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
               
            }
            System.out.println();

           
        }
       
        
    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        transposeMatrix(mat);
        
       
    }
        
    
}
