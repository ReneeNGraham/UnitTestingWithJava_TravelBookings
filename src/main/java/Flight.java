import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String time;
    private ArrayList<Passenger> passengers;


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String time) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.time = time;
        this.passengers = new ArrayList<Passenger>();

    }
    //add a passenger to the flight

    public int passengerListSize()
    {
        return this.passengers.size();
    }

    //check available capacity after adding a passenger to the flight

    //book a passenger onto the flight


    }

