package lab.task;

public class Student {
     private String student_name;
     private String student_id;

     public Student(){
          this.student_name=" ";
          this.student_id=" ";
     }

     public Student(String student_name, String student_id) {
          this.student_name = student_name;
          this.student_id = student_id;
     }

     public String getStudent_name() {
          return this.student_name;
     }

     public String getStudent_id(){
          return this.student_id;
     }

     public void setStudent_name(String student_name){
          this.student_name=student_name;
     }

     public void setStudent_id(String student_id){
          this.student_id=student_id;
     }

     public void learn(Teacher teacher){
          System.out.println("Student is learning many things");
     }
}
