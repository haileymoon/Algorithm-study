import java.util.Scanner;

/**
 * max_and_index
 */
public class max_and_index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];
        int max = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++){
            int input_num = scanner.nextInt();
            array[i] = input_num;
            if(input_num>max){
                max = input_num;
                count = i+1;
            }
        }
        scanner.close();
        System.out.println(max);
        System.out.println(count);
    }
}