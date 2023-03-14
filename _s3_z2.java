import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное,
// максимальное и среднее ариф. из этого списка.

public class _s3_z2 {
    public static void main(String[] args) {
    Random  rdm = new Random();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    for (int i = 0; i < 5; i++){
        list1.add(rdm.nextInt(1, 10));
    }
    System.out.println("Целочисленный список: " + list1);

    list1.sort(Comparator.naturalOrder());
    // System.out.println(list1);
    
    int min_num = list1.get(0);
    int max_num = list1.get(list1.size()-1);
    
    System.out.println("Минимальное число в списке: " + min_num);
    System.out.println("Максимальное число в списке: " + max_num);

    int sum = 0;

    for (int i = 1; i < list1.size(); i++){
        sum = sum + list1.get(i);
        }
    
    System.out.println(sum);
    Double size_arr = (double) list1.size();
    Double midle_arifmenic = ((double) sum)/ size_arr;   
    System.out.println("Среднее арифметическое всех чисел в списке: " + midle_arifmenic);
    // System.out.printf("%f",midle_arifmenic);
    }
}
