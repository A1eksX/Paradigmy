import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Реализовать с использованием функциональной парадигмы процедуру normalization, которая выполняет
 * нормализацию полученного массива по приведенной формуле нормализованного значения элемента, где
 * ○ x_norm - нормализованное значение элемента
 * ○ x - исходное значение элемента
 * ○ x_max, x_min - максимальное и минимальное значение в массиве
 * Контекст
 * Есть такая операция в статистике - “нормализация”. Это операция принимающая на вход вектор и
 * возвращающая другой вектор. Смысл этой операции в том, чтобы данные из разных шкал загнать в
 * единый диапазон, как правило - от 0 до 1, тогда с данными становится проще работать.
*/
public class Task1 {
    public static void main(String[] args) {
        // Task1
        int[] array = new int[] {1, 5, 3, 6, 8, 7, 2, 4};


        double[] norm = normalization(array);
        for (double item : norm) {
            System.out.print(item + "    ");
        }
    }

    public static double[] normalization(int[] arr) {
        int size = arr.length;
        double[] normalization = new double[size];

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        for (int i = 0; i < arr.length; i++) {
            normalization[i] =  ((double) (arr[i] - min) / (max - min));
        }
        return normalization;
    }
}


//import java.util.Arrays;
//import java.util.Collections;
//
//public class Task1 {
//    // Код Р
//        public static void main(String[] args) {
//            List<Integer> listNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//
//            System.out.println(normalization(listNumbers));
//
//        }
//
//        public static List<Double> normalization(List<Integer> integers) {
//            int min = Collections.min(integers);
//            int max = Collections.max(integers);
//
//            List<Double> result = new ArrayList<>();
//
//            for (Integer integer : integers) {
//                result.add(normalizationSingleNumber(integer, min, max));
//            }
//
//            return result;
//        }
//
//        public static double normalizationSingleNumber(int val, int min, int max) {
//            return (double) (val - min) / (max - min);
//        }
//
//    }