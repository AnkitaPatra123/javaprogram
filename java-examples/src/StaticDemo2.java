public class StaticDemo2 {
    static String showMessage(String txt1){
        return txt1;
    }
    public static void main(String[] args) {

    StaticDemo2 staticDemo2  = new StaticDemo2();
   String result=staticDemo2.showMessage("hello world");  // by object creation
        System.out.println(result);

        String msg=StaticDemo2.showMessage("hello world");
        System.out.println(msg);

}
}

