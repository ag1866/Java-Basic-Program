public class foreachloop {
    public static void main(String[] args) {
        // int [] marks = {98, 45, 79, 99, 88};
        float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 88.5f};
        System.out.println(marks.length);
        // Displaying the array
        System.out.println(marks[2]);
        String [] students = {"Harry", "Arpit", "Aryan", "Faraz"};
        System.out.println(students.length);
        System.out.println(students[2]);

        // displaing the array using for loop
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("printing using for each loop");
        for(float element: marks){
            System.out.println(element);
        }
    }
    
}
