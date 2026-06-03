public class Pattern{
    public static void main(String[] args){
        checkType("Hello");
        checkType(123);
        checkType(3.14);
        checkType(true);
        checkType(null);
    }
    public static void checkType(Object obj){
        String ans=switch(obj){
            case String s->"It's a String: "+s;
            case Integer i->"It's an Integer: "+i;
            case Double d->"It's a Double: "+d;
            case Boolean b->"It's a Boolean: "+b;
            case null->"It's null";
            default->"Unknown type";
        };
        System.out.println(ans);
    }
}
