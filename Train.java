import java.util.*;

public class Train {
    static FuelType fuelType;
    double fuelCapacity;
    private final Engine engine = new Engine(fuelType, fuelCapacity, fuelCapacity);
    private ArrayList<Car> carsCurrentlyAttached;
    int nCars;
    int passengerCapacity;

    /**
     * constructor for train
     * @param fuelType FuelType declared above in a static way // unsure if I did this correctly
     * @param fuelCapacity double
     * @param nCars int
     * @param passengerCapacity int
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.fuelCapacity = 30;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;
    }
    
    /**
     * getter for engine
     * @return Train engine
     */
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * getter for i-th car
     * @param i (i-th car) of Train
     * @return the i-th car
     */
    public Car getCar(int i){
        return this.getCar(i);
    }

    /**
     * getter for Train max capacity
     * @return max capacity across all cars on train
     */
    public int getMaxCapacity(){
        return this.getMaxCapacity();
    }

    /**
     * getter for Train seats remaining
     * @return seats remaining across all cars on train
     */
    public int seatsRemaining(){
        return this.seatsRemaining();
    }

    /**
     * print manifest method for cars attached to the train
     * if size of ArrayList carsCurrentlyAttached is 0, print message, and otherwise print the ArrayList
     */
    public void printManifest(){
        if(carsCurrentlyAttached.size() == 0){
            System.out.println("No cars are attached to this train.");
        }
        else System.out.println("Cars attached to this train:" + this.carsCurrentlyAttached);
    }

    /**
     * main method to run train
     * @param args 
     * exception for when it is out of fuel, which will msot likely not print because when currentFuel is 0, the engine will refuel
     */
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
