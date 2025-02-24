public class met5 {
    public static void main(String[] args){
        summa();

    }
    public static void summa(){
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int num : array) {
            sum += num;

        }
        System.out.println(sum);
    }
}
