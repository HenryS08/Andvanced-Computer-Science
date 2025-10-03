public class Utils {
    public static int generateRandomNumber (int low, int high) {
        return (int)Math.random() * (high - low) + low;
    }
}
