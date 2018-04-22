package Beans;

import java.time.LocalTime;

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
    private LocalTime departureTime;
    /**
     * Время прибытия
     */
    private LocalTime arrivalTime;
    /**
     * Время в пути
     */
    private LocalTime travellTime;
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

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalTime getTravellTime() {
        return travellTime;
    }

    public void setTravellTime(LocalTime travellTime) {
        this.travellTime = travellTime;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
