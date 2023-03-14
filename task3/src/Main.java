import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Main {
    public static void main(String[] args) {
        int maxNum = 100;
        int maxCount = 19;
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < maxCount; i++){
            al.add(rand.nextInt(0, maxNum));
        };
        System.out.println(al);
        double sum = 0;
        for(int i=0;i<al.size();i++) {
            sum+=al.get(i);
        }
        System.out.printf("mean = %f \n",sum/al.size());
        int min = Collections.min(al);
        int max = Collections.max(al);
        System.out.printf("min = %d \n",min);
        System.out.printf("max = %d",max);
    }
}