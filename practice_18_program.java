import javax.lang.model.util.Elements;

public class practice_18_program {
    public static void main(String[] args) {
        float[] marks = {20.0f , 45.7f , 67.8f , 87.3f , 65.2f};
        float sum = 0;
        for (float element : marks){
            sum = sum + element;
            // displaying the array after addition
            System.out.println(element);

        }
        //  displaying the array after addition
        System.out.println(sum);
        
    }
}
