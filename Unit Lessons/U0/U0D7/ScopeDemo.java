public class ScopeDemo {
    private String worlde = "World";

    public static void main(String[] args) {
        
    }


    public String method2() {
        String hello = "Hello";
        String goodbye = "";
        if (true) {
            goodbye = "Goodbye";
        }

        System.out.println(goodbye);

        return goodbye;
    }

    public String method1() {
        String hello = String.method2() + world;
    }
}
