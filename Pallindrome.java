package TypeCasting;

//Write java code Reverse words in a given string and check its pallindrome or not and take user input.
import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
        String[] arr = new String[5];
        Scanner c = new Scanner(System.in);
         System.out.println("Enter 5 Strings");
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter String "+(i+1));
            arr[i] = c.next();
        }
        for(int i=0;i<arr.length;i++){
            StringBuilder s= new StringBuilder(arr[i]);
            s.reverse();
         if(arr[i].equals(s.toString()))
 {
 System.out.println( " String at position"+ i+" is palindrome ");
 }
         else
         {
           System.out.println( " String at position"+ i+" is not palindrome ");
         }
 }
 }


}
