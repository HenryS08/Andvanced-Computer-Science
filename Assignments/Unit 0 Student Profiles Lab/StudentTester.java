public class StudentTester {
    public static void main(String[] args) {
        Student henry = new Student("Henry", 11);
        Student max = new Student("Max", 12);
        Student leo = new Student("Leo");
        Student bob = new Student("Bob");

        // print details
        System.out.println(henry.toString());
        System.out.println(max.toString());
        System.out.println(leo.toString());
        System.out.println(bob.toString());

        // change grade
        henry.setGrade(henry.getGrade() + 1);
        max.setGrade(max.getGrade() + 1);
        leo.setGrade(leo.getGrade() + 1);
        bob.setGrade(bob.getGrade() + 1);

        // Output new info
        System.out.println(henry.toString());
        System.out.println(max.toString());
        System.out.println(leo.toString());
        System.out.println(bob.toString());

        // testing equals
        System.out.println(henry.equals(max));
    }
}
