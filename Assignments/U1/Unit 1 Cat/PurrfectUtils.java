public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() >= 7) {
            return "Currently, " + cat.getName() + " is in a great mood.\n"
                    + "Petting is appreciated.";
        } else if (cat.getMoodLevel() >= 3) {
            return "Currently, " + cat.getName() + " is reminiscing of a past life.\n"
                    + "Petting is appreciated.";
        } else {
            return "Currently, " + cat.getName() + " is plotting revengeance.\n"
                    + "Petting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        return (char) (((catId.charAt(0) + catId.charAt(1) + catId.charAt(2) + catId.charAt(3))
                % 26) + (int) 'A');
    }

    public static int generateRandomNumber(int low, int high) {
        if (low >= high) {
            low = high;
            high = low;
        }
        return (int) (Math.random() * (high - low) + low);
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            return 10;
        } else if (moodLevel > 10) {
            return 10;
        } else {
            return moodLevel;
        }
    }

    public static String validateCatId(String catId) {
        if (Integer.parseInt(catId) >= 1000 && Integer.parseInt(catId) <= 9999) {
            return catId;
        } else {
            return "" + PurrfectUtils.generateRandomNumber(1000, 10000);
        }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2) {
            System.out.println("Petting successful!");
            cat.setMoodLevel(cat.getMoodLevel() + 1);
        } else {
            if (cat.isHungry() == false) {
                cat.setMoodLevel(cat.getMoodLevel() + 1);
                System.out.println("Petting successful!");
            } else {
                cat.setMoodLevel(cat.getMoodLevel() - 1);
                System.out.println("Petting failed...");
            }
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        if (PurrfectUtils.generateRandomNumber(0, 100) >= 50) {
            System.out.println("Cookie did not like that...");
            cat.setMoodLevel(cat.getMoodLevel() - 1);
        } else {
            System.out.println("Cookie really hated that!");
            cat.setMoodLevel(cat.getMoodLevel() - 2);
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Cleaning the litter box...\n" + //
                        "Done! \n" + //
                        "Cookie appreciated that.");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
    }
}
