public class NonStaticDemo2 {
    String showMessage(String txt1) {
        return txt1;
    }

    public static void main(String[] args) {

        NonStaticDemo2 nonStaticDemo2 = new NonStaticDemo2();
        String result = nonStaticDemo2.showMessage("hello world");  // by object creation
        System.out.println(result);
    }
}
