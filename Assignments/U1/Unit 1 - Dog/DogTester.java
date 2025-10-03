public class DogTester {
    public static void main(String[] args) {
        Dog dog = new Dog("dog", "ownerName", 1, 123);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("dog2", "ownerName2" , 2, 693);

        //testing getters
        System.out.println(dog.getName());
        System.out.println(dog.getOwnerName());
        System.out.println(dog.getAge());
        System.out.println(dog.getDogId());
        System.out.println(dog.getDogChar());
        System.out.println(dog.getDogTag());
        System.out.println(dog.getStillInFacility());

        //testing setters
        System.out.println(setName(newName));
        System.out.println(setOwnerName(newOwnerName)); 

        //testing methods
        System.out.println(dog.generateDogTag());
        System.out.println(dog1.generateDogTag());
        System.out.println(dog2.generateDogTag());
        System.out.println(dog.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        yes = dog.setStillInFacility(false);
        System.out.println(yes);
    }
}

