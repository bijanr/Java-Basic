package Practical;
import java.util.Scanner;
public class Matrix {
    static int[][] matrixA, matrixB,matrixAdd, matrixMult;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension of A : ");
        int rowA = sc.nextInt();
        int colA = sc.nextInt();

        matrixA = new int[rowA][colA];
        System.out.println("Enter the elements of A: ");

        Matrix.inputMatrix(matrixA, rowA, colA);

        System.out.println("Enter the dimension of B : ");
        int rowB = sc.nextInt();
        int colB = sc.nextInt();

        matrixB = new int[rowB][colB];
        System.out.println("Enter the elements of B: ");

        Matrix.inputMatrix(matrixB, rowB, colB);

        Matrix.printMatrix(matrixA, rowA, colA);
        Matrix.printMatrix(matrixB, rowB, colB);
        sc.close();

        //addition
        if(rowA!= rowB || colA!=colB)
        {
            System.out.println("Enter valid dimensions. ");
        }
        else
        {
            matrixAdd = new int[rowA][colB];
            Matrix.MatrixAdd(matrixA, matrixB, matrixAdd, rowA, colB);
        }

        //multiplication
        if(colA != rowA)
        System.out.println("Enter valid dimensions. ");
        else{
            matrixMult = new int[rowA][colB];
            Matrix.MatrixMult(matrixA, matrixB, matrixMult, rowA, rowB, colB);
        }

        Matrix.printMatrix(matrixAdd, rowA, colB);
        Matrix.printMatrix(matrixMult, rowA, colB);

    }


    //input
    static void inputMatrix(int[][] array,int row, int col)
    {
        
        for(int i=0;i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                array[i][j] = scan.nextInt();
            }
        }
        
        
    }
    
    //output
    static void printMatrix(int[][] array, int row, int col){
    System.out.println("The Matrix is: ");
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {
            System.out.print(array[i][j] + " ");
        }
        System.out.println("");
    }
    }   

    //addition
    static void MatrixAdd(int[][] matrixA, int[][] matrixB, int[][] matrixAdd,int rowA, int colB)
    {   

        for(int i=0;i<rowA;i++)
        {
            for(int j=0; j<colB; j++)
            {
                matrixAdd[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
    }

    //multiplication
    static void MatrixMult(int[][] matrixA, int[][] matrixB, int[][] matrixMult, int rowA, int rowB, int colB)
    {
        for(int i=0; i<rowA; i++)
        {
            for(int j=0; j<colB; j++)
            {
                for(int k=0; k<rowB; k++)
                {
                    matrixMult[i][j] += matrixA[i][k] * matrixB[k][j] ;
                }
            }
        }
    }
}

    

