public class SquidTester {
    public static void main(String[] args) {
        Squid larry = new Squid();

        System.out.println(larry.getTentacleCount());

        System.out.println(larry.toString());


        String s1 = "hello";
        String s2 = "h";
        String s3 = s2 + "ello";

        System.out.println(s1 == s3);

        // == is comparing the "id", in other words the "reference address"
        // == does not compare content.

        // if you want to compare content
        System.out.println(s1.equals(s3));


        // math Functions

        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(9, 25));
        System.out.println(Math.min(9, 29));
        System.out.println(Math.abs(-9));
    }
}
