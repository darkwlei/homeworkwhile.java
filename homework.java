import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, которое хотите умножить: ");
        int a = scanner.nextInt();

        System.out.print("Введите число, которое хотите умножить на предыдущее: ");
        int b = scanner.nextInt();

        System.out.print("Введите число, которое хотите вычесть: ");
        int y = scanner.nextInt();

        System.out.print("Введите число, которое хотите сложить: ");
        int x = scanner.nextInt();

        System.out.print("Введите число, которое хотите разделить:: ");
        int r = scanner.nextInt();

        System.out.print("Введите еще одно число, которое хотите добавить: ");
        int f = scanner.nextInt();


        float divisionResult = (float) x / r / f;


        int result = a * b - y + (int) divisionResult;
        System.out.println("Результат операции: " + result);
    }
}
