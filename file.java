import java.io.*;
import java.lang.*;

public class Test{
public static void main(String args[]){

    try{
        FileReader fin= new FileReader("text1.text");
        FileWriter fout = new FileWriter("text2.text");
        
        int i;
        while((i=fin.read())!=-1){
            
            fout.write(i);
        }
        fin.close();
        fout.close();
    }
        catch(IOException e){
            System.out.println("error occured");
        }
    }
}
