package lesson3_hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3_3 {
    public static void main(String[] args) {
//        3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
        List<String> list = new ArrayList<>(Arrays.asList("123", "все", "-56", "числа", "0", "удалены", "8", ":)"));
        System.out.println(list);

        removeIntNumbers(list);

    }

    private static void removeIntNumbers(List<String> list) {
        for (int i = 0; i< list.size(); i++) {
            try {
                int number = Integer.parseInt(list.get(i));
                list.remove(i);
            } catch (NumberFormatException e) {

            }
        }
        System.out.println(list);
    }
}
