import java.util.Scanner;

public class met1 {
    public static void main(String[] arg){
        method();

    }
    public static void method(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                Hello();
                break;
            case 0:
                Bye();
                break;
        }
    }
    public static void Hello(){
        System.out.println("Hello");
    }
    public static void Bye(){
        System.out.println("Bye");

    }
}
