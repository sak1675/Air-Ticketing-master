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
        String contact;
        String price;
        Search(){}

        Search(String name, String contact, String flightDetail, String fromTo, String departureDate, String airline, String flightClass, String Time, String flightId, String price){
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
    public void setName(String name) {
        this.name = name;
    }
   
    public String getContact(){
        return contact;  
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getFlightDetail(){
        return flightDetail;
    }
    public void setFlightDetail(String flightDetail) {
        this.flightDetail = flightDetail;
    }
    public String getFromTo(){
        return fromTo;
    }
    public void setFromTo(String fromTo) {
        this.fromTo = fromTo;
    }
    public String getDepartureDate(){
        return departureDate;
    }
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
    public String getAirline(){
        return airline;
    }
    public void setAirline(String airline) {
        this.airline = airline;
    }
    public String getFlightClass(){
        return flightClass;
    }
    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getFlightId(){
        return flightId;
    }
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
        
}
