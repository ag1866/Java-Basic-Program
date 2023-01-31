import java.util.Scanner;
public class practice_15_program {
    public static void main(String[] args) {
        // int a = 10;
        // if (a == 11){
        //     System.out.println("I am 11");
        // }
        // else{
        //     System.out.println("I am not 11");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day ");
        int day = sc.nextInt();
        switch (day){
            case 1:

                System.out.println("today is monday");
                break;
            case 2:
                System.out.println("today is tuesday");
                break;
            case 3:
                System.out.println("today is wednesday");
                break;
            case 4:
                System.out.println("today is thursday");
                break;
            case 5:
                System.out.println("today is friday");
                break;
            case 6:
                System.out.println("today is saturday");
                break;
        


        }




    }
}
