import java.util.Scanner;
public class homework_problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        switch(a){
            case 1 : System.out.println("January");
            break;
            case 2 : System.out.println("februray");
            break;
            case 3 : System.out.println("march");
            break;
            case 4 : System.out.println("april");
            break;
            case 5 : System.out.println("may");
            break;
            case 6 : System.out.println("June");
            break;
            case 7 : System.out.println("July");
            break;
            case 8 : System.out.println("august");
            break;
            case 9 : System.out.println("september");
            break;
            case 10 : System.out.println("october");
            break;
            case 11 : System.out.println("november");
            break;
            case 12 : System.out.println("december");
            break;
            default : System.out.println("You are out of range");
            
            
        }
    }
}
