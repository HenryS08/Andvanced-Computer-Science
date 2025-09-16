public class Student {

    private String name;
    private String id;
    private int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    Student(String name) {
        this.name = name;
        grade = 10;
        this.id = generateId();
    }

    public String generateId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}

