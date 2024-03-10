package org.StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        String str="ankita"; // string creation using string literal
        System.out.println(str);
        String str1=new String("lipsa"); // string creation using string new keyword
        System.out.println(str1);
        String str2=str+"_"+str1;
        System.out.println(str2); // ankita_lipsa

    }

}
