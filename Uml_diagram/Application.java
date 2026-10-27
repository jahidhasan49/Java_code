package Uml_diagram;

public class Application {
     public static void main(String[] args) {
          Student s1 = new Student(101, "Jahid");
          Teacher t1 = new Teacher("Quraishi", "Advance Programming");

          s1.display();

          t1.teach();
     }
}
