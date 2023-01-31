public class methodoverloading2 {
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    public static void main(String[] args) {
        //case 1 = changing the integer
        // int x = 45;
        // change(x);
        // System.out.println(x);
        // case 2 = changing the array
        int [] marks = {52, 73, 77, 89, 98, 94};
        change2(marks);
        System.out.println(marks[0]);

    }
}
