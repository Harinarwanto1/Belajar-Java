public class MethodOverloading {
    public static void main(String[] args) {

    sayHello();
    sayHello("Hari");
    sayHello("Hari", "Narwanto");

    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println( "Hello " + name);
    }

    static void sayHello(String firstname, String lastname){
        System.out.println("Hello " + firstname + lastname);
    }
}
