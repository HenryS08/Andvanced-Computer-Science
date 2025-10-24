public class DogTester {
    public static void main(String[] args) {
        Dog dog = new Dog("dog", "ownerName", 1, 123);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("dog2", "ownerName2", 2, 693);
        System.out.println(dog.getName()); // testing getters
        System.out.println(dog1.getOwnerName());
        System.out.println(dog2.getAge());
        System.out.println(dog.getDogId());
        System.out.println(dog.getDogChar());
        System.out.println(dog.getDogTag());
        System.out.println(dog.getStillInFacility());

        // testing setters
        dog.setName("newName");
        System.out.println(dog.getName());
        dog.setOwnerName("newOwnerName");
        System.out.println(dog.getOwnerName());

        // testing methods
        System.out.println(PawesomeUtils.generateDogTag(dog.getDogId(), dog.getDogChar()));
        System.out.println(PawesomeUtils.generateDogTag(dog1.getDogId(), dog1.getDogChar()));
        System.out.println(PawesomeUtils.generateDogTag(dog2.getDogId(), dog2.getDogChar()));
        System.out.println(dog.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        dog.setStillInFacility(false);
        System.out.println(dog.getStillInFacility());

        // testing static methods
        System.out.println(PawesomeUtils.validateDogId(100));
        System.out.println(PawesomeUtils.validateDogId(99));
        System.out.println(PawesomeUtils.validateDogId(1000));

        System.out.println(PawesomeUtils.validateDogTag(dog));
        System.out.println(PawesomeUtils.validateDogTag(dog1));
        System.out.println(PawesomeUtils.validateDogTag(dog2));

        // Test edge cases with validateDogTag():
        dog.setDogId(500);
        System.out.println(PawesomeUtils.validateDogTag(dog));

        // testing age methods
        Dog dog3 = new Dog("dog3", "ownerName3", 1, 111);
        Dog dog4 = new Dog("dog4", "ownerName4", 2, 112);
        Dog dog5 = new Dog("dog5", "ownerName5", 5, 113);
        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog3));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog4));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog5));
        System.out.println(PawesomeUtils.convertAgeToDogYears(10));
        System.out.println(PawesomeUtils.convertAgeToDogYears(20));
        System.out.println(PawesomeUtils.convertAgeToDogYears(30));
        System.out.println(PawesomeUtils.convertAgeToDogYears(40));
        System.out.println(PawesomeUtils.convertAgeToDogYears(50));


    }
}

