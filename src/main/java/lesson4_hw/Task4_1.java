package lesson4_hw;

import java.util.LinkedList;
import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
//        1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
        inputText();
    }

    private static void inputText() {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(("\n----------------------------------"));
            System.out.println(("*\tprint\t->\tВывести строки"));
            System.out.println(("*\trevert\t->\tУдалить предыдущую введенную строку"));
            System.out.println(("*\texit\t->\tВыход"));
            System.out.println(("----------------------------------"));
            System.out.println(("Введите строку:"));
            String text = in.nextLine();
            if (text.isBlank()) {
                System.out.println("Строка не должна быть пустой!\n");
                continue;
            }
            if (text.equalsIgnoreCase("print")) {
                printText(linkedList);
                continue;
            }
            if (text.equalsIgnoreCase("revert")) {
                linkedList.removeFirst();
                System.out.println("Предыдущая введенная строка удалена!");
                continue;
            }
            if (text.equalsIgnoreCase("exit")) {
                System.out.println("До свидания!");
                break;
            }

            linkedList.addFirst(text);
            System.out.println("Строка добавлена!");
        }
    }

    private static void printText(LinkedList<String> linkedList) {
        System.out.println("Все введенные строки:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.printf("%d) %s\n", i+1, linkedList.get(i));
        }
    }
}
