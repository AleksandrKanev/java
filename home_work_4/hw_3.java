package home_work_4;

import java.util.LinkedList;
import java.util.Scanner;

// В калькулятор добавьте возможность отменить последнюю операцию.
public class hw_3 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        int n1 = 0;
        int n2 = 0;
        while (true) {
            
            if (flag == false) {
                System.out.print("Число: ");
                n1 = input.nextInt();
                flag = true;
            } else {
                System.out.println(n1);
            }

            System.out.print("Символ: ");
            String c = input.next();
            if (!"back".equals(c)) {
                char x = c.charAt(0);
                System.out.print("Чсило.: ");
                n2 = input.nextInt();
                n1 = cal(n1, n2, x, list);
                // System.out.println(n1);
            }
            else if ("end".equals(c)) {
                input.close();
                break;
            } else {
                n1 = dequeue(list);
                
            }  
        }
        
    }

    public static Integer cal(int n1, int n2, char c, LinkedList<Integer> list) {
        int rez = 0;
        if (c == '+') {
            rez = n1 + n2;
        } else if (c == '-') {
            rez = n1 - n2;
        } else if (c == '*') {
            rez = n1 * n2;
        } else if (c == '/') {
            rez = n1 / n2;
        }
        enqueue(list,rez);    
        return rez;
    }
    private static void enqueue(LinkedList<Integer> list, int n) {
        
        list.addLast(n);
    }
    private static Integer dequeue(LinkedList<Integer> list) {
        list.removeLast();
        return list.removeLast();

        
    }
}
