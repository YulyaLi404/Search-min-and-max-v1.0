package Search;

import java.util.ArrayList;

/**
 * Created by Crow on 02.11.2016.
 * Search for the min and max numbers and etc.
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
    
    // Вывод массива в обратном порядке - 1.
    static int[] reverse(int[] num) { 
        
       for (int i = 0; num.length/2 > i; i++) { //меняем местами половины массива (/2)
           int tmp = num[i];
           num[i] = num[num.length - i - 1]; // если убрать эту строчку, то массив отобразит зеркально только первую часть массива.
           num[num.length - i - 1] = tmp; // если убрать эту строчку, то массив отобразит зеркально только вторую часть массива.
        }
        return num;
    }
    
    // Вывод массива в обратном порядке - 2.
    static int[] reverse2 (int[] num){

       for (int i = 1; i < num.length; i++){
           int t = num[i];
           num[i] = t;
       }
       //System.arraycopy(num, 1, num, 1, num.length - 1); - 'ide' идентично коду выше.
       return num;
   }
    
     // Рассчитать и возратить сумму
   static int addition(int a, int b){
       return a + b;
   }
    
    static int max1(int[] array1) {

        int max = array1[0];

        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }
        /*  for (int anArray1 : array1) {
            if (max < anArray1) {
                max = anArray1;
            }
        } */

        return max;
    }

    static int min1(int[] array2) {

        int min = array2[0];

        for (int i = 0; i < array2.length; i++) {

            if (min > array2[i]) {
                min = array2[i];
            }
        }

        /*  for (int anArray2 : array2) {

            if (min > anArray2) {
                min = anArray2;
            }
        } */
        
        return min;
    }
}
