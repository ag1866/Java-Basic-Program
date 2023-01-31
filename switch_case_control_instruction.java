import java.util.Scanner;
public class switch_case_control_instruction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        switch(age){ 
            case 18:

            
            

                System.out.println("You are going to become an adult");
                break;
            case 23:
                System.out.println("you are going to join a job");
                break;
            case 68:
                System.out.println("you are going to get retired");
                break;
            default:
            System.out.println("Enjoy your life");

        }


    }


}
