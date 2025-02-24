import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = scanner.nextInt();


        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;


        System.out.println(hundreds + "," + tens + "," + ones);
    }
}

