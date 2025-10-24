public class NameOps {
    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }


    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        if (NameOps.indexOfFirstSpace(name) == -1) {
            return -1;
        } else if (NameOps
                .indexOfFirstSpace(name.substring(NameOps.indexOfFirstSpace(name) + 1)) == -1) {
            return -1;
        } else {
            return NameOps.indexOfFirstSpace(name.substring(NameOps.indexOfFirstSpace(name) + 1))
                    + name.substring(0, NameOps.indexOfFirstSpace(name) + 1).length();
        }
    }

    public static String findFirstName(String name) {
        if (NameOps.indexOfFirstSpace(name) != -1) {
            return name.substring(0, NameOps.indexOfFirstSpace(name));
        } else {
            return name;
        }
    }

    public static String findLastName(String name) {
        if (NameOps.indexOfFirstSpace(name) == -1) {
            return "";
        } else if (NameOps.indexOfSecondSpace(name) == -1) {
            return name.substring(NameOps.indexOfFirstSpace(name) + 1);
        } else {
            return name.substring(NameOps.indexOfSecondSpace(name) + 1);
        }
    }

    public static String findMiddleName(String name) {
        if (NameOps.indexOfSecondSpace(name) != -1) {
            return name.substring(NameOps.indexOfFirstSpace(name) + 1,
                    NameOps.indexOfSecondSpace(name));
        } else {
            return "";
        }
    }

    public static String generateLastFirstMidInitial(String name) {
        String nam = "";

        if (NameOps.indexOfFirstSpace(name) == -1) {
            return NameOps.findLastName(name) + NameOps.findFirstName(name);
        } else if (NameOps.indexOfSecondSpace(name) != -1) {
            return NameOps.findLastName(name) + ", " + NameOps.findFirstName(name) + " "
                    + NameOps.findMiddleName(name).charAt(0) + ".";
        } else {
            return NameOps.findLastName(name) + ", " + NameOps.findFirstName(name);
        }
    }
}
