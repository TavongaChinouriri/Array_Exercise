import java.sql.Array;
import java.util.Scanner;

public class Ex4{
//    Create a Java program to add two matrices of size 2 x 3.
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int[][] matrix = new int[2][3];
    int[][] matrix1 = new int[2][3];

    matrix[0][0] = 25;
    matrix[0][1] = 25;
    matrix[0][2] = 12;
    matrix[1][0] = 40;
    matrix[1][1] = 52;
    matrix[1][2] = 2;
    matrix1[0][0] = 50;
    matrix1[0][1] = 10;
    matrix1[0][2] = 8;
    matrix1[1][0] = 12;
    matrix1[1][1] = 40;
    matrix1[1][2] = 30;

    System.out.println("Matrix One");
    for (int i = 0; i < 2; i++) {
        int j;
        for (j = 0; j < 3; j++)

            System.out.print(matrix[i][j] + " ");

        System.out.println();
    }
    System.out.println("Matrix two");
    for (int i = 0; i < 2; i++) {
        int j;
        for (j = 0; j < 3; j++)
            System.out.print(matrix1[i][j] + " ");
        System.out.println();
    }
    // Function to add the two matrices
    // and store in matrix C
    int i, j;
    int matrixSum[][] = new int[2][3];
    System.out.println("Matrix Sum");
    for (i = 0; i < 2; i++){
       for (j = 0; j < 3; j++){
           matrixSum[i][j] = matrix[i][j] + matrix1[i][j];
           System.out.print(matrixSum[i][j] + " ");}

       System.out.println();
    }
}}