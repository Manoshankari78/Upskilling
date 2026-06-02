import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
public class CustomException{
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("Invalid age: "+age+". Age must be 18 or above. ");
        else
            System.out.println("Valid age: "+age);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter your age: ");
            int age=sc.nextInt();
            checkAge(age);
        }catch(InvalidAgeException e){
            System.out.println("Error: "+e.getMessage());
        }finally{
            sc.close();
        }
    }
}