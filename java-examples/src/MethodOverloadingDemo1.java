public class MethodOverloadingDemo1 {
    public double add(double x,double y){
        return x+y;
    }
    public String add(String txt1, String txt2){
        return txt1+txt2;
    }
    public static void main(String[] args) {
        MethodOverloadingDemo1 methodOverloadingDemo1=new MethodOverloadingDemo1();
        double result= methodOverloadingDemo1.add(30.25,50.98);   // add method with double type parameters
        String result1= methodOverloadingDemo1.add("hello","world");   // add method with String type parameters
        System.out.println(result);
        System.out.println(result1);

    }
}
