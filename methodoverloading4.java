public class methodoverloading4 {
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(String a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(String a, String b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(String a, String b, String c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!"); 
    }

    // static void change(int a){
    //     a = 98;
    // }

    // static void change2(int [] arr){
    //     arr[0] = 98;
    // }
    // static void tellJoke(){
    //     System.out.println("I invented a new word!\n" +
    //             "Plagiarism!");
    // }

    public static void main(String[] args) {
        // tellJoke();

        // Case 1: Changing the Integer
        //int x = 45;
        //change(x);
        //System.out.println("The value of x after running change is: " + x);

        // Case 1: Changing the Array
        // int [] marks = {52, 73, 77, 89, 98, 94};
        // change2(marks);
        // System.out.println("The value of x after running change is: " + marks[0]);


        // Method Overloading
        foo();
        foo("arpit");
        foo("arav","tanishq");
        foo("palak","tanya","tulika");
        // Arguments are actual!


    }
}
