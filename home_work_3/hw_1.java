package home_work_3;

import java.util.ArrayList;
import java.util.Random;

// 1) Пусть дан произвольный список целых чисел, удалить из него четные числа
public class hw_1 {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        int size = 10;
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(list);
        sert(list);
        System.out.println(list);
    }
    public static void sert(ArrayList<Integer> ls) {
        for (int i = 0; i < ls.size(); i++) {
            if(ls.get(i) % 2 == 0){
                ls.remove(i);
                i--;             
            }
            
        }

        
    }
}


