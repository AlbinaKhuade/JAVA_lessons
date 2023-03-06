package lesson1_hw;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        findMinMaxElements();    // 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
//        putElemToEnd();          // 2. Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива
        sayHello();                // 3. Вывести приветствие пользователя в зависимости от текущего времени
    }

    private static void sayHello() {
        Scanner in = new Scanner(System.in);
        System.out.println(("Введите имя: "));
        String name = in.nextLine();
        LocalDateTime localTime = LocalDateTime.now();
        int hourOfDay = localTime.getHour();
        if (hourOfDay >= 5 && hourOfDay < 12) {
            System.out.println("Доброе утро, " + name + "!");
        }
        if (hourOfDay >= 12 && hourOfDay < 18) {
            System.out.println("Добрый день, " + name + "!");
        }
        if (hourOfDay >= 18 && hourOfDay < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        }
        if ((hourOfDay >= 23 && hourOfDay < 24) || (hourOfDay >= 0 && hourOfDay < 5)) {
            System.out.println("Доброй ночи, " + name + "!");
        }
        in.close();
    }

    private static void putElemToEnd() {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start < end) {
            if (arr[start] == val && arr[end] == val) {
                end--;
            }
            else if (arr[start] == val && arr[end] != val) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if (arr[start] != val && arr[end] == val) {
                start++;
                end--;
            }
            else if (arr[start] != val && arr[end] != val) {
                start++;
            }
        }
        for (int item : arr) {
            System.out.printf("%d, ", item);
        }

    }

    private static void findMinMaxElements() {
        int[] arr = {3, 4, 7, -2, 12, 5, 50, 1};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("min = %d, max = %d", min, max);
    }
}
