public class Test1 {
    public static void main(String[] args) {
        int x=20;
        int y=30;
        String z="Ankita";
        System.out.println("value 1:"+(x+y+z));  //50Ankita
        System.out.println("value 2:"+(x+z+y));  //20Ankita30
        System.out.println("value 3:"+(z+x+y));  //Ankita2030
        System.out.println("value 4:"+(z+"_"+x+y));  //Ankita_2030
        System.out.println("value 5:"+(z+"_"+x+"_"+y));  //Ankita_20_30
    }
}
