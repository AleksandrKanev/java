package home_work_1;

import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
public class hw_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n1 = input.nextInt();
        System.out.print("Введите второе чсило: ");
        int n2 = input.nextInt();
        System.out.print("Введите символ ");
        char c = input.next().charAt(0);
        input.close();
        System.out.println(cal(n1, n2, c));
        // cal(n1, n2, c);
    }

    public static Integer cal(int n1, int n2, char c) {
        if(c == '+'){
            return n1 + n2;
        }
        else if(c == '-'){
            return n1 - n2;
        }
        else if(c == '*'){
            return n1 * n2;
        }
        else if(c == '/'){
            return n1 / n2;
        }
        return null;
    }
}
