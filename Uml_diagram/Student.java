package Uml_diagram;

public class Student {
    private int id;
    private String name;

    public Student(){
         this.id=0;
         this.name=" ";
    }

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
         this.name = name;
    }
    public void display() {
        System.out.println("Student id: " + getId());
        System.out.println("Student name: " + getName());
    }
}
