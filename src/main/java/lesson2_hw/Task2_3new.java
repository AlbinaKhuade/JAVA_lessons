package lesson2_hw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Task2_3new {
    public static void main(String[] args) {
        //        Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат
        getFilesList("E:\\GeekBrains\\8.Java\\Seminars\\Java_lessons");
    }
    private static void getFilesList(String pathDir) {
        String[] filesNamesFromDir = convertPathToNamesArr(pathDir);
        String str = "";
        for (String fileName: filesNamesFromDir) {
            if (fileName.lastIndexOf(".") >= 0) {
                for (int i = fileName.lastIndexOf(".") + 1; i < fileName.length(); i++) {
                    str += fileName.charAt(i);
                }
            } else {
                str = "";
            }
            System.out.printf("Расширение файла: %s\n", str);
            str = "";
        }
    }

    private static String[] convertPathToNamesArr(String path) {
        File dir = new File(path);

        if (!dir.isDirectory()) {
            throw new RuntimeException("По указанному пути не было найдено директории: " + path);
        }
        return dir.list();
    }
}
