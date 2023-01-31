import java.util.Scanner;
public class homework_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        // first method
        // int sum = a + b;
        // int sub = a - b;
        // int mul = a * b;
        // int div = a / b;
        // int mod = a % b;
        // System.out.println(sum);
        // System.out.println(sub);
        // System.out.println(mul);
        // System.out.println(div);
        // System.out.println(mod);
        int operator = sc.nextInt();
        switch(operator) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : if(b == 0){
                        System.out.println("Invalid Division");
                    } else {
                        System.out.println(a/b);
                    }
            break;
            case 5 : if(b==0){
                        System.out.println("Invalid Division");
                    } else {
                        System.out.println(a%b);
                    }
            break;
            default : System.out.println("Invalid operator");
        }

    }
}
