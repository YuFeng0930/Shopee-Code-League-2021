import java.io.*;
import java.util.*;

public class Noise {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String[] temp = br.readLine().split(" ");
        int numOfEngins = Integer.parseInt(temp[0]); 
        int groups = Integer.parseInt(temp[1]); 
        temp = br.readLine().split(" ");
        int[] factors = new int[numOfEngins];
        for (int i = 0; i < numOfEngins; i++) {
            factors[i] = Integer.parseInt(temp[i]);
        }

}
