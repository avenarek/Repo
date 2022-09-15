import java.util.Arrays;

public class Taask3DigitNumber {
    public static void main(String[] args) {
        int[] array = new int[8];
        int number = 25384590;
        int temp = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = number % 10;
            number = number / 10;
        }

        for (int i = 1; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }



//        for (int i = array.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (array[j] > array[j + 1]) {
//                    int t = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = t;
//                }
//            }
//        }
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    int t = array[i];
//                    array[i] = array[j];
//                    array[j] = t;
//                }
//            }
//        }
        Arrays.stream(array).forEach(System.out::print);
    }
}
