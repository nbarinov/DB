package Beans;

import java.sql.Date;
import java.time.LocalTime;

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
     * Время отбытия
     */
    private LocalTime departureTime;
    /**
     * Время прибытия
     */
    private LocalTime arrivalTime;
    /**
     * Дата мед осмотра
     */
    private Date medView;
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

    public Date getMedView() {
        return medView;
    }

    public void setMedView(Date medView) {
        this.medView = medView;
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
