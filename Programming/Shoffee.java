/**
 * Input: 
 * N (coffee bean flavor), K (expectation)
 * (preference value of each type of beans)
 */

import java.io.*;
import java.util.*;


public class Shoffee {
    static int[] preference;
    static TreeSet<Integer> averages = new TreeSet<>();
    static int counter = 0;
    static int expectation; 
    static int numOfBeans; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String[] temp = br.readLine().split(" ");
        averages = new TreeSet<>();
        
        numOfBeans = Integer.parseInt(temp[0]); 
        expectation = Integer.parseInt(temp[1]); 
        temp = br.readLine().split(" ");
        preference = new int[numOfBeans];
        for (int i = 0; i < numOfBeans; i++) {
            preference[i] = Integer.parseInt(temp[i]);
        }
        compute(numOfBeans - 1);

        pw.println(counter);
        pw.close();
    }

    public static void compute(int n) {
        if (n < 0) {
            return;
        } else {
            counter += averages.tailSet(expectation * (numOfBeans - n) - preference[n]).size();
            compute(n - 1);
            return;
        }
    }

}
