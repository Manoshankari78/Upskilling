class Animal{
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
public class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog barks");
    }
    public static void main(String[] args){
        Animal dog=new Dog();
        dog.makeSound();
    }
}
