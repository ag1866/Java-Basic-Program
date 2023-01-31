import java.util.Scanner;
public class practice_30_program {
    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sum(a, b);
        System.out.println("sum of two numbers is : "+c);
    }
}
