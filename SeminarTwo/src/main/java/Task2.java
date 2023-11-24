/**
 * На вход подается число в десятичной системе счисления
 * Задача
 * Написать скрипт в любой парадигме, который возвращает полученное число переведенное в двоичную
 * систему счисления. Обоснуйте сделанный выбор парадигм.
 */
public class Task2 {
    public static void main(String[] args) {
        int n = 15;
        int base = 16;
        System.out.println(task2(n, base));

    }

    private static String task2(int n, int base) {
        int remains;
        StringBuilder builder = new StringBuilder();

        while (n > 0){
            remains = n % base;
            if(remains > 9){ // 14 - E
                remains = (char)(55 + remains); //(char)(65) - согласно табл ASCII это символ A. В данном примере если
                // остаток от деления больше 9 (например 14), то согласно табл ASCII - 14 - это 55 + 14 = 69 - т.е. Е
                // т.к. символы используемые в 16-тиричном формате идут 0 1 2 3 4 5 6 7 8 9 A B C D E F, то чтобы
                // получить А, надо из 65 - 10. отсюда вылезает 55
                char ch = (char) remains;
                builder.append(ch);
            }else {
                builder.append(remains);
            }
            n /= base;
        }
        return String.valueOf(builder.reverse());
    }
}
