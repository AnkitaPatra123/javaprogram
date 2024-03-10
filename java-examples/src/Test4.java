//wap to check whether character is vowel or consonant using switch case
public class Test4 {
    public static void main(String[] args) {
        char ch='r';
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch+" " +"is a vowel");
                break;
            default:
                System.out.println(ch+" "+ "is a consonant");
        }
    }
}
