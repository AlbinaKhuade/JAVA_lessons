package lesson5_hw;

import java.util.*;

public class Task5_1 {
    public static void main(String[] args) {
        //        1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
        phoneBook();
    }

    private static void phoneBook() {
        Map<String, List<String>> contacts = new HashMap<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите пункт меню телефонной книги: ");
            System.out.println("1 - Добавить контакт");
            System.out.println("2 - Найти контакт");
            System.out.println("0 - Выход");

            try {
                Integer choice = Integer.parseInt(in.nextLine());
                if (choice == 1) {
                    addContact(contacts);
                }
                if (choice == 2) {
                    getContact(contacts);
                }
                if (choice == 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число!");
                continue;
            }
        }
    }

    private static void getContact(Map<String, List<String>> contacts) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя контакта:");
        String nameContact = in.nextLine();
        if (nameContact.isBlank()) {
            System.out.println("Строка не должна быть пустой!");
        } else {
            if (contacts.get(nameContact) != null) {
                System.out.println("Телефонные номера контакта " + nameContact + " : " + contacts.get(nameContact));
            } else {
                System.out.println("Такого контакта нет в телефонной книге!");
            }
        }
    }

    private static void addContact(Map<String, List<String>> contacts) {
        List<String> phoneNumbersList = new LinkedList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя контакта:");
        String nameContact = in.nextLine();
        if (nameContact.isBlank()) {
            System.out.println("Строка не должна быть пустой!");
        } else {
            System.out.println("Введите телефонные номера через запятую: ");
            String phoneNumber = in.nextLine();
            if (phoneNumber.isBlank()) {
                System.out.println("Строка не должна быть пустой!");
            } else {
                String[] phNumTemp = phoneNumber.split(",");
                phoneNumbersList.addAll(Arrays.asList(phNumTemp));
                contacts.put(nameContact, phoneNumbersList);
                System.out.println(contacts);
                System.out.println("Телефонные номера контакта " + nameContact + " добавлены: " + contacts.get(nameContact));
            }
        }
    }
}
