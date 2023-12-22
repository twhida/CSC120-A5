import java.util.*;

public class Train {
    private final Engine engine ;
    private ArrayList<Car> carsCurrentlyAttached;
    int nCars;
    int passengerCapacity;
    FuelType f;
    double fuelCapacity;

    public Train(FuelType f, double fuelCapacity, int nCars, int passengerCapacity){
        this.f = f;
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


    
}
