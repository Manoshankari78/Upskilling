import java.util.Scanner;
import java.util.Random;
public class NumberGuess{
    public static void main(String[] args){
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int n=rand.nextInt(100)+1;
        int g=0;
        while(g!=n){
            System.out.print("Guess a number between 1 and 100: ");
            g=sc.nextInt();
            if(g<n) System.out.println("Too low! Try again.");
            else if(g>n) System.out.println("Too high! Try again.");
            else System.out.println("Congratulations! You guessed the number.");
        }
        sc.close();
    }
}

