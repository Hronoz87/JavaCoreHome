package Box1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // параметризируем класс типом String для ключа и значения
        Box<String, String> sample1 = new Box<>("имя", "Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer для ключа и Boolean для значения
        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);

        ArrayList<Box<String, Integer>> list1 = new ArrayList<>();

//        list1.add(sample1); Добавление не сработает,
//        list1.add(sample2); потому что типы не соответствуют дженерикам Box

        Box<String, Integer> sample3 = new Box<>("имя", 1);

        list1.add(sample3);

        System.out.println(list1);
    }

}
