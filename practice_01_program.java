import java.util.Scanner;
public class practice_01_program {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter nuber 2");
        int b = sc.nextInt();
        System.out.println("Enter number 3");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("The sum of three number is:" + sum);
    }
}
