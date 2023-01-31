public class practice_19_program {
    public static void main(String[] args) {
        int [] marks = {78, 89, 90, 23, 45};
        int num = 76;
        boolean isInArray = false;
        //  isme apn ne boolean is in array false isliye liya taki 
        // kyuki apn ne use by default false krdiya h ab agr 
        // true hona h to use apne ap ko proof krna pdega
        for(int element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }

    }
    
}
