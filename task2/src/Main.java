//Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int maxNum = 100;
        int maxCount = 19;
        List<Integer> list = GetRandomList(maxNum, maxCount);
        System.out.println(list);
        DeleteEvenNum(list);

        System.out.println(list);
    }
    public static List<Integer> GetRandomList(int maxNum, int maxCount){
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < maxCount; i++){
            list.add(rand.nextInt(0, maxNum));
        };
        return list;
    }

    public static void DeleteEvenNum(List<Integer> list){
       Iterator<Integer> li = list.iterator();
       while(li.hasNext()){
           if(li.next() % 2 == 0){
               li.remove();
           }
       }
    }
}