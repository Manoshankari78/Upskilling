import java.io.*;
import java.util.*;
public class FileWrite{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a text to write to the file: ");
        String text=sc.nextLine();
        try(FileWriter writer=new FileWriter("output.txt")){
            writer.write(text);
            System.out.println("Text written to file successfully.");
        }
        catch(IOException e){
            System.out.println("An error occurred while writing to the file: "+e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
