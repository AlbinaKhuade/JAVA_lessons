package lesson1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        inputName();
        arrMax();
//        putElToEnd();
    }

    private static void putElToEnd() {
        int[] arr = new int[]{3, 2, 2, 3};
        int val = 3;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
    }

    private static void arrMax() {
        int[] arr = new int[]{1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1};
        int count = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp++;
            } else {
                if (count < temp) {
                    count = temp;
                }
                temp = 0;
            }
        }
        if (count < temp) {
            count = temp;
        }
        System.out.println(count);
    }

    private static void inputName() {
        Scanner in = new Scanner(System.in);
        System.out.println(("Введите имя: "));
        String name = in.nextLine();
        System.out.println(LocalDateTime.now());
        LocalDateTime localTime = LocalDateTime.now();
        System.out.println("привет, " + name + "!");
        in.close();
    }
}
