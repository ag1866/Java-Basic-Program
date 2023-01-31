import java.util.Scanner;
public class factorialofanumberusingfunction {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // int x = 12;
        System.out.println(factorial(x));
    }
}
