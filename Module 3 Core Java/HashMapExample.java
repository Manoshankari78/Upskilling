import java.util.*;
public class HashMapExample{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Map<Integer,String> students=new HashMap<>();
        while(true){
            System.out.print("Enter student ID (or -1 to stop): ");
            int id=sc.nextInt();
            sc.nextLine(); // Consume newline
            if(id==-1) break;
            System.out.print("Enter student name: ");
            String name=sc.nextLine();
            students.put(id,name);
        }
        System.out.println("Enter Id to search for student name: ");
        int sId=sc.nextInt();
        String sName=students.get(sId);
        System.out.println((sName!=null)?"Student Name :"+sName: "Student not found for the given Id");
        sc.close();
    }
}
