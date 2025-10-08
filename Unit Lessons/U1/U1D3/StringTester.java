public class StringTester {

    public static void main(String[] args) {
        // strings are objects
        String fullName = "Henry";
        String fullName2 = "Henry";
                System.out.println(fullName == fullName2);
        fullName2 = "Henry West Schneider";
        String fullName3 = new String("Henry");

        // fullName3 = ":)";

        //strings are immutable

        System.out.println(fullName == fullName3);
        System.out.println(fullName.equals(fullName3));

        System.out.println(fullName.charAt(3));

        System.out.println(fullName.indexOf("n"));

        System.out.println(fullName.indexOf("n"));



        int firstSpace = fullName2.indexOf(" ");

        String middleLastName = fullName2.substring(firstSpace);

        System.out.println(middleLastName.indexOf("s"));

        String middleName = fullName2.substring(6, 10);

        System.out.println(middleName);


        String abc = "abc";
        String def = "def";
        String abd = "abd";

        System.out.println(abc.compareTo(abd));


    }
}
