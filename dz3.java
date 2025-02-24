import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите часы:");
        int hours = scanner.nextInt();
        System.out.print("Ведите минуты:");
        int minutes = scanner.nextInt();
        System.out.print("Секунды:");
        int seconds = scanner.nextInt();

        System.out.println("Результат:");
        int Seconds = hours * 3600 + minutes * 60 + seconds;


        System.out.print(Seconds);
    }
}
