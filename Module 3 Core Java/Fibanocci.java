import java.util.Scanner;
public class Fibanocci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int ans=fibonacci(n);
        System.out.println("Fibonacci of "+n+"th term is "+ans);
        sc.close();
    }
    public static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
