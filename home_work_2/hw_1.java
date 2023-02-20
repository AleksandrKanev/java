package home_work_2;


import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.
public class hw_1 {
    
    public static void main(String[] args) {
        int[] array = {11,36,6,5,7,9,10,1111,13,145};
        sort_array(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort_array(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int buffer = array[i];
                    array[i] = array[j];
                    array[j] = buffer;
                    i = j; 
                    log(array);  
                }
                
            }
        }
        
    }

    static void log(int array[]) {
        String file_name = "home_work_2/Log.txt";
        File file = new File(file_name);
        try{
            FileWriter writer = new FileWriter(file,true);
            writer.write(Arrays.toString(array));
            writer.write("\n");
            writer.close();
        }
        catch (Exception e){
            System.out.println("Что то пошло не так");
        }
    }
}