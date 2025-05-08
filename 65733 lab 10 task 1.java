
interface Display {
    void show();
}


interface Aircraft extends Display {
    String aircraftType();
    int calculateCapacity();
}


class PassengerJet implements Aircraft {
    private int rows;
    private int seatsPerRow;

    public PassengerJet(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }

  
    public String aircraftType() {
        return "Passenger Jet";
    }


    public int calculateCapacity() {
        return rows * seatsPerRow;
    }

    
    public void show() {
        System.out.println("Type: " + aircraftType());
        System.out.println("Passenger Capacity: " + calculateCapacity());
    }
}


class CargoPlane implements Aircraft {
    private double length; // in meters
    private double width;  // in meters

    public CargoPlane(double length, double width) {
        this.length = length;
        this.width = width;
    }

 
    public String aircraftType() {
        return "Cargo Plane";
    }


    public int calculateCapacity() {
     
        return (int) (length * width / 2);
    }


    public void show() {
        System.out.println("Type: " + aircraftType());
        System.out.println("Estimated Equivalent Passenger Capacity: " + calculateCapacity());
    }
}


class PrivateJet implements Aircraft {
    private int seats;

    public PrivateJet(int seats) {
        this.seats = seats;
    }


    public String aircraftType() {
        return "Private Jet";
    }

    public int calculateCapacity() {
        return seats;
    }

 
    public void show() {
        System.out.println("Type: " + aircraftType());
        System.out.println("Luxury Seat Capacity: " + calculateCapacity());
    }
}
 
public class AirlineManagement {
    public static void main(String[] args) {
        Aircraft passengerJet = new PassengerJet(30, 6);
        Aircraft cargoPlane = new CargoPlane(20.0, 4.0);
        Aircraft privateJet = new PrivateJet(12);

        System.out.println("=== Passenger Jet ===");
        passengerJet.show();

        System.out.println("\n=== Cargo Plane ===");
        cargoPlane.show();

        System.out.println("\n=== Private Jet ===");
        privateJet.show();
    }
}
