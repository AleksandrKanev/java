package home_work_4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        while (true) {
            
            System.out.println(
                    "1 - помеместить элемент в конец очереди\n2 - вернуть первый элемент из очереди и удалить его;\n3 - вернуть первый элемент из очереди, не удаляя;\n4 - Закрыть программу.\nВыберите действие:");
            int n = Integer.parseInt(sc.next());
            if (n == 1) {
                System.out.print("Ведите элемент: ");
                enqueue(list, sc.next());
                System.out.println(list);
                
            }
            if (n == 2) {
                dequeue(list);
                
            }
            if (n == 3) {
                first(list);
                
            } 
            if(n == 4){
                sc.close();
                break;
            }
            
            
        }
        
    }

    private static void enqueue(LinkedList<String> list, String txt) {
        list.addLast(txt);
    }

    private static void dequeue(LinkedList<String> list) {
        System.out.println(list.removeFirst());
        
    }

    private static void first(LinkedList<String> list) {
        System.out.println(list.getFirst()); 
    }
}
