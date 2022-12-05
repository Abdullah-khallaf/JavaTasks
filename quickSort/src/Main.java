import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();

        int arr [] = new int[size];

        System.out.println("Enter elements of array");
        for (int i = 0 ; i < size ; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("The array before sorting :");
        displayArray(arr);
        System.out.println("The array after sorting :");


        System.out.println("");
        quick_sort(arr, 0, arr.length - 1);

        displayArray(arr);

    }

    public static void quick_sort(int [] array, int left, int right) {
        if (left < right) {
            int q = position(array, left, right);
            quick_sort(array, left, q-1);
            quick_sort(array, q+1, right);
        }
    }
    private static int position(int array [], int left, int right) {
        int i = left - 1;
        for (int j = left ; j < right ; j++) {
            if (array[j] < array[right]) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i+1, right);
        return i+1;
    }
    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void displayArray(int [] nums){
        for (int i = 0 ; i < nums.length ; i++){
            System.out.print(nums [i] + " ");
        }
    }
}