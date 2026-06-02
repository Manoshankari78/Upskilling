import java.util.Scanner;
public class Try{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter a number:");
            int n=sc.nextInt();
            System.out.print("Enter a number:");
            int m=sc.nextInt();
            System.out.println("Result: "+(n/m));
        }
        catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by Zero. Please enter a non-zero number.");
        }
        finally{
            sc.close();
        }
    }
}
