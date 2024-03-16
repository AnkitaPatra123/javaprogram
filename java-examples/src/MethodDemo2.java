public class MethodDemo2 {
    static String StringConcat(String txt1, String txt2 ) {
        return txt1.concat(txt2);
    }

        public static void main(String[]args){

            MethodDemo2 concat= new MethodDemo2();
            String result=concat.StringConcat("hello","world");
            System.out.println(result);

        }
    }

