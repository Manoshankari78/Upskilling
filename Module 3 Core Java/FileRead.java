import java.io.*;
public class FileRead{
    public static void main(String[] args){
        try(BufferedReader reader=new BufferedReader(new FileReader("output.txt"))){
            String line;
            System.out.println("Contents of the file:");
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("An error occurred while reading the file: "+e.getMessage());
        }
    }
}