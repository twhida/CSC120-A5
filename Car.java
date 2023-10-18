import java.util.*;

public class Car {
    private ArrayList<Passenger> passengerOnBoard;
    private int maxCapacity;

    public Car(ArrayList passengerOnBoard, int maxCapacity){
        this.passengerOnBoard = passengerOnBoard;
        this.maxCapacity = maxCapacity;
    }


public void addPassenger(Passenger p){
    if(passengerOnBoard.size() >= maxCapacity){
        System.out.println("This car is at capacity");
    }
    else {
        this.passengerOnBoard.add(p);
    }
    
}


public void removePassenger(Passenger p){
    if(passengerOnBoard.contains(p)){
        this.passengerOnBoard.add(p);
    }
    else {
    System.out.println("This passegner is not in this car, so cannot get off this car.");
    }
    

    }

 //  public static void manifest(ArrayList<Passenger> args) {
 //   void printIt(ArrayList<Passenger> passengerOnBoard){
 //      for (Passenger string : passengerOnBoard){
 //          System.out.println(passengerOnBoard.getPassenger());
 //       }
        
    public static void passengerOnBoard(String[] args){
        ArrayList<Passenger> arr =  new ArrayList<Passenger>(5);

        System.out.println("Passengers on board: " + arr);
    }
    }


    
