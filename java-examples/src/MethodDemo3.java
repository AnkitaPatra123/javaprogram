public class MethodDemo3 {
    public static void main(String[] args) {
       double result= MethodDemo3.twoDecimal(81.22999999999999) ;
        System.out.println(result);
    }
    static double twoDecimal(double x) {
        String result1= String.format("%.2f", x);
         double value=Double.parseDouble(result1);
         return value;
    }
}

