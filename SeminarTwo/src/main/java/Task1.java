import java.util.Random;

/**
 * Реализовать чисто структурную реализацию вычисления следа для любой матрицы NxN
 * След матрицы - это сумма чисел на её главной диагонали. След определён только для квадратных матриц
 * (количество столбцов = количеству строк).
 */
public class Task1 {
    public static void main(String[] args) {
//        System.out.println("seminar two");
//
//        int[][] matrix = new int[3][3];
//        Random rnd = new Random();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                matrix[i][j] = rnd.nextInt(1,10);
//            }
//        }
//
//        printIntMatrix(matrix);
//
//        int matrixTrace = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            matrixTrace += matrix[i][i];
//        }
//        System.out.println(matrixTrace);
//    }
//
//    public static void printIntMatrix(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > i) sum += matrix[i][i];
        }

        System.out.println(sum);

    }
}

