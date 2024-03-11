package alt.ArrayDemo;

//wap to find out odd no in an integer array
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] myNum = {25, 30, 49, 50};
        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] % 2 != 0) {
                System.out.println(myNum[i]);

            }
        }
    }
}
