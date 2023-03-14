import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, 
// удалить из него чётные числа


public class _s3_z1 {
    public static void main(String[] args) {
        Random  rdm = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            list1.add(rdm.nextInt(1, 20));
        }
        System.out.println(list1);

        for (int i = list1.size()-1; i >= 0; i--){
            if (list1.get(i) % 2==0){
                list1.remove(i);
            }
        }
        
        System.out.print(list1);
    }
}