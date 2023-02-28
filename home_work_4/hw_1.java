package home_work_4;


import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
public class hw_1 {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println(list);

        list = rev_list(list);
        System.out.println(list);
      
    }

    public static LinkedList<String> rev_list(LinkedList<String> list) {
        LinkedList <String> n_list = new LinkedList<>();
        
        for (int i = 0; i < list.size(); i++) {
            n_list.addFirst(list.get(i));
        }

        return n_list;
    }
}
