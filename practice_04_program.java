import java.util.Scanner;
public class practice_04_program {
    public static void main(String[] args) 
    {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance with kilometer");
        double a = sc.nextDouble();
        double b = a*0.621371D;
        System.out.println(b);

    }
}

