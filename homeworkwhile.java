public class homeworkwhile {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число:");
//        int a = scanner.nextInt();
//        int count = 0;
//        int result = Math.abs(a);
//        while (result > 0){
//            result /= 10;
//
//            count++;
//        }
//
//        if (result == 0){
//            result = 1;
//            System.out.println("Количество цифр "+count);
//        }
//        Scanner scanner =new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int n = scanner.nextInt();
//
//
//        int sum = 0;
//        int i = 1;
//        while (i <= n) {
//            sum += i;
//            i++;
//        }
//
//
//        System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int i = 1;
//        while (i <= n || i <= m) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        while (a<b){
//            a++;
//            int f = a*a;
//            System.out.println(f);
//        }
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a%2==0){
//            System.out.println(a);
//        }

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        while (true) {
//            if (a > 0) {
//                System.out.println("Напишите число:");
//                a = sc.nextInt();
//            } else if (a != -a) {
//                System.out.println("берегите себя");
//         break;
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int mod1 = a%10;
//        int mod2 = (a/10)%10;
//        int mod3 = ;
//        System.out.println(mod1);
//        System.out.println(mod1);
//        System.out.println(mod2);
//        System.out.println(mod3);

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int mod1 = a%10;
//        int v = (a/10)%10;
//        int f = (a/100)%10;
//        System.out.println(mod1);
//        if (mod1==f || (mod1==v) ){
//            System.out.println("да");
//
//        } else
//            System.out.println("Нет");
//
//        }

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for (int i = 0; i < 10; i++) {
//            int j = a * i;
//            System.out.println(a+"*"+i+"="+j);

        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        System.out.print("Массив int: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        char[] charArray = new char[10];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) ('A' + i);
        }
        System.out.print("Массив char: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();
        String[] stringArray = new String[10];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "Строка " + (i + 1);
        }
        System.out.println("Массив строк:");
        for (String str : stringArray) {
            System.out.println(str);
        }





    }

    }

