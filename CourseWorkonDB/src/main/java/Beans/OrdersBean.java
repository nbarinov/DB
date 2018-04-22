package Beans;

import java.sql.Date;

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
     * ДАТА ЗАКАЗА
     */
    private Date orderDate;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public short getCostNumeric() {
        return costNumeric;
    }

    public void setCostNumeric(short costNumeric) {
        this.costNumeric = costNumeric;
    }
}