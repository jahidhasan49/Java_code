package bd.edu.bubt.cse;

public class Application {
     public static void main(String[] args){
         Driver driver1=new Driver("Akash",  "BR01");
         Driver driver2=new Driver( "Jahid",  "BR02");
         Driver driver3=new Driver( "Sami", "BR03");

         Engine engine1 = new Engine("Digel", 150);

         Car car1 = new Car("Toyata", 3, engine1);

         driver1.Driver(car1);
         driver2.Driver(car1);
         driver3.Driver(car1);
     }
}
