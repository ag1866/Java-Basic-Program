public class array_practice_program {
    public static void main(String[] args) {
       float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
       float sum = 0;
       for(float element:marks){
        sum = sum + element;

       }
       System.out.println(sum); 
    }
}
