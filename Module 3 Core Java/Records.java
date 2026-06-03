import java.util.*;
import java.util.stream.Collectors;
record Person(String name, int age){}
public class Records{
    public static void main(String[] args){
        Person p1=new Person("Mano",22);
        Person p2=new Person("Sai",20);
        System.out.println("Person 1: "+p1);
        System.out.println("Person 2: "+p2);
        System.out.println();
        List<Person> people=Arrays.asList(
            new Person("Alice",30),
            new Person("Bob",25),
            new Person("Charlie",35),
            new Person("Mano",17),
            new Person("Bharath",15)
        );
        System.out.println("List of People: "+people);
        List<Person> adults=people.stream().filter(p->p.age()>=18).collect(Collectors.toList());
        System.out.println("Adults: "+adults);
    }
}