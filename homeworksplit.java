import java.util.Arrays;
import java.util.Scanner;

public class homeworksplit {
    public static void main(String[] args){
       method7();

    }
    public static void method7(){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(Arrays.toString(a.split(" ")));
    }
}
