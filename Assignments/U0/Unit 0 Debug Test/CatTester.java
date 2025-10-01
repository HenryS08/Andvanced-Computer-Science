public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); //2. added 'new' keyword
        Cat otherCat = new Cat("Tiger Beast", "Tabby");
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); //3. added sout

        System.out.println("Are the cat's equal? " + myCat.equals(otherCat)); //4. added 'System.out.' also added space after 'equal?'

        System.out.println("Is my cat hungry? " + myCat.getIsHungry()); //5. added 'System.out.' 6. added'ln'

        String firstName = "Tiger";
        String lastName = "Beast"; //7. '==' -> '='
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}