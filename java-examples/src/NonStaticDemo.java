
//Non-static method can be only call by using object of the class
public class NonStaticDemo {
    // NonStatic method
        boolean evenOdd(int num) {
        if (num % 2 == 0) {
            return true;
        } else
            return false;
    }
       public static void main(String[]args){
        NonStaticDemo nonStaticDemo=new NonStaticDemo();       //  object creation of class
        boolean result=nonStaticDemo.evenOdd(45);      //  Non-static method is call by using object of the class
        System.out.println(result);

    }
    }



