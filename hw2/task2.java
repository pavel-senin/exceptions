import java.util.Arrays;


public class task2 {
    public static void main(String[] args) {

//        Integer[] intArray = null;
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, null, 10};

        try {
            int d = 0;
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);

        } catch (NullPointerException e) {
            System.out.println("У вас NullPointerException: " + e + "\n>>> " + Arrays.toString(e.getStackTrace()));
        }
    }
}