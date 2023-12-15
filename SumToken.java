import java.util.*;

public class SumToken{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number with a space btw:");
        String digit = sc.nextLine();
        StringTokenizer str=new StringTokenizer(digit);
        int sum=0,dig=0;
        
        while(str.hasMoreTokens()){
            String s = str.nextToken();
            dig=Integer.parseInt(s);
            System.out.println(dig+" ");
            sum+=dig;

        }
        System.out.println("The sum is: "+sum);
    }
}