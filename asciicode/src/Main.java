import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ascii code: ");
        int ascii = sc.nextInt();

        char castChar = (char)ascii;

        System.out.println("The char value of " + ascii + " is: " + castChar);

    }
}