import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1=sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2=sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator=sc.next().charAt(0);
        double ans=0;
        boolean valid=true;
        switch(operator){
            case'+':
                ans=num1+num2;
                break;
            case'-':
                ans=num1-num2;
                break;
            case'*':
                ans=num1*num2;
                break;
            case '/':
                ans=num1/num2;
                break;
            default:
                System.out.println("Invalid operator!");
                valid=false;
        }
        if(valid){
            System.out.println("Result: "+ans);
        }
    }
}