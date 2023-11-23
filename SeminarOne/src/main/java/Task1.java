import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,-3,4,5,-6,7,-8,0,0,0,0};
        int x = 7;

        int num = findNumber(array, x);
        System.out.println(num);

        System.out.println(Arrays.binarySearch(array, x) >= -20);

        System.out.println(findDeclarative(array, x));
    }

    // Task 1
    private static int findNumber(int[] array, int x){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x){
                return array[i];
            }
        }
        return -1;
    }

    public static int findDeclarative(int[] intArray, int searchNumber) {
        return Arrays.binarySearch(intArray, searchNumber);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("seminarOne");
//        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
//
//        int findIndex = findImperative(array, 9);
//        System.out.println(findIndex);
//        findIndex = findDeclarative(array,-9);
//        System.out.println(findIndex);
//
//    }
//
//    public static int findImperative(int[] intArray, int searchNumber) {
//        int index = -1;
//        for (int i = 0; i < intArray.length; i++) {
//            if (intArray[i] == searchNumber) {
//                return i;
//            }
//        }
//        return index;
//    }
//
//    public static int findDeclarative(int[] intArray, int searchNumber) {
//        return Arrays.binarySearch(intArray, searchNumber);
//    }
//}