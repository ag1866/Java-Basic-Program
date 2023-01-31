import java.util.Scanner;
public class practice_program_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println("it is equal");
        }else {
            if(a > b){
                System.out.println("a is greater than b");
            }else{
                System.out.println("a is less than b");
            }
        }
        
    }
}
