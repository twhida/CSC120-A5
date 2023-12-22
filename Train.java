import java.util.*;

public class Train {
    static FuelType fuelType;
    double fuelCapacity;
    private final Engine engine = new Engine(fuelType, fuelCapacity, fuelCapacity);
    private ArrayList<Car> carsCurrentlyAttached;
    int nCars;
    int passengerCapacity;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.fuelType = fuelType;
        this.fuelCapacity = 30;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;
    }
    
    public Engine getEngine(){
        return this.engine;
    }

    public Car getCar(int i){
        return this.getCar(i);
    }

    public int getMaxCapacity(){
        return this.getMaxCapacity();
    }

    public int seatsRemaining(){
        return this.seatsRemaining();
    }

    public void printManifest(){
        if(carsCurrentlyAttached.size() == 0){
            System.out.println("No cars are attached to this train.");
        }
        else System.out.println("Passengers on board:" + this.carsCurrentlyAttached);
    }

    public static void main(String[] args){
        Engine engine = new Engine(fuelType, 100.0, 100.0);
       try {
           while (true) {
               engine.go();
           }
       } catch (Exception e) {
           System.err.println(e.getMessage()); // Out of fuel
       }
    }
    
}
