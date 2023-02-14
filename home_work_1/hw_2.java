package home_work_1;
// Вывести все простые числа от 1 до 1000
public class hw_2 {
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0) count++;
            }
            if (count == 2) System.out.printf("%d ", i);
        }
    }
}
