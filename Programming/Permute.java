import java.util.*;

class Permute {
    static HashSet<List<Integer>> info;
    private static void swap(Integer[] input, int a, int b) {
        Integer tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    public static void printAllRecursive(int n, Integer[] elements) {
        if (n == 1) {
            info.add(List.of(elements));
        } else {
            for (int i = 0; i < n - 1; i++) {
                printAllRecursive(n - 1, elements);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            printAllRecursive(n - 1, elements);
        }
    }

    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3 };
        printAllRecursive(array.length, array);
        Iterator<List<Integer>> value = info.iterator(); 

        // Displaying the values after iterating through the set 
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.println(value);
            value.next(); 
        } 
    }
}