package Task3;

import java.util.Arrays;

public class Main {
//    public static void main(String[] args) {
//        int[]arr = new int[]{5,2,5,72,4376,34524,9};
//        System.out.println(Arrays.toString(mergeSort(arr)));
//    }
//
//    public static int[] mergeSort(int[]array){
//        if (array.length == 1){
//            return array;
//        }
//        int half = array.length / 2;
//        int[] left =  Arrays.copyOfRange(array, 0, half);
//        int[] right =  Arrays.copyOfRange(array, half, array.length);
//        return merge(mergeSort(left), mergeSort(right));
//    }
//
//    public static int[] merge(int[] left, int[] right){
//        int[] result = new int[left.length + right.length];
//        int indexLeft = 0;
//        int indexRight = 0;
//
//        while (indexLeft < left.length && indexRight < right.length){
//            if (left[indexLeft] < right[indexRight]){
//                result[indexLeft + indexRight] = left[indexLeft];
//                indexLeft+=1;
//            }else {
//                result[indexLeft + indexRight] = right[indexRight];
//                indexRight+=1;
//            }
//        }
//        for (int i = indexLeft; i < left.length; i++) {
//            result[i + indexRight] = left[i];
//        }
//        for (int i = indexRight; i < right.length; i++) {
//            result[i + indexLeft] = right[i];
//        }
//        return result;
//    }

    public static void main(String[] args) {

    }

    public static int[] mergeSort(int[]array){
        if (array.length == 1){
            return array;
        }
        int half = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, half);
        int[] right = Arrays.copyOfRange(array, half, array.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] rigth){
        int leftIndex = 0;
        int rightIndex = 0;
        int[] result = new int[left.length + rigth.length];
        while (leftIndex < left.length && rightIndex < rigth.length){
            if(left[leftIndex] < rigth[rightIndex]){
                result[leftIndex + rightIndex] = left[leftIndex];
                leftIndex++;
            }else {
                result[leftIndex + rightIndex] = rigth[rightIndex];
                rightIndex++;
            }
        }
        for (int i = leftIndex; i < left.length; i++) {
            result[i + rightIndex] = left[i];
        }
        for (int i = rightIndex; i < rigth.length; i++) {
            result[i + leftIndex] = rigth[i];
        }
        return result;
    }
}

