import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            //reading array elements from the user
            array[i]=sc.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            //Compare elements of array with max
            if(array[i] > max)
                max = array[i];
        }
        System.out.println("Largest element in array: " + max);

    }
}