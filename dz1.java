import java.util.Random;

public class dz1 {
    public static void main(String[] arg){
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int y = rand.nextInt(10);
        System.out.print(a);
        System.out.print(b);
        System.out.print(y);
        System.out.print((a+b+y)/3);



    }
}
