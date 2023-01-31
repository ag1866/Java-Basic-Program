import java.util.Scanner;
public class practice_program_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        // if(a == 1){
        //     System.out.println("Hello");
        // }
        // else if(a == 2){
        //     System.out.println("Namaste");
        // }
        // else if(a == 3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Invalid Button");
        // }
        switch(a){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
            System.out.println("Enjoy your life");
        }
        
    }
}
