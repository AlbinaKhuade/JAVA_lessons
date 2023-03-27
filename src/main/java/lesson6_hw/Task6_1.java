package lesson6_hw;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) {
//        1.Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        2.Создать множество ноутбуков (ArrayList).
//        3.Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//        Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//        Выводить только те ноутбуки, что соответствуют условию

        ArrayList<Laptop> listLaptops= new ArrayList<>();
        addListLaptops(listLaptops);
        choiceLaptop(listLaptops);
    }

    private static void choiceLaptop(ArrayList<Laptop> listLaptops) {
        ArrayList<Laptop> listSelectedLaptops = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите необходимые данные для поиска");

        System.out.println("Производитель:");
        String inputManufacturer = in.nextLine();
        System.out.println("Процессор:");
        String inputCPU = in.nextLine();
        System.out.println("Диагональ экрана:");
        double inputScreenDiagonal = Double.parseDouble(in.nextLine());
        System.out.println("Видеокарта:");
        String inputVideoCard = in.nextLine();
        System.out.println("RAM:");
        int inputRAM = Integer.parseInt(in.nextLine());
        System.out.println("HDD:");
        int inputHDD = Integer.parseInt(in.nextLine());
        System.out.println("Цвет:");
        String inputColor = in.nextLine();

        for (Laptop item : listLaptops) {
            if (inputManufacturer.equalsIgnoreCase(item.manufacturer) && inputCPU.equalsIgnoreCase(item.cpu) && inputScreenDiagonal == item.screenDiagonal &&
            inputVideoCard.equalsIgnoreCase(item.videoCard) && inputRAM == item.ram && inputHDD == item.hdd && inputColor.equalsIgnoreCase(item.color)) {
                listSelectedLaptops.add(item);
            }
        }
        if (listSelectedLaptops.isEmpty()) {
            System.out.println("Нет варианта по выбранным параметрам");
        } else {
            for (Laptop item : listSelectedLaptops) {
                item.printInfo();
            }
        }
    }

    private static void addListLaptops(ArrayList<Laptop> listLaptops) {
        Laptop lt1 = new Laptop("ASUS", "Intel", 15.6, "Intel", 4, 128, "черный");
        Laptop lt2 = new Laptop("HP", "Intel", 14, "Intel", 8, 256, "серый");
        Laptop lt3 = new Laptop("ASUS", "AMD", 17, "AMD", 16, 500, "черный");

        listLaptops.add(lt1);
        listLaptops.add(lt2);
        listLaptops.add(lt3);

    }
}
