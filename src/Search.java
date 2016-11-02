package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Crow on 02.11.2016.
 * Search for the min and max numbers.
 */
public class Search extends ArrayUtils{

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> array = new ArrayList<>();
        
        String line = "-----------------------------------";

        System.out.println("Search for the min and max numbers.\n" + line);
        
        try {

            for (int i = 0; i < 100; i++) {

                array.add(Integer.parseInt(reader.readLine()));
            }

        } catch (NumberFormatException ignored){}

        int maximum = max(array);
        int minimum = min(array);

        System.out.println(line +"\n" + "Maximum: "+ maximum + "\n" + "Minimum: " + minimum);
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

*/
