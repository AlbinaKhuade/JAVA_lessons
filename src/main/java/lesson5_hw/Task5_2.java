package lesson5_hw;

import java.util.*;
import java.util.stream.Collectors;

public class Task5_2 {
    public static void main(String[] args) {
//        2. Пусть дан список сотрудников:
//        Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности.

        Map<String, String> employees = new HashMap<>();
        employees.put("Иванов", "Иван");
        employees.put("Петрова", "Светлана");
        employees.put("Белова", "Кристина");
        employees.put("Мусина", "Анна");
        employees.put("Крутова", "Анна");
        employees.put("Юрин", "Иван");
        employees.put("Лыков", "Петр");
        employees.put("Чернов", "Павел");
        employees.put("Чернышов", "Петр");
        employees.put("Федорова", "Мария");
        employees.put("Светлова", "Марина");
        employees.put("Савина", "Мария");
        employees.put("Рыкова", "Мария");
        employees.put("Лугова", "Марина");
        employees.put("Владимирова", "Анна");
        employees.put("Мечников", "Иван");
        employees.put("Петин", "Петр");
        employees.put("Ежов", "Иван");
        findRepeatNames(employees);
    }

    private static void findRepeatNames(Map<String, String> employees) {
        int count = 1;
        List<String> names = new ArrayList<>();
        Map<String, Integer> unsortedNamesWithCount = new HashMap<>();

        for (var item : employees.entrySet()) {
            names.add(item.getValue());
        }
//        System.out.println("список имен: " + names);
        names.sort(Comparator.naturalOrder());
//        System.out.println("отсортированный список имен: " + names);

        for (int i = 0; i < names.size() - 1; i++) {
            if (names.get(i).equals(names.get(i + 1))) {
                count++;
            } else {
//                System.out.printf("%s - %d\n", names.get(i), count);
                unsortedNamesWithCount.put(names.get(i), count);
                count = 1;
            }
            if (i == names.size() - 2) {
//                System.out.printf("%s - %d\n", names.get(i + 1), count);
                unsortedNamesWithCount.put(names.get(i + 1), count);
            }
        }

//        System.out.println(unsortedNamesWithCount);

        Map<String, Integer> sortedNamesWithCount = unsortedNamesWithCount.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));
        System.out.println("Список имен с количеством повторений, отсортированный по убыванию популярности:");
        sortedNamesWithCount.entrySet().forEach(System.out::println);
    }
}
