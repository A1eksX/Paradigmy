package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Контекст
 * Предположим, что есть какой-то массив содержащий данные о разных людях и их возрасте и вас
 * попросили ответить на следующий вопрос: “сколько в массиве людей возраста > 30?”. Для этого, вы
 * хотите написать программу для фильтрации наблюдений по возрастному признаку
 * Ваша задача
 * Написать скрипт принимающий на вход массив с данными о людях и число - возраст, а возвращающий
 * число - количество людей старше указанного возраста.
 */

public class Task2 {
    public static void main(String[] args) {
    Stream<Human> humanStream = Stream.of(new Human("1", 25),
                                            new Human("2", 32),
                                            new Human("3", 22),
                                            new Human("4", 20),
                                            new Human("5", 18),
                                            new Human("6", 25));

    System.out.println(humanStream.filter(q -> q.getAge() < 22).toList().stream().count());

    }
}

// код Р
//import java.util.ArrayList;
//import java.util.List;
//
//public class Task2 {
//    public static void main(String[] args) {
//        List<Human> humans = new ArrayList<>();
//        humans.add(new Human("Ivan", 29));
//        humans.add(new Human("Roma", 31));
//        humans.add(new Human("Roma", 31));
//        humans.add(new Human("Roma", 31));
//        humans.add(new Human("Roma", 31));
//        humans.add(new Human("Roma", 31));
//        humans.add(new Human("Roma", 31));
//
//        System.out.println(countPeopleOlderThen(humans, 30));
//    }
//    public static long countPeopleOlderThen(List<Human> humans, int limit) {
//        return humans.stream().filter(x -> x.getAge() > limit).count();
//    }
//}


