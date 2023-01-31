import java.util.Scanner;
public class practice_02_program {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
        float b = sc.nextFloat();
        System.out.println("Enter number 3");
        float c = sc.nextFloat();
        float cgpa = (a + b + c)/30;
        System.out.println(cgpa);
    }



}
