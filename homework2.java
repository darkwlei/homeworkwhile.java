import java.util.Scanner;

public class homework2 {
    public static void main(String[] args){
        method8();
    }
    public static void method8(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a % 10);
        System.out.println((a/10)%10 );
        System.out.println((a/100)%10);
        int f = (a % 10);
        int g = ((a/10)%10);
        int h = (a/100)%10;
        System.out.println(f+g+h);
        System.out.println("hello");
    }
}
