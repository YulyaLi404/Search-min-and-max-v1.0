package Search;

import java.util.ArrayList;

/**
 * Created by Crow on 02.11.2016.
 * Search for the min and max numbers.
 */

class ArrayUtils {

    static int min(ArrayList<Integer> array){

        int minimum = array.get(1);

        for (Integer anArray : array) {

            if (minimum > anArray) {
                minimum = anArray;
            }
        }
        return minimum;
    }

    static int max(ArrayList<Integer> array){

        int maximum = array.get(1);

        for (Integer anArray : array) {

            if (maximum < anArray) {
                maximum = anArray;
            }
        }
        return maximum;
    }
    
    // Вывод массива в обратном порядке
    static int[] reverse(int[] num) { 
        
       for (int i = 0; num.length/2 > i; i++) { //меняем местами половины массива (/2)
           int tmp = num[i];
           num[i] = num[num.length - i - 1]; // если убрать эту строчку, то массив отобразит зеркально только первую часть массива.
           num[num.length - i - 1] = tmp; // если убрать эту строчку, то массив отобразит зеркально только вторую часть массива.
        }
        return num;
    }
    
     // Рассчитать и возратить сумму
   static int addition(int a, int b){
       return a + b;
   }
}
