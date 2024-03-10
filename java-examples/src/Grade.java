
   import java.util.Scanner;
   public class Grade {
       public static void main(String[]args){

               Scanner input = new Scanner(System.in);
               System.out.println("Enter The Five Subject Marks :");
               //scan and store the number
           int a = input.nextInt();
           int b = input.nextInt();
           int c = input.nextInt();
           int d = input.nextInt();
           int e = input.nextInt();
           int tot =(a+b+c+d+e);

               int avg = tot / 5;

               System.out.println("Total :" + tot);
               System.out.println("average :" + avg);
               if (avg >= 90)
                   System.out.println("Grade O");
               else if (avg >= 80)
                   System.out.println("Grade E");
               else if (avg >= 70)
                   System.out.println("Grade A");
               else if (avg >= 60)
                   System.out.println("Grade B");
               else if (avg >= 40)
                   System.out.println("Grade C");
               else
                   System.out.println("Fail");
           }
       }
