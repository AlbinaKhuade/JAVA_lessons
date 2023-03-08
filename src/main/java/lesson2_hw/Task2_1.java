package lesson2_hw;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
//        Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
        String str = getString();
        if (isStringPalindrome(str)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }

    }

    private static boolean isStringPalindrome(String str) {
        String newStr = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            newStr += str.charAt(i);
        }
        if (str.equalsIgnoreCase(newStr)) {
            return true;
        } else {
            return false;
        }
    }

    private static String getString() {
        Scanner in = new Scanner(System.in);
        System.out.println(("Введите строку: "));
        String str = in.nextLine();
        in.close();
        return str;
    }
}
