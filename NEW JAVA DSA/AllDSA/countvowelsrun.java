// Count howmany times lowercase vowels occurred in a String entered by the user 

import java.util.Scanner;

public class countvowelsrun {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the name");
      String str=sc.next();
      int count=0;
      for (int i = 0; i <str.length(); i++) {
             char ch=str.charAt(i);
             if (ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u') {
                count++;
             }
        }
    System.out.println(count);
    sc.close();
      }
      
   } 

