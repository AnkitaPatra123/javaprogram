package org.StringDemo;
//wap to find out all the vowels in a given string
public class StringDemo2 {
    public static void main(String[] args) {
        String txt="cuttack";
        for(int i=0; i<txt.length(); i++) {
                          if(txt.charAt(i) == 'a'||
                            txt.charAt(i) == 'e'||
                            txt.charAt(i) == 'i' ||
                           txt.charAt(i) == 'o' ||
                            txt.charAt(i) == 'u')

                System.out.println("Given string contains " +
                        txt.charAt(i)+" at the index " + i);
        }
    }
}
