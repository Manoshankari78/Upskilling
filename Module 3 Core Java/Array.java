import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<String> students=new ArrayList<>();
        while(true){
            System.out.print("Enter student name(or 'exit' to stop): ");
            String name=sc.nextLine();
            if(name.equalsIgnoreCase("exit")) break;
            students.add(name);
        }
        System.out.println("Student names entered:");
        for(String student : students){
            System.out.println(student);
        }
        sc.close();

    }
}