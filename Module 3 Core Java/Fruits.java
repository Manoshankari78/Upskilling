import java.util.*;
public class Fruits{
    public static void main(String[] args){
        List<String>fruits=new ArrayList<>();
        fruits.add("Strewberry");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        System.out.println("Original List: "+fruits);
        Collections.sort(fruits,
            (s1,s2)->s1.compareTo(s2)
        );
        System.out.println("Sorted List: "+fruits);
        Collections.sort(fruits,
            (s1,s2)->Integer.compare(s1.length(), s2.length())
        );
        System.out.println("Sorted by Length: "+fruits);
    }
}