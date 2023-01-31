import java.util.Scanner;
public class practice_16_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a year");
        int a = sc.nextInt();
        if((a%4 == 0) && (a%100 == 0)){
            System.out.println("this is leap year");

        }
        else{
            System.out.println("this is not leap year");
        }

        
    }
}
