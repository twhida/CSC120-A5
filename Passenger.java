
public class Passenger {
    
    /**
     * method for board car
     * @param c Car
     * passenger added to (this) car if able, otherwise catch exception and print message
     */
    public void boardCar(Car c){
    try {
         c.addPassenger(this);
    } catch (Exception e) {
        System.out.println("This car is full!");
    }
    }

    /**
     * method for get off car
     * @param c Car
     * passenger removed from (this) car if able, otherwise catch exception and print message
     */
    public void getOffCar(Car c){
    try { 
        c.removePassenger(this);
    } catch (Exception e) {
        System.out.println("This passenger is not in this car.");
    }
    

    }
}


