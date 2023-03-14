package lesson3_hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task3_2 {
    public static void main(String[] args) {
//        2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
        ArrayList<Integer> arrayList = getRandomNumbers();
        System.out.println(arrayList);

        System.out.printf("Минимальное значение = %d\nМаксимальное значение = %d\nСреднее арифметическое значение = %.2f",
                getMinElem(arrayList), getMaxElem(arrayList), getAvg(arrayList));


    }

    private static Object getAvg(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int item:arrayList) {
            sum += item;
        }
        double avg = (double)sum / (double)arrayList.size();
        return avg;
    }

    private static Object getMaxElem(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        for (int item:arrayList) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    private static Object getMinElem(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int item:arrayList) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    private static ArrayList<Integer> getRandomNumbers() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(20, 100)); // bound не включая
        }
        return arrayList;
    }

}
