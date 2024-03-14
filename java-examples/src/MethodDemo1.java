public class MethodDemo1 {
    static float myMethod(float x, float y)
    {
      return x-y;
    }

    public static void main(String[] args) {
        MethodDemo1 sub= new MethodDemo1();
        float result=sub.myMethod(56.7F,45.9F);
        System.out.println(result);

    }
}
