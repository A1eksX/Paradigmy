/**
 * Задача
 * Написать скрипт в любой парадигме, который возвращает полученное число переведенное в двоичную
 * систему счисления. Обоснуйте сделанный выбор парадигм.
 *
 * Условие
 * На вход подается число в десятичной системе счисления
 * */
public class Task2 {
    StringBuilder stringBuilder = new StringBuilder();


    public static void main(String[] args) {
        int dec = 17;
        System.out.println(decToBin(dec));
        System.out.println(decToBase(dec,16));

    }

    public static String decToBin(int dec){
        String result = "";
        int rest;
        do {
            rest = dec % 2;
            result = Integer.toString(rest) + result;
            dec = dec/2;
        } while (dec > 0);
        return result;
    }

    public static String decToBase(int dec, int base){
        String result = "";
        int rest;
        do {
            rest = dec % base;
            String restChar = "";
            if(rest > 9) restChar = String.valueOf((char) (rest + 55));
            else restChar = Integer.toString(rest);

            result = restChar + result;
            dec = dec/base;
        } while (dec > 0);
        return result;
    }
}

// лучший вариант
//public class TaskTwo {
//    public static void main(String[] args) {
//
//        System.out.println(toBase(30, 16));
//
//    }
//
//    public static String toBase(int number, int base) {
//        StringBuilder stringBuilder = new StringBuilder();
//        while (number != 0) {
//            int remainder = number % base;
//            if (remainder >= 10) {
//                stringBuilder.append((char) (remainder + 55));
//            } else {
//                stringBuilder.append(remainder);
//            }
//            number = number / base;
//        }
//        return stringBuilder.reverse().toString();
//    }
//}

/*
        int i = 22;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.parseInt("10110", 2));
 */