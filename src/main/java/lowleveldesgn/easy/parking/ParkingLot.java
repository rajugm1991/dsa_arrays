package lowleveldesgn.easy.parking;


import java.util.Date;
import java.util.List;

/**
 * Parking lot:
 *
 * It is an multi floor parking lot system
 *
 */
public class ParkingLot {

    List<ParkingFloor> listOfParkingFloors;
    boolean isParkingFull;
    int numberOfFloors;

    //
}

class ParkingFloor{

    List<ParkingSlot> parkingSlots;
    DisplayBoard displayBoard;
    int capacity;
    String floorNumber;

    public void createFloor(int numberOfSlots){
        capacity=numberOfSlots;
    }

    void assignSlot(Vehicle vehicle){

    }
    void removeSlot(String slotId){

    }
    List<ParkingSlot> getOccupiedSlots(){
        //filter with is is slotOccupied
        return parkingSlots;
    }
}

class ParkingSlot{

    String slotId;
    Vehicle vehicle;
    VehicleType vehicleType;
    boolean isSlotOccupied;
    ParkingSlotStatus parkingSlotStatus;

    void assignVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        isSlotOccupied=true;
        parkingSlotStatus=ParkingSlotStatus.OCCUPIED;
    }
    void unAssignVehicle(){
        isSlotOccupied=false;
        this.vehicle=null;
        parkingSlotStatus=ParkingSlotStatus.NOT_OCCUPIED;
    }

}

enum ParkingSlotStatus{
    NOT_OCCUPIED,OCCUPIED,MAINTENANCE;
}

enum VehicleType{
    COMPACT,SMALL,LARGE;
}
abstract class Vehicle{
    String regNum;
    String color;
    ParkingTicket parkingTicket;
}

class ParkingTicket{

    ParkingTicketStatus parkingTicketStatus;
    String ticketId;
    Date entryTime;
    Date exitTime;

}
enum ParkingTicketStatus{
    PAID,NOT_PAID,LOST_STOLEN;
}

class DisplayBoard{

    String numOfSlotOccupied;
    String numOfSlot;
}

