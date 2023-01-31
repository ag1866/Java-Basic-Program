import java.util.Scanner;
public class practice_program_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>18){
            System.out.println("You are adult");
        }else{
            System.out.println("You are teen");
        }
    }
}
