import java.util.Scanner;
public class Charact_freq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = sc.nextLine();
        System.out.println("Enter the character to be searched:");
        char ch = sc.next().charAt(0);
        int count=0,i,size;
        size=str.length();
        for(i=0;i<size;i++){
            if(ch==str.charAt(i)){
                count++;
            }

            }
            System.out.println("the number of characters is "+count);
        }

    }
