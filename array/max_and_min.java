import java.util.Scanner;
import java.util.Arrays;

/**
 * #10818 번
 */

public class max_and_min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        int max, min;
        
        for (int i = 0; i<= number-1; i++)
        {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        min = array[0];
        max = array[number-1];
        
        System.out.println(min + " " + max);
        scanner.close();
    }
}
