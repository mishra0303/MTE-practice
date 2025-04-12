public class DigitsSum{
    public static int digitsSum(int num){
        int reversed=0;
        while(num!=0){
        
        int result=num%10;
        reversed=reversed*10+result;
        
        num=num/10;
    }
        return reversed;
       
        
       
    }
    public static void main(String[] args) {
        int num=169;
       System.out.println(digitsSum(num)); 
    }
}