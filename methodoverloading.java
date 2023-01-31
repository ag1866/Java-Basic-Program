public class methodoverloading {
    int sum(int a,int b){
        return a*b;

    }
    double sum(double a,double b){
        return a*b;
    }
    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        int c = obj.sum(5,4);
        double d = obj.sum(5.1,4.2);
        System.out.println(c);
        System.out.println(d);
        
    }
}
