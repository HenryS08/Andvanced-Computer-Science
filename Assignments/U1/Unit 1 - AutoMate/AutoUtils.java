public class AutoUtils {

    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel <= 0) {
            cleanlinessLevel = 0;
        } else if (cleanlinessLevel >= 10) {
            cleanlinessLevel = 10;
        }
        return cleanlinessLevel;
    }

    public static String generateUsername(String name) {
        return "@" + name.substring(0, name.indexOf(" ")).toLowerCase() + "_"
                + name.substring(name.indexOf(" ") + 1).toLowerCase() + "_" + (int) (Math.random() * 100 + 1950);
    }

    public static int cleanCar(Car car) {
        car.setCleanlinessLevel(car.getCleanlinessLevel() + 2);
        return car.getCleanlinessLevel() + 2;
    }

    public static String fixName(String ownerName) {
        String trimName = ownerName.trim();
        String first = trimName.substring(0, trimName.indexOf(" "));
        String last = trimName.substring(trimName.indexOf(" ")).trim();
        return first + " " + last;
    }
}
