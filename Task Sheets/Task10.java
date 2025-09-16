class Student{
    private String firstName;
    private String lastName;
    public Student (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // Added method printFullName to print students' fullName
    public void printFullName(){
        System.out.println(this.firstName + " " + this.lastName);
    }
}

public class Task10 {
    public static void main(String[] args) {
        Student[] students = new Student[]{
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
        };

        for (Student student : students) {
            student.printFullName();
        }
    }
}
