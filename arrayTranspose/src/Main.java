import java.util.Scanner;

public class ArrayTranspose{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // Take the Array from the user
        System.out.println("Enter 2D array rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter 2D array columns : ");
        int columns=sc.nextInt();

        System.out.println("Enter array elements : ");
        int twoD[][]=new int[rows][columns];
        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
        }

        // working on the transpose
        int[][] transpose = new int[columns][rows];

        for(int i = 0 ; i < columns ; i++){
            for(int j = 0 ; j < rows ; j++){
                transpose[i][j] = twoD[j][i];
            }
        }

        // printing the matrix
        System.out.print("\nYour Matrix : \n");
        for(int []x:twoD){
            for(int y:x){
                System.out.print(y+"        ");
            }
            System.out.println();
        }

        System.out.print("\nMatrix Transpose : \n");
        for(int []x:transpose){
            for(int y:x){
                System.out.print(y+"        ");
            }
            System.out.println();
        }

    }

}
