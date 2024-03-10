package org.StringDemo;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name="Ankita Patra";
        String name1="Ankita      ";
        System.out.println("length is:"+name.length());//12
        System.out.println("Uppercase:"+name.toUpperCase());//ANKITA PATRA
        System.out.println("lowercase :"+name.toLowerCase());//ankita patra
        System.out.println("startswith :"+ name.startsWith("Ank"));
        System.out.println("endswith :"+ name.endsWith("ank"));
        System.out.println("charat :"+ name.charAt(2)); //k
        System.out.println("substring :"+ name.substring(0,5));//ankit(start index to last index-1)
        System.out.println("trim:"+name1.trim());//Ankita
        System.out.println("empty:"+name1.isEmpty()); //false(returns boolean value)
        System.out.println("replace:"+name.replace("a","v")); //Ankitv pvtrv
        System.out.println("index:"+name.indexOf('a')); //5(index of the first occurance of the character)

    }
}
