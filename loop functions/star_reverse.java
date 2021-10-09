import java.util.Scanner;
/***
 * #2439 번
***/

class star_reverse {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt(); 
    for(int i = 0; i<num; i++){
        for(int x = num-1; x>i; x--){
            System.out.print(" ");
        }
        for(int j = 0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    scanner.close();
    } 
}
