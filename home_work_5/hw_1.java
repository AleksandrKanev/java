package home_work_5;
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

// Добавить функции 1) Добавление номера
// 2) Вывод всего

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;





public class hw_1 {
    static HashMap<Integer, String> tel = new HashMap<Integer, String>();
    static Scanner sc = new Scanner(System.in, "cp866");

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите действие\n1-Добавление номера\n2-Вывод всех номеров\n3-Выход из программы\nВввод: ");
            int n = sc.nextInt();
            if(n == 1){
                add();
            }
            if(n == 2){
                output();
            }

        }
    }
    public static void add() {
        System.out.println("Введите имя абонента: ");
        String name = sc.next();
        System.out.println("Введите номер телефлна: ");
        int num = sc.nextInt();
        tel.put(num, name);
    }
    private static void output() {
        for (Map.Entry<Integer, String> i : tel.entrySet()) {
            System.out.printf("%s - %s\n",i.getValue(), i.getKey());
        }
    }
}
