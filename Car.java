import java.util.*;

public class Car {
    private ArrayList<Passenger> passengersOnBoard;
    private int maxCapacity;

    /**
     * constructor for Car
     * @param passengersOnBoard ArrayList
     * @param maxCapacity int
     * maxCapacity is set to 5, so passengersOnBoard will not be more than 5 at a time
     */
    public Car(ArrayList<Passenger> passengersOnBoard, int maxCapacity){
        this.passengersOnBoard = passengersOnBoard;
        this.maxCapacity = 5;
    }


    /**
     * getter for Capacity
     * @return int size of passengersOnBoard ArrayList
     */
    public int getCapacity(){
        return this.passengersOnBoard.size();
    }

    /**
     * getter for seats remaining
     * @return the max capacity (5) - the int size of passengersOnBoard ArrayList
     */
    public int seatsRemaining(){
        return this.maxCapacity - this.passengersOnBoard.size();
    }

    /**
     * method for adding a passenger
     * @param p instance of Passenger
     * if the car is at max capacity, it will print a message saying it is at capacity, but otherwise the Passenger p will be added
     */
    public void addPassenger(Passenger p){
        if(passengersOnBoard.size() >= maxCapacity){
            System.out.println("This car is at capacity");
        }
        else {
            this.passengersOnBoard.add(p);
        }
        
    }
    /**
     * method for removing a passenger
     * @param p
     * if the passenger is on board, remove p, and otherwise print message
     */
    public void removePassenger(Passenger p){
        if(passengersOnBoard.contains(p)){
            this.passengersOnBoard.remove(p);
        }
        else {
        System.out.println("Unable to remove a passenger who is not in this car.");
        }

    }
    
    /**
     * method for print manifest of passengers on board
     * if passengersOnBoard Arraylist Size = 0, print message
     */
    public void printManifest(){
        if(passengersOnBoard.size() == 0){
            System.out.println("This car is EMPTY.");
        }
        else System.out.println("Passengers on board:" + this.passengersOnBoard);
    }
     
        
}
    
    


    
