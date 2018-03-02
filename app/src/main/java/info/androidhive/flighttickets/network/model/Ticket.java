package info.androidhive.flighttickets.network.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ravi on 02/03/18.
 */

public class Ticket {

    String from;
    String to;

    @SerializedName("flight_number")
    String flightNumber;

    String departure;
    String arrival;
    String duration;
    String instructions;

    @SerializedName("stops")
    int numberOfStops;

    Airline airline;

    Price price;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDuration() {
        return duration;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }

    public Airline getAirline() {
        return airline;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
