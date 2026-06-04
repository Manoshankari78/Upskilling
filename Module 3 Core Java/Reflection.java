import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
public class Reflection{
    public static class Calculator{
        public void add(int a,int b){
            System.out.println(" ->Execution Result: "+(a+b));
        } 
        private void greet(String name){
            System.out.println(" -> Execution Result: Hello, "+name+"!");
        } 
    }
    public static void main(String[] args){
        try{
            Class<?> claz=Class.forName("Reflection$Calculator");
            System.out.println("Successfully loaded class: \" + claz.getName() + \"\\n");
            Object cal=claz.getDeclaredConstructor().newInstance();
            Method[] methods=claz.getDeclaredMethods();
            for(Method m:methods){
                System.out.println("Method Name: "+m.getName());
                System.out.print("Parameters: ");
                Parameter[] params=m.getParameters();
                if(params.length==0) System.out.println("None");
                else{
                    for(int i=0;i<params.length;i++){
                        System.out.print(params[i].getType().getSimpleName()+" "+params[i].getName());
                        if(i<params.length-1) System.out.print(", ");
                    }
                    System.out.println();
                }
                if(m.getName().equals("add")){
                    m.invoke(cal,10,20);
                }else if(m.getName().equals("greet")){
                    m.setAccessible(true);
                    m.invoke(cal,"Vijay");
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
