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

    public String toString() {
        String details = name + " is a " + grade + " grade student. Their id is " + id;
        return details;
    }

    public boolean equals(Student other) {
        return this.name.equals(other.name) 
        && this.name.equals(other.id) && this.grade == (other.grade);
    }

    public String generateId() {
        this.id = ((int) ((Math.random() * 7) + 1) + "" + (int) ((Math.random() * 7) + 1) + "" 
            + (int) ((Math.random() * 7) + 1) + "-" + (int) (Math.random() * 9) 
            + (int) (Math.random() * 9) + (int) (Math.random() * 9) + (int) (Math.random() * 9));
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

