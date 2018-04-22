package Beans;

import java.sql.Date;

public class BillsBean {
    /**
     * Номер билета
     */
    private int billID;

    /**
     * ! ! ! А Х Т У Н Г ! ! !
     * purchase_date
     * ДАТА ПОКУПКИ
     */
    private Date purchaseDate;
    /**
     * Сумма заказа
     */
    private short costNumeric;
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

    public short getCostNumeric() {
        return costNumeric;
    }

    public void setCostNumeric(short costNumeric) {
        this.costNumeric = costNumeric;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
}
