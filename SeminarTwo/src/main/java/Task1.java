/**
 * Задача
 * Реализовать чисто структурную реализацию вычисления следа для любой матрицы NxN
 *
 * След матрицы - это сумма чисел на её главной диагонали. След определён только для квадратных матриц
 * (количество столбцов = количеству строк).
 */
public class Task1 {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(task1(matrix));
    }

    private static int task1(int [][] array2D) {
        int summ = 0;
        for (int i = 0; i < array2D.length; i++) {
            summ += array2D[i][i];
        }
        return summ;
    }
}
