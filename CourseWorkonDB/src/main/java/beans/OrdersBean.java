package beans;

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
    private double cost;

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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}