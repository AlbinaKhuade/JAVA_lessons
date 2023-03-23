package lesson2_hw;

import java.io.*;

public class Task2_3 {
    public static void main(String[] args) throws IOException {
//        Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат
        getFilesList("E:\\GeekBrains\\8.Java\\Seminars\\Java_lessons");
        getFileExtensions("src/main/resources/files/lesson2_hw_task2_3.txt");
    }

    private static void getFileExtensions(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String str;
        String str2 = "";
        while ((str = br.readLine()) != null) {
            if (str.lastIndexOf(".") >= 0) {
                for (int i = str.lastIndexOf(".") + 1; i < str.length(); i++) {
                    str2 += str.charAt(i);
                }
            } else {
                str2 = "";
            }
            System.out.printf("Расширение файла: %s\n", str2);
            str2 = "";
        }

        br.close();
    }

    private static void getFilesList(String pathDir) {
        String[] filesNamesFromDir = convertPathToNamesArr(pathDir);

        StringBuilder sb = new StringBuilder();
        for (String fileName : filesNamesFromDir) {
            sb.append(fileName).append(System.lineSeparator());
        }

        File output = new File("src/main/resources/files/lesson2_hw_task2_3.txt");
        if (!output.exists()) {
            try {
                output.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (PrintWriter pw = new PrintWriter(output)) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден по пути: " + output.getPath());
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
