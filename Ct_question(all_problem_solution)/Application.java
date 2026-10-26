package advance.programming;

public class Application {
    public static void main(String[] args) {

        ScholarshipStudent s1 =
                new ScholarshipStudent("Rimon", "S101", 85, 50000);

        // Upcasting
        Person p1 = s1;

        // Dynamic Method Dispatch
        p1.displayInfo();
        //concrete(abstrate class)

        // Calculate Scholarship
        System.out.println("Scholarship Amount: "
                + s1.calculateScholarship());
    }
}
