package Beans;

public class WaybillsBean {
    /**
     * ID путевого листа
     */
    private int waybillID;
    /**
     * ID автопредприятия
     */
    private int autocompanyID;
    /**
     * ID маршрута
     */
    private int routeID;
    /**
     * ID сотрудника
     */
    private int workerID;
    /**
     * ID автобуса
     */
    private int busID;

    /**
     * ! ! ! А Х Т У Н Г ! ! !
     *  ТУТ НАДО:
     *  ВРЕМЯ ОТБЫТИЯ
     *  ВРЕМЯ ПРИБЫТИЯ
     *  ДАТА ПРОХОЖДЕНИЯ МЕД ОСМОТРА
     */

    /**
     * Количество выделенного топлива
     */
    private short fuelAmount;

    public int getWaybillID() {
        return waybillID;
    }

    public void setWaybillID(int waybillID) {
        this.waybillID = waybillID;
    }

    public int getAutocompanyID() {
        return autocompanyID;
    }

    public void setAutocompanyID(int autocompanyID) {
        this.autocompanyID = autocompanyID;
    }

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    /**
     * ! ! ! АХТУНГ ! ! !
     * СЮДА ВСТАВИТЬ НАДО
     * ВРЕМЯ ОТБЫТИЯ
     * ВРЕМЯ ПРИБЫТИЯ
     * ДАТА ПРОХОЖДЕНИЯ МЕД ОСМОТРА
     * ...наверно
     */

    public short getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(short fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
}
