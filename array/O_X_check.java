import java.util.Scanner;

public class O_X_check {
/***
 *  그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 
길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

***/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_test = scanner.nextInt();
        String[] array = new String[number_of_test];
        for(int i = 0; i < number_of_test; i++){
            array[i] = scanner.next();
            int count = 0;
            int sum = 0;
            for(int j = 0; j < array[i].length(); j++){
                if(array[i].charAt(j) == 'O') {
                    ++count;
                    sum += count;
                }
                else count = 0;
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}