package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Crow on 02.11.2016.
 * Search for the min and max numbers.
 */
public class Search {

    private static final String line = "-----------------------------------";
    
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Search for the min and max numbers.\n" + line);
        
        try {

            for (int i = 0; i < 100; i++) {

                array.add(Integer.parseInt(reader.readLine()));
            }

        } catch (NumberFormatException ignored){}

        int maximum = ArrayUtils.max(array);
        int minimum = ArrayUtils.min(array);

        System.out.println(line + "\nMaximum: "+ maximum);
        System.out.println("Minimum: " + minimum);
        
        System.out.println(Arrays.toString(ArrayUtils.revers()));
    }
}

/* Output:
Search for the min and max numbers.
-----------------------------------
45666
34555
2334
-234
-2334
0

-----------------------------------
Maximum: 45666
Minimum: -2334

10
9
8
7
6
5
4
3
2
1
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

*/
