package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Crow on 02.11.2016.
 *
 */
public class Search extends ArrayUtils{


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> array = new ArrayList<>();

        try {

            for (int i = 0; i < 100; i++) {

                array.add(Integer.parseInt(reader.readLine()));
            }

        } catch (NumberFormatException ignored){}

        int maximum = max(array);
        int minimum = min(array);

        System.out.println("Maximum: "+ maximum + "\n" + "Minimum: " + minimum);
    }
}
