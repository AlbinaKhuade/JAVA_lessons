package lesson2_hw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Task2_2 {
    public static void main(String[] args) {
//        Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
//        и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
        String word = "TEST";
        int count = 100;
        String str = makeString100repeat(word, count);
        writeStringInFile(str);
    }

    private static void writeStringInFile(String str) {
        File output = new File("src/main/resources/files/lesson2_hw_task2_2.txt");
        if (!output.exists()) {
            try {
                output.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException("Файл не найден по пути: " + output.getPath());
            }
        }
        try (PrintWriter pw = new PrintWriter(output)) {
            pw.print(str);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден по пути: " + output.getPath());
        }
    }

    private static String makeString100repeat(String word, int count) {
        String str = "";
        for (int i = 0; i <= count; i++) {
            str += word;
        }
        return str;
    }
}
