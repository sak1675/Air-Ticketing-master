/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirTicketing;

/**
 *
 * @author Dell
 */
public class Search {
       String name,fromTo,departureDate,airline;
        String flightId="";
        String flightDetail="";
        String flightClass="";
        String time="";
        int contact;
        int price;
        Search(){}

        Search(String name, int contact, String flightDetail, String fromTo, String departureDate, String airline, String flightClass, String Time, String flightId, int price){
        this.name = name;
        this.contact = contact;
        this.flightDetail = flightDetail;
        this.fromTo = fromTo;
        this.departureDate = departureDate;
        this.airline = airline;
        this.flightClass = flightClass;
        this.time = time;
        this.flightId = flightId;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public int getContact(){
        return contact;
    }
    public String getFlightDetail(){
        return flightDetail;
    }
    public String getFromTo(){
        return fromTo;
    }
    public String getDepartureDate(){
        return departureDate;
    }
    public String getAirline(){
        return airline;
    }
    public String getFlightClass(){
        return flightClass;
    }
    public String getTime(){
        return time;
    }
    public String getFlightId(){
        return flightId;
    }
    public int getPrice(){
        return price;
    }
        
}
