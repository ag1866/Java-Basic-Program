import java.util.Scanner;
public class practice_31_program {
    public static int mul(int a, int b){
        int c = a * b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = mul(a, b);
        System.out.println(c);
    }
}