
public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c){
    try {
         c.addPassenger(this);
    } catch (Exception e) {
        System.out.println("This car is full!");
    }
    }

    public void getOffCar(Car c){
    try { 
        c.removePassenger(this);
    } catch (Exception e) {
        System.out.println("This passenger is not in this car.");
    }
    

    }
}


