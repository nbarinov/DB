package Beans;

public class OrdersBean {
    /**
     * ID заказов
     */
    private int orderID;
    /**
     * ID касира
     */
    private int workerID;
    /**
     * ! ! ! А Х Т У Н Г ! ! !
     * order_date
     * ДАТА ЗАКАЗА
     */

    /**
     * Сумма заказа
     */
    private short costNumeric;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    /**
     * ! ! ! А Х Т У Н Г ! ! !
     * order_date
     * ДАТА ЗАКАЗА
     */

    public short getCostNumeric() {
        return costNumeric;
    }

    public void setCostNumeric(short costNumeric) {
        this.costNumeric = costNumeric;
    }
}