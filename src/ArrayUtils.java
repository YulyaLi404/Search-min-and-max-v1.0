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
}
