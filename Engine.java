public class Engine {
    private FuelType f;
    double currentFuel;
    double maxFuelLevel;

    public Engine(FuelType f, double currentFuel, double maxFuelLevel){
        this.f = f;
        this.currentFuel = currentFuel;
        this.maxFuelLevel = maxFuelLevel;
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
