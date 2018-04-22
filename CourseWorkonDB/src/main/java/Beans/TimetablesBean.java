package Beans;

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
     * ! ! ! А Х Т У Н Г ! ! !
     *         departure time,
     *         arrival time,
     *         travell_time interval
     * ! ! ! А Х Т У Н Г ! ! !
     */

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

    /**
     * ! ! ! А Х Т У Н Г ! ! !
     *         departure time,
     *         arrival time,
     *         travell_time interval
     * ! ! ! А Х Т У Н Г ! ! !
     */

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
