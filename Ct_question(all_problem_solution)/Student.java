package advance.programming;

public class Student extends Person {
    private String studentId;
    private double marks;

    public Student(String name, String studentId, double marks) {
        super(name);
        this.studentId = studentId;
        this.marks = marks;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Marks: " + marks);
    }
}