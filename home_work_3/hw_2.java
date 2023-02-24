package home_work_3;

import java.util.ArrayList;
import java.util.Random;

public class hw_2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        int size = 3;
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(list);
        max_min_mid(list);
    }
    public static void max_min_mid(ArrayList <Integer> ls) {
        ls.sort(null);
        // System.out.println(ls);
        double sum = 0 ;
        for (int i = 0; i < ls.size(); i++) {
            sum += ls.get(i);
        }
        double mid = sum/ls.size();
        System.out.printf("Минимальное значение %s \n", ls.get(0));
        System.out.printf("Максимальное значение %s\n", ls.get(ls.size()-1));
        System.out.printf("Среднее значение %.2f", mid);
        
    }
}
