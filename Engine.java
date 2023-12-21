public class Engine {
    private FuelType f;
    double currentFuel;
    double maxFuelLevel;

    public Engine(FuelType f, double currentFuel, double maxFuelLevel){
        this.f = FuelType;
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

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }

}
