import java.util.Scanner;
/***
   # 10952번
***/
class A_add_B_method5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(x == 0 && y == 0){
                break;
            }
            else{
                System.out.println(x+y);
            }
        }
        scanner.close();
    }
}
