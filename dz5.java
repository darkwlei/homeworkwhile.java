import java.util.Scanner;

public class dz5 {
    public static void main(String[] args) {

//        Scanner number = new Scanner(System.in);
//        int a = number.nextInt();
//        int w = number.nextInt();
//        int e = number.nextInt();
//        int r = number.nextInt();
//        int t = number.nextInt();
//        int y = number.nextInt();
//        System.out.println(a);
//        System.out.println(w);
//        System.out.println(e);
//        System.out.println(r);
//        System.out.println(t);
//        System.out.println(y);
//        int max = Math.max(a, w);
//        int max1 = Math.max(e, r);
//        int max2 = Math.max(t, y);
//        int b = Math.max(max, max1);
//        int d = Math.max (b, max2);
//
//        int min3 = Math.min(a, w);
//        int min4 = Math.min(e, r);
//        int min5 = Math.min(t, y);
//        int l = Math.min(min3, min4);
//        int p = Math.min (l, min5);
//
//
//        System.out.println("max:"+d);
//        System.out.println("min:"+p);


//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int a = (int) Math.sqrt(number);
//        System.out.println("Результат:"+a);

//        Scanner scanner = new Scanner (System.in);
//        System.out.println();
//        System.out.print("Введите число:");
//        int q = scanner.nextInt();
//        System.out.print("Введите число:");
//        int a = scanner.nextInt();
//        int b = 9999;
//        if (a>b){
//            System.out.println(b);s
//        }else {
//            System.out.println(a);
//        }

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int s = scanner.nextInt();
//        if (a >= b && a >= s) {
//            System.out.println(a);
//        } else if (b >= a && b >= s) {
//            System.out.println(b);
//        }else if (s>=b && s>=s); {
//            System.out.println(s);
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Возраст:");
//        int a = scanner.nextInt();
//        String s = "Отклено";
//        String d = "Покупка завершено";
//        if (18<a){
//            System.out.println(d);
//        } else {
//            System.out.println(s);
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Какую курс валюту хотите узнат:");
//        String a = scanner.next();
//        switch (a) {
//            case "USD":
//                System.out.println("USD = 87.45");
//                break;
//            case "KZT":
//                System.out.println("KZT = 0.17");
//                break;
//            case "RUB":
//                System.out.println("RUB = 0.87");
//                break;
//            case "EUR":
//                System.out.println("EUR = 87.43");
//                break;
//        }
//        Random random = new Random();
//        int a = random.nextInt();
//        if (a>100){
//            System.out.println("Меньше");
//        } else {
//            System.out.println("Больше");
//        }
//        Scanner scanner = new Scanner(System.in);
//        int Password = 1234;
//        int attempts = 0;a
//        int enterpassword;
//
//        while (attempts < 3) {
//            System.out.print("Введите пароль: ");
//            enterpassword = scanner.nextInt();
//            if (enterpassword == Password) {
//                System.out.println("Верный пароль");
//                return;
//            } else {
//                System.out.println("Неверный пароль");
//            }s
//            attempts++;
//        }
//
//        System.out.println("Превышено количество попыток.");

//        Random random = new Random();
//        int a = random.nextInt();
//        System.out.println("Орел или Решка");
//        if (a>10){
//            System.out.println("Орел");
//        } else {
//            System.out.println("Решка");
//        }

//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        System.out.print(a.substring(0,a.length()/2).toUpperCase());
//        System.out.print(a.substring(a.length()/2).toLowerCase());

        Scanner sc = new Scanner(System.in);
        String text = sc.next(); ;
        for (int i = text.length(); i > 0; i--) {
            System.out.println(text.substring(0, i));
        }





        }
    }




