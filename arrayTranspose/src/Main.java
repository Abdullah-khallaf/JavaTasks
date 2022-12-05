// task4 : transpose of 2d array
public class Main {
    public static void main(String[] args) {


        int[][] matrix = { {3, -2, 5}, {3, 0, 4} };

        int[][] transpose = new int[3][2];  //3 rows and 3 columns

        // transpose
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("The matrix before transposing :");
        displayArray(matrix);
        System.out.println("The matrix after transposing :");
        displayArray(transpose);

    }


    public static void displayArray(int [] [] arr){
        for(int[] row : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}