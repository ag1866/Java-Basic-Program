import java.util.Scanner;
public class practice_problem_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        for (int i = 1; i<11; i++){
            System.out.println(a+" * "+i+ " = "+ i * a);
        }
    }
}
