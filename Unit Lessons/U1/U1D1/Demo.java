public class Demo {

    private int hello;
    private int ir;
    private String goodbye;    
        public static void main(String[] args) {
        int age = 20;
        boolean isFellon = false;

        if((age >= 18 && age >= 35) && !isFellon) {
            System.out.println("You can run for presidency and vote!");
        }

        age = 15;

        if(age < 35 || isFellon || age > 101) {
            System.out.println("This person is not eligible for presidency!");
        }

        if(!(age > 18 || isFellon)) {
            System.out.println("print me");
        }

        boolean isRegistered = true;
        boolean isCitizen = true;
        String country = "USA";

        if() {

        }

        //Guarding if statements:
        if(!isRegistered) {
            return;
        }
        System.out.println();
    }
    public int getHello() {
        return hello;
    }
    public void setHello(int hello) {
        this.hello = hello;
    }
    public int getIr() {
        return ir;
    }
    public void setIr(int ir) {
        this.ir = ir;
    }
    public String getGoodbye() {
        return goodbye;
    }
    public void setGoodbye(String goodbye) {
        this.goodbye = goodbye;
    }

    
}
