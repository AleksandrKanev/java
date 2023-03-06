package home_work_5;

import java.util.Random;

public class hw_3 {
    

    public static void main(String[] args) {
        int[][] t = new int[8][8];
        int[][] t1 = new int[8][8];
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            boolean f = false;
            int count = 0;
            while (f == false) {
                int j = rand.nextInt(8);
                if (t1[i][j] == 0) {
                    t[i][j] = 1;
                    add(i, j, t1);
                    f = true;
                }
                if (count > 30) {
                    break;
                }
                count++;

            }
            if (count > 30) {
                System.out.println("Решения нет");
                break;
            }
        }
        print(t);
        
    }

    public static void print(int[][] t) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(t[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void add(int i, int j, int[][] t1) {

        t1[i][j] = 1;
        for (int k = i; k < 8; k++) {
            t1[k][j] = 1;

        }
        for (int k = 0; k < 8; k++) {
            t1[i][k] = 1;

        }
        for (int k = i, m = j; k < 8 && m >= 0; k++, m--) {
            t1[k][m] = 1;

        }
        for (int k = i, m = j; k < 8 && m < 8; k++, m++) {
            t1[k][m] = 1;
        }
        
    }

}
