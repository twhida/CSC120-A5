public class Engine {
    public FuelType fuelType;
    double currentFuel;
    double maxFuelLevel;

    public Engine(FuelType fuelType, double currentFuel, double maxFuelLevel){
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuelLevel = maxFuelLevel;
    }

    public Engine(FuelType fuelType2, Class<Double> class1) {
    }

    public void refuel(){
        currentFuel = maxFuelLevel;
    }

    public void go(){
        while (currentFuel > 0){
            currentFuel -= 1;
        }
        refuel();
    }

    
}
