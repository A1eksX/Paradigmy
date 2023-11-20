import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,-3,4,5,-6,7,-8,0,0,0,0};

        System.out.println(task2(array));
    }

    // Task 2

    public static List task2(int []arr){
        List newArray = new ArrayList<>();
        double coutnPositive = 0;
        double coutnZero = 0;
        double coutnNegative = 0;
        int total = arr.length;
        if (total == 0){
            System.out.println("массив пустой");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                coutnPositive++;
            }
            if (arr[i] == 0){
                coutnZero++;
            }
            if (arr[i] < 0){
                coutnNegative++;
            }
        }

        newArray.add((coutnPositive / total));
        newArray.add((coutnNegative / total));
        newArray.add((coutnZero / total));
        return newArray;
    }

//    public static List task2_1(int []arr){
//        int coutnPositive = 0;
//        int coutnZero = 0;
//        int coutnNegative = 0;
//    }

}
