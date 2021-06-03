import java.io.*;
import java.util.*;

public class Farm {
    static int[][] matrix;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int numOfDays = Integer.parseInt(br.readLine());
        String[] temp;
        matrix = new int[12][7];
        for (int i = 0; i < 12; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = Integer.parseInt(temp[j]);
            }
        }
    }

    static class FShape implements Comparable<FShape> {
        int id;
        int lastDate;
    
        FShape(int id, int lastDate) {
            this.id = id;
            this.lastDate = lastDate;
        }
    
        FShape(int id) {
            this.id = id;
            this.lastDate = 0;
        }
    
        public int getReward(int curDate) {
            return matrix[id][min((curDate - lastDate), 7)];
        }
    
        public int min(int i, int j) {
            if (i < j) {
                return i;
            }
            return j;
        }

        @Override
        public int compareTo(Farm.FShape o) {
            return this.getReward(curDate) - o.getReward(curDate);
        }
    }
}

