import java.util.Scanner;
public class personal_favourite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // problem 1
        // for (int i = 0; i<=n; i++){
        //     if(i % 2 == 0){
        //         System.out.println(i);
        //     }
        // }
        // problem 2
        // for(int i = 0; i <= n; i++){
        //     System.out.println("Apna College");
        // }
        // problem 3
        int input;


        do {
           int marks = sc.nextInt();
           if(marks >= 90 && marks <= 100) {
               System.out.println("This is Good");
           } else if(marks >= 60 && marks <= 89) {
               System.out.println("This is also Good");
           } else if(marks >= 0 && marks <= 59) {
               System.out.println("This is Good as well");
           } else {
               System.out.println("Invalid");
           }


           System.out.println("Want to continue ? (yes(1) or no(0))");
           input = sc.nextInt();
      
       } while(input == 1);
   }   
}

    

