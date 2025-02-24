public class massif {
    public static void main(String[] args){
//        int[] numbers = new int[10];
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = 10 + i;
//            sum += numbers[i];
//        }
//        double average = (double) sum / numbers.length;
//        System.out.println("Массив:");
//        for (int num : numbers) {
//            System.out.print(num + " ");
//        }
//        System.out.println("\nСреднее арифметическое: " + average);


//        int[] array = new int[100];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(101);
//        }
//        int sumGreaterThan50 = 0;
//        int countGreaterThan50 = 0;
//        for (int num : array) {
//            if (num > 50) {
//                sumGreaterThan50 += num;
//                countGreaterThan50++;
//            }
//        }
//        double averageGreaterThan50 = (double) sumGreaterThan50 / countGreaterThan50;
//        int sumLessThan50 = 0;
//        int countLessThan50 = 0;
//        for (int num : array) {
//            if (num < 50) {
//                sumLessThan50 += num;
//                countLessThan50++;
//            }
//        }
//        double averageLessThan50 = (double) sumLessThan50 / countLessThan50;
//        System.out.println("Среднее арифметическое чисел больше 50: " + averageGreaterThan50);
//        System.out.println("Среднее арифметическое чисел меньше 50: " + averageLessThan50);

//        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8};
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i]);
//        }
//        Scanner sc = new Scanner(System.in);
//        String[] names = {
//                "Alice", "Bob", "Charlie", "David", "Emma",
//                "Frank", "Grace", "Henry", "Isabella", "Jack",
//                "Katie", "Liam", "Mia", "Noah", "Olivia",
//                "Peter", "Quinn", "Ryan", "Sophia", "Thomas"
//        };
//        char fn = new Scanner(System.in).next().charAt(0);
//        for (String name : names) {
//            if (name.charAt(0) == fn){
//                System.out.println(name);
//                break;
//            }


        int[] array = {81, 38, 57, 91, 82, 97, 83, 48, 24, 24, 20, 31, 32, 86, 61, 13, 24, 58, 70, 66,
                2, 12, 85, 51, 3, 17, 17, 54, 64, 95, 7, 57, 83, 76, 93, 9, 17, 80, 64, 13,
                52, 7, 83, 31, 32, 24, 41, 15, 92, 16, 96, 43, 8, 19, 28, 56, 30, 18, 90,
                58, 22, 79, 96, 74, 26, 100, 16, 4, 29, 75, 3, 72, 75, 15, 94, 45, 59, 96,
                1, 97, 84, 97, 70, 56, 58, 9, 85, 13, 52, 92, 72, 30, 53, 45, 90, 91, 46,
                87, 28, 70
        };
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);



    }






}
