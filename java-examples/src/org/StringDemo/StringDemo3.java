//wap to find out index of 'a' in given string
public class StringDemo3 {
    public static void main (String[]args){
        String txt="lipsa patra";
        for(int i=0; i<txt.length(); i++) {
            if(txt.charAt(i) == 'a')

                System.out.println("a is present at the index " + i);

        }
    }
}
