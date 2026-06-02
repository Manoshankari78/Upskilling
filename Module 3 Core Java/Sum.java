import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of Array Elements: "+sum);
        System.out.println("Average of Array Elements: "+(sum/n));
        sc.close();
    }
}
