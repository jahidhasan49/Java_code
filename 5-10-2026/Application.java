package lab.task;

public class Application {
     public static void main(String[] args){
         Student student = new Student("Jahid", "20255103049");
         Teacher teacher = new Teacher("Nur Quraishi", "48");

         student.learn(teacher);
         teacher.teach(student);
     }
}
