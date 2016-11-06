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
            System.out.println("Enter numbers: ");
            
            for (int i = 0; i < 100; i++) {

                array.add(Integer.parseInt(reader.readLine()));
            }

        } catch (NumberFormatException ignored){}

        int maximum = ArrayUtils.max(array);
        int minimum = ArrayUtils.min(array);

        System.out.println(line + "\nMaximum: "+ maximum);
        System.out.println("Minimum: " + minimum);
        
        System.out.println(line + "\n" + "The output of the array in reverse order.");
        int[] arr = {1, 4, 0, 5, 4, 0, 5, 4};
        arr = ArrayUtils.reverse(arr);

        System.out.println(line + "\n" + Arrays.toString(arr));

        System.out.println(line + "\n" + "The sum of the two numbers.");
        System.out.println("Enter 2 numbers: ");

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        // Получаем сумму двух переменных
        int sum = ArrayUtils.addition(a, b);
        System.out.println(line + "\nSum: " + sum);
    }
}

/* Output:
Search for the min and max numbers.
-----------------------------------
Enter numbers:
45666
34555
2334
-234
-2334
0

-----------------------------------
Maximum: 45666
Minimum: -2334
-----------------------------------
Output of the array in reverse order.
[4, 5, 0, 4, 5, 0, 4, 1]
-----------------------------------
The sum of the two numbers.
-----------------------------------
Enter 2 numbers: 
-1
55
-----------------------------------
Sum: 54

*/
