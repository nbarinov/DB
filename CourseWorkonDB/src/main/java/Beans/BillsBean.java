package Beans;

import java.sql.Date;

public class BillsBean {
    /**
     * Номер билета
     */
    private int billID;
    /**
     * ДАТА ПОКУПКИ
     */
    private Date purchaseDate;
    /**
     * Сумма заказа
     */
    private double cost;
    /**
     * ID заказа
     */
    private int orderID;

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
}
