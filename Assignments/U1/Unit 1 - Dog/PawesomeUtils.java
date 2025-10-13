public class PawesomeUtils {

    public static char generateDogChar(int dogId) {
        return (char) ((int) 'F' + (((dogId % 10) + (dogId / 100) + ((dogId / 10) % 10)) % 10));
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogChar + dogId;
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + dog.getOwnerName() + ".";
        } else {
            return "Wrong owner!";
        }
    }

    public static void checkin(Dog dog, String personName) {
        if (validateDogTag(dog)) {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
            System.out.println("Accepted entry");
        } else {
            System.out.println("Denied entry");
        }

    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return Utils.generateRandomNumber(100, 1000);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        String newDogTag =
                "" + PawesomeUtils.generateDogChar(PawesomeUtils.validateDogId(dog.getDogId()))
                        + PawesomeUtils.validateDogId(dog.getDogId());
        return newDogTag.equals(dog.getDogTag());
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return 15;
        } else if (dog.getAge() == 2) {
            return 24;
        } else {
            return (24 + ((dog.getAge() - 2) * 5));
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears <= 24) {
            return 2;
        } else {
            return (humanYears - 24) / 5 + 2;
        }
    }

}


