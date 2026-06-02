import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        String str=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(reverse(str)) System.out.println(s+" is a palindrome.");
        else System.out.println(s+" is not a palindrome.");
        sc.close();
    }
    public static boolean reverse(String str){
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
