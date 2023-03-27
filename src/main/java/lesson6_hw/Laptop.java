package lesson6_hw;

public class Laptop {
    String manufacturer;
    String cpu;
    double screenDiagonal;
    String videoCard;
    Integer ram;
    Integer hdd;
    String color;

    public Laptop(String manufacturer, String cpu, double screenDiagonal, String videoCard, Integer ram, Integer hdd, String color) {
        this.manufacturer = manufacturer;
        this.cpu = cpu;
        this.screenDiagonal = screenDiagonal;
        this.videoCard = videoCard;
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;
    }

    public Laptop() {

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return manufacturer == laptop.manufacturer && cpu == laptop.cpu && screenDiagonal == laptop.screenDiagonal && videoCard == laptop.videoCard
                && ram == laptop.ram && hdd == laptop.hdd && color == laptop.color;
    }

    public String toString() {
        return String.format("Производитель: %s\n Процессор: %s\n Диагональ экрана: %.1f\n Видеокарта: %s\n RAM: %d\n HDD: %d\n Цвет: %s\n",
                manufacturer, cpu, screenDiagonal, videoCard, ram, hdd, color);
    }

    public void printInfo() {
        System.out.println(this);
    }

}
