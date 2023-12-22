public class Engine {
    public FuelType fuelType;
    double currentFuel;
    double maxFuelLevel;

    /**
     * constructor for Engine
     * @param fuelType FuelType
     * @param currentFuel double
     * @param maxFuelLevel double
     */
    public Engine(FuelType fuelType, double currentFuel, double maxFuelLevel){
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuelLevel = 100.0;
    }

    /**
     * method for refuel
     * sets currentFuel equal to maxFuelLevel
     */
    public void refuel(){
        currentFuel = maxFuelLevel;
    }

    /**
     * method for go
     * subtracts 1 from currentFuel until it is 0, where it calls refuel
     */
    public void go(){
        while (currentFuel > 0){
            currentFuel -= 1;
        }
        refuel();
    }

    
}
