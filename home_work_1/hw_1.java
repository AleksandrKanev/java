package home_work_1;
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
public class hw_1 {
    public static void main(String[] args) {
        int n = 10;
        double sum = 0;
        double fac = 1;

        for (int i = 1; i <= n; i++) {
            sum += i;
            fac *= i;
        }

        System.out.printf("Арифметическая прогрессия чила %d равна %s, а факториал равен %f", n, sum, fac);

    }

}