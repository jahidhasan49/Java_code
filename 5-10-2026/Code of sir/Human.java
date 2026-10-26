package bd.edu.bubt.inheritance;

public class Human extends Animal{
    private String color;
    private String gender;

    public Human(){
        super();
    }

    public Human(boolean isAlive, String color, String gender){
        // super(isAlive);
        super.isAlive = isAlive;
        this.color = color;
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //TODO: Override Animal's eat()
}
