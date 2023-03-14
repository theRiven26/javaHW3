//Реализовать алгоритм сортировки слиянием

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int maxNum = 100;
        int maxCount = 19;
        int[] array = GetRandomArray(maxNum, maxCount);
        System.out.println(Arrays.toString(array));
        int[] result = SortArray(array);
        System.out.println(Arrays.toString(result));

    }
    public static int[] GetRandomArray(int maxNum, int maxCount){
        Random rand = new Random();
        int[] array = new int[maxCount];
        for(int i = 0; i < maxCount; i++){
            array[i] = rand.nextInt(0, maxNum);
        }
        return array;
    }

    public static int[] SortArray(int[] array){
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }
        int[] arrayCopy1 = new int[array.length/2];
        System.arraycopy(array,0, arrayCopy1,0,arrayCopy1.length);
        int[] arrayCopy2 = new int[array.length - array.length/2];
        System.arraycopy(array,arrayCopy1.length, arrayCopy2,0,arrayCopy2.length);
        arrayCopy1 = SortArray(arrayCopy1);
        arrayCopy2 = SortArray(arrayCopy2);
        return mergeArray(arrayCopy1, arrayCopy2);
    }

    public static int[] mergeArray(int[] array1, int[] array2){
        int[] arrayMerge = new int[array1.length + array2.length];
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < arrayMerge.length; i++){
            if(count1 == array1.length){
                arrayMerge[i] = array2[i - count1];
                count2++;
            } else if (count2 == array2.length) {
                arrayMerge[i] = array1[i - count2];
                count1++;
            } else if (array1[i - count2] < array2[i - count1]) {
                arrayMerge[i] = array1[i - count2];
                count1++;
            }else {
                arrayMerge[i] = array2[i - count1];
                count2++;
            }
        }
        return arrayMerge;

    }
}