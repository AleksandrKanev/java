package home_work_2;
// Дана строка (получение через обычный текстовый файл!!!)

import java.io.*;

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
public class hw_2 {
    public static void main(String[] args) {
       File file = new File ("1.txt"); 
       String txt = new String();
        try{
            BufferedReader f = new BufferedReader(new FileReader(file));
            String s;
            while((s=f.readLine())!=null){
                txt+=s + " ";
            }
            f.close();
            
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        txt = txt.replace("\"", "");
        String[] ls = txt.split(" ");
        bild_str(ls);
        
    }
    static void bild_str(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            String[] arr_new = arr[i].split(",");
            for (int j = 0; j < arr_new.length; j++) {
                if(j == 0)
                    sb.append("Студент " + arr_new[j].substring(8));
                if(j == 1)
                    sb.append(" получил " + arr_new[j].substring(7));
                if(j == 2)
                    sb.append(" по предмету " + arr_new[j].substring(8));
            }
            System.out.println(sb);
        }
    }

}
