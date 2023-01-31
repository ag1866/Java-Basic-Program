import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int a = sc.nextInt();
        if(a>18){
            System.out.println("Yes boy you can drive");
        }
        else{
            System.out.println("No boy you cannot drive");
        }
        
    }
    
}
