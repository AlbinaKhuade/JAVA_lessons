package lesson3_hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task3_1 {
    public static void main(String[] args) {
//        1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
        ArrayList<Integer> arrayList = getRandomNumbers();
        System.out.println(arrayList);

        System.out.println("==========");

        removeEvenNumbers(arrayList);
        System.out.println(arrayList);
    }

    private static ArrayList<Integer> getRandomNumbers() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(20, 100)); // bound не включая
        }
        return arrayList;
    }

    private static void removeEvenNumbers(ArrayList<Integer> arrayList) {
        arrayList.removeIf(n -> n % 2 == 0);
    }
}
