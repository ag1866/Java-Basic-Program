public class practice_20_program {
    public static void main(String[] args) {
        float [] marks = {45.7f, 87.5f, 34.9f, 12.5f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;

        }
        System.out.println(sum/marks.length);
    }
    
}
