
//if the methods hava same name but different signature then those methods are called overloaded method where the signatures can differ by
//i no of input parameter
//ii type of input parameter
//iii mixture of both
public class MethodOverloadingDemo {
    public int add(int x,int y){
         return x+y;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodOverloadingDemo methodOverloadingDemo=new MethodOverloadingDemo();
        int result= methodOverloadingDemo.add(30,50);   // add method with two integer parameters
        int result1= methodOverloadingDemo.add(70,80,90);   // add method with three integer parameters
        System.out.println(result);
        System.out.println(result1);

    }

}
