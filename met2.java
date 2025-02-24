public class met2 {
    public static void main(String[] arg){
        int[] massif = {1,2,3,4,5,6,7,8};
        massif(massif);
    }
    public static void massif(int[] array){

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }

    }
}
