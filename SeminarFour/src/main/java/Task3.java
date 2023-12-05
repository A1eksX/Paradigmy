/**
 * Контекст
 * Важнейшая задача в анализе данных - поиск дубликатов. Дубликат - это наблюдение, встречающееся в
 * данных больше одного раза. Такие наблюдения не просто не улучшают результат анализа или
 * полученных моделей, но и замедляют весь процесс в целом, поэтому аналитики и разработчики
 * предпочитают избавляться от них перед тем как приступить к анализу.
 * ● Ваша задача
 * Реализовать с использованием функциональной парадигмы процедуру для поиска дубликатов. На вход
 * подается массив, где могут присутствовать дубликаты (а могут и не присутствовать). При применении к
 * массиву, дубликаты должны быть выведены на экран в виде списка.
 */


import java.util.*;

public class Task3 {
//    // код Р
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(5,1,1,1,2,3,4,5,5,5,6,6,7,7,7);
//        System.out.println(getDuplicates(numbers));
//    }
//
//    public static List<Integer> getDuplicates(List<Integer> nums) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < nums.size(); i++) {
//            int currentNumber = nums.get(i);
//            if (i != nums.lastIndexOf(currentNumber)) {
//                result.add(currentNumber);
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(6);

        int[] array = new int[]{1,5,3,4,2,6,1,2,3,4,5,1,2,2,9};

//        for (int x: notDuplucateArray(array)  ) {
//            System.out.print(x + " ");
//        }

        for (int x: notDuplucate(list)  ) {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> notDuplucate(List<Integer> lst){
        List<Integer> listDuplucate = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (Integer element : lst) {
            if (set.contains(element)) {
                listDuplucate.add(element);
            }else {
                set.add(element);
            }
        }
        return listDuplucate;
    }

    public static List<Integer> notDuplucateArray(int[] arr){
        List<Integer> listDuplucate = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (Integer element : arr) {
            if (set.contains(element)) {
                listDuplucate.add(element);
            }else {
                set.add(element);
            }
        }
        return listDuplucate;
    }
}
