public class dowhilebreak {
    public static void main(String[] args) {
        int i = 0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;

            }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here");
    }
    
}
