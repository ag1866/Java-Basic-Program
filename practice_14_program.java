public class practice_14_program {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Harry" );
        System.out.println(letter);
    }
}
