//static method can be called directly using class name & by creating object of the class

public class StaticDemo1 {
    // Static method
    static boolean evenOdd(int num) {
        if (num % 2 == 0) {
            return true;
        } else
            return false;
        }

        public static void main(String[]args){
            boolean isEven = StaticDemo1.evenOdd(45);  //  static method is call by using class name
            System.out.println(isEven);
            StaticDemo1 staticDemo1=new StaticDemo1();       //  object creation of class
           boolean result=staticDemo1.evenOdd(45);      //  static method is call by using object of the class
            System.out.println(result);

        }
    }


