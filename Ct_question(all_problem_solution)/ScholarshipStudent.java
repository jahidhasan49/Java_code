package advance.programming;

public class ScholarshipStudent extends Student {
    private double tuitionFee;

    public ScholarshipStudent(String name, String studentId,
                              double marks, double tuitionFee) {
        super(name, studentId, marks);
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Marks: " + getMarks());
        System.out.println("Tuition Fee: " + tuitionFee);
    }

    public double calculateScholarship() {
        if (getMarks() >= 80) {
            return tuitionFee * 0.50;
        } else if (getMarks() >= 70) {

            return tuitionFee * 0.30;
        } else if (getMarks() >= 60) {
            return tuitionFee * 0.20;
        } else {
            return 0;
        }
    }
}