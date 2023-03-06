package home_work_5;
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
import java.util.HashMap;
import java.util.Map;

public class hw_2 {
    static HashMap<String, Integer> tel = new HashMap<String, Integer>();
    public static void main(String[] args) {
        String[] name = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };

        for (int i = 0; i < name.length; i++) {
            String[] f_name = name[i].split(" ");
            int count = 0;
            for (int j = 0; j < name.length; j++) {
                String[] f_name1 = name[j].split(" ");
                if(f_name[0].equals(f_name1[0])){
                    count+=1;
                }
                
            }
            add(f_name[0], count);
        }
        output();
    }
    public static void add(String name, int num) {
        tel.put(name, num);
    }
    private static void output() {
        for (Map.Entry<String, Integer> i : tel.entrySet()) {
            System.out.printf("%s - %s\n",i.getValue(), i.getKey());
        }
    }
}
