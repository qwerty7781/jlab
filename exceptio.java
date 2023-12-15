import java.io.*;
import java.util.Scanner;
public class Test{
    public static void main(String[] args) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
    try{
        System.out.println("Enter the the first number ");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
            int result=a/b;
        System.out.println("the result is :"+result);
    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }finally{
        System.out.println("End of Operation");
    }
    }
}