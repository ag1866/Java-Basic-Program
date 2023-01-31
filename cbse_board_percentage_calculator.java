import java.util.Scanner;

public class cbse_board_percentage_calculator {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking input from user");
        
        System.out.println("Enter physics marks");
        int physics = sc.nextInt();
        
        System.out.println("Enter English marks");
        int English = sc.nextInt();
        System.out.println("Enter Chemistry marks");
        int Chemistry = sc.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        int mathematics = sc.nextInt();
        System.out.println("Enter your Computer Science marks : ");
        int computer = sc.nextInt();

        float percentage = ((physics + English + Chemistry + mathematics + computer)/500.0f)*100;
        System.out.println("percentage : ");
        System.out.println(percentage);
        
        
        
        
    }


    
}
