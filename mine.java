import java.util.Scanner;


public class mine {
    public static void main(String[] args) {
        System.out.print("Enter first number:");
        Scanner java = new Scanner(System.in);
        int a = java.nextInt();
        System.out.print("Enter second number:");
        int b = java.nextInt();
        int minus = a-b;
        System.out.println("Difference:" + minus);

    }

}