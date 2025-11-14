public class CatTester {
    public static void main(String[] args) {
        Cat cat = new Cat("name", "ownerName", 5, "1000");

        // testing setters
        cat.setName("name1");
        cat.setOwnerName("ownerName1");
        cat.setMoodLevel(1);
        cat.setCatId("1001");
        cat.setCatChar(PurrfectUtils.generateCatChar(cat.getCatId()));
        cat.setHungry(true);
        System.out.println(cat.toString());

        // testing equals()
        Cat cat1 = new Cat("name1", "ownerName1", 1, "1001");
        System.out.println(cat.equals(cat1));

        // testing bootUp()
        PurrfectUtils.bootUp(cat);

        // testing pet()
        PurrfectUtils.pet(cat);

        // testing trimClaws()
        for (int i = 0; i == 4; i++) {
            PurrfectUtils.trimClaws(cat);
        }
    }
}
