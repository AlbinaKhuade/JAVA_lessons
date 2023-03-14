package lesson4_hw;

import java.util.Collections;
import java.util.LinkedList;

public class Task4_2 {
    public static void main(String[] args) {
//        2. Пусть дан LinkedList с несколькими элементами.
//        Реализуйте метод, который вернет “перевернутый” список.

        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "a", "b", "c", "d", "e", "f");

        LinkedList<String> resultList = new LinkedList<>();
        resultList = invertList(wordsList);

        System.out.println("Был список: " + wordsList);
        System.out.println("Стал список: " + resultList);
    }


    private static LinkedList<String> invertList(LinkedList<String> wordsList) {
        LinkedList<String> newWordsList = new LinkedList<>();
        for (int i = 0; i < wordsList.size(); i++) {
            newWordsList.addFirst(wordsList.get(i));
        }
        return newWordsList;
    }
}
