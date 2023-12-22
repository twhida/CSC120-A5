import java.util.*;

public class Car {
    private ArrayList<Passenger> passengersOnBoard;
    private int maxCapacity;

    public Car(ArrayList<Passenger> passengersOnBoard, int maxCapacity){
        this.passengersOnBoard = passengersOnBoard;
        this.maxCapacity = 5;
    }

    public int getCapacity(){
        return this.passengersOnBoard.size();
    }

    public int seatsRemaining(){
        return this.maxCapacity - this.passengersOnBoard.size();
    }

    public void addPassenger(Passenger p){
        if(passengersOnBoard.size() >= maxCapacity){
            System.out.println("This car is at capacity");
        }
        else {
            this.passengersOnBoard.add(p);
        }
        
    }

    public void removePassenger(Passenger p){
        if(passengersOnBoard.contains(p)){
            this.passengersOnBoard.remove(p);
        }
        else {
        System.out.println("This passegner is not in this car, so cannot get off this car.");
        }

    }
    
    public void printManifest(){
        if(passengersOnBoard.size() == 0){
            System.out.println("This car is EMPTY.");
        }
        else System.out.println("Passengers on board:" + this.passengersOnBoard);
    }
     
        
}
    
    


    
