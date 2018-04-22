package Beans;

public class RoutesHaltesBean {
    /**
     * ID маршрута
     */
    private short routeID;
    /**
     * ID остановки
     */
    private short haltID;

    public short getRouteID() {
        return routeID;
    }

    public void setRouteID(short routeID) {
        this.routeID = routeID;
    }

    public short getHaltID() {
        return haltID;
    }

    public void setHaltID(short haltID) {
        this.haltID = haltID;
    }
}
