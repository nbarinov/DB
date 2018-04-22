package Beans;

public class RoutesBean {
    /**
     * ID маршрута
     */
    private int routeID;
    /**
     * Начальный пункт
     */
    private int idDepPoint;
    /**
     * Конечный пункт
     */
    private int idArrPoint;
    /**
     * Протяженность
     */
    private short Extension;

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public int getIdDepPoint() {
        return idDepPoint;
    }

    public void setIdDepPoint(int idDepPoint) {
        this.idDepPoint = idDepPoint;
    }

    public int getIdArrPoint() {
        return idArrPoint;
    }

    public void setIdArrPoint(int idArrPoint) {
        this.idArrPoint = idArrPoint;
    }

    public short getExtension() {
        return Extension;
    }

    public void setExtension(short Extension) {
        this.Extension = Extension;
    }
}
