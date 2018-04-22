package Beans;

import java.sql.Time;

public class TimetablesBean {
    /**
     * ID расписания
     */
    private int timetableID;
    /**
     * ID маршрута
     */
    private int routeID;
    /**
     * Время отбытия
     */
    private Time departureTime;
    /**
     * Время прибытия
     */
    private Time arrivalTime;
    /**
     * Время в пути
     */
    private Time travellTime;
    /**
     * Периодичность
     */
    private String period;

    public int getTimetableID() {
        return timetableID;
    }

    public void setTimetableID(int timetableID) {
        this.timetableID = timetableID;
    }

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Time getTravellTime() {
        return travellTime;
    }

    public void setTravellTime(Time travellTime) {
        this.travellTime = travellTime;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
