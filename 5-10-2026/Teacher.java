package lab.task;

public class Teacher {
     private String teacher_name;
     private String teacher_id;

     public Teacher(){
         this.teacher_name=" ";
         this.teacher_id=" ";
     }

     public Teacher(String teacher_name, String teacher_id){
         this.teacher_name=teacher_name;
         this.teacher_id=teacher_id;
     }

     public String getTeacher_name(){
         return this.teacher_name;
     }

     public String getTeacher_id(){
         return this.teacher_id;
     }

     public void setTeacher_name(String teacher_name){
         this.teacher_name=teacher_name;
     }

     public void setTeacher_id(String teacher_id){
         this.teacher_id=teacher_id;
     }

     public void teach(Student student){
         System.out.println("Teacher teaches the student");
     }
}
