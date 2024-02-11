import java.util.Scanner;
public class Matrix{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row of Matrix A:");
        int row1=sc.nextInt();
        System.out.println("enter the column of Matrix A:");
        int col1=sc.nextInt();
        System.out.println("enter the row of Matrix B :");
        int row2=sc.nextInt();
        System.out.println("enter the column of Matrix B:");
        int col2=sc.nextInt();
        
        int A[][]=new int[row1][col1];
        int B[][]=new int[row2][col2];
        int C[][]=new int[row1][col2];
        
        if(row1!=col2){
            System.out.println("Matrix Multiplication is not possible");
        }
        else{
        
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.println("enter the values of Matrix A:");
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("============================================\n");
        System.out.println("\n");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.println("enter the values of Matrix B:");
                B[i][j]=sc.nextInt();
            }
    }
    System.out.println("");
    System.out.println("\n");
    System.out.println("MATRIX A :");
    for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
    }
    
    System.out.println("\n");
    System.out.println("MATRIX B :");
    for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.print(B[i][j]+"\t");
            }
            System.out.println("");
    }
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("============================================");
    System.out.println("\n");
    System.out.println("\n");
    for(int i=0;i<row1;i++){
        for(int j=0;j<col2;j++){
            C[i][j]=0;
            for(int k=0;k<col2;k++){
                
                C[i][j]+=A[i][k]*B[k][j];
            }
        }
    }
    
    for(int i=0;i<row1;i++){
        for(int j=0;j<col2;j++){
            System.out.print(C[i][j]+"\t");
        }
        System.out.println("");
    }
    
} 
}
}
