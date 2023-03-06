package home_work_6;

public class Laptop {
    int id;
    int ram;
    int HDD;
    String OS;
    String color;

    public Laptop(int id, int ram, int HDD, String OS, String color) {
        this.id = id;
        this.ram = ram;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;
    }

    public String toString() {
        return String.format("id: %d, ram: %d ГБ, HDD: %d ГБ, OS: %s, color: %s", id, ram, HDD, OS, color);
    }

    public boolean equlas(Object o) {
        Laptop t = (Laptop) o;
        return id == t.id;
    }
}
