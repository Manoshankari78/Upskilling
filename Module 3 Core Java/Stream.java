import java.util.stream.Collectors;
import java.util.*;
public class Stream{
    public static void main(String[] args){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Original List: "+numbers);
        List<Integer> evenNumbers=numbers.stream()
        .filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers: "+evenNumbers);
        System.out.println("Printed using forEach: ");
        numbers.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
    }
}