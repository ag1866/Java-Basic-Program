public class practice_09_program {
    static void multiplication(int n){
        for (int i=1; i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i, n*i);
        }
    }
    public static void main(String[] args) {
        // problem 1
        multiplication(7);
    }
}
