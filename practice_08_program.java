import java.util.Scanner;
public class practice_08_program {
    public static void main(String[] args) {
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in mathematics");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3)/3.0f;
        if(avg>=40 && m1>=33 && m3>=33){
            System.out.println("congratulation, you have been promoted");

        }
        else{
            System.out.println("Sorry, You have not been promoted");
        }
        
    }
}
    