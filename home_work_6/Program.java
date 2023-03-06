package home_work_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(1, 2, 128, "Windows", "Сиреневый");
        Laptop l2 = new Laptop(2, 4, 256, "Windows", "Красный");
        Laptop l3 = new Laptop(3, 32, 512, "Windows", "Серый");
        Laptop l4 = new Laptop(4, 16, 256, "MacOS", "Черный");
        Laptop l5 = new Laptop(5, 32, 1024, "MacOS", "Серый");
        var Laptops = new HashSet<Laptop>(Arrays.asList(l1, l2, l3, l4, l5));
        // System.out.println(l1.toString());
        // System.out.println(l2.toString());
        // System.out.println(l3.toString());
        // System.out.println(l4.toString());
        // System.out.println(l5.toString());

        System.out.println("Вас приветствует магазин ноутбуков!\nПо какому праметру установить фильтр:\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");
        Scanner sc = new Scanner(System.in, "cp866");
        int chois = sc.nextInt();
        if (chois == 1) {
            System.out.println("Ведите объем ОЗУ: ");
            int r = sc.nextInt();
            for (Laptop m : Laptops) {
                if (m.ram >= r) {
                    System.out.println(m);
                }
            }

        }
        if (chois == 2) {
            System.out.println("Ведите объем HDD: ");
            int r = sc.nextInt();
            for (Laptop m : Laptops) {
                if (m.HDD >= r) {
                    System.out.println(m);
                }
            }

        }
        if (chois == 3) {
            System.out.println("Выберите ОС:\n1-MacOS\n2-Windows");
            int r = sc.nextInt();
            if (r == 1) {
                for (Laptop m : Laptops) {
                    if (m.OS == "MacOS") {
                        System.out.println(m);
                    }
                }
            }
            if (r == 2) {
                for (Laptop m : Laptops) {
                    if (m.OS == "Windows") {
                        System.out.println(m);
                    }
                }
            }

        }
        if (chois == 4) {
            System.out.println("Напишите цвет: ");
            String r = sc.next();
            for (Laptop m : Laptops) {
                if (m.color.equals(r)) {
                    System.out.println(m);
                }
            }

        }
        sc.close();
    }
}
