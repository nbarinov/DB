package Beans;

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

    /**
     * Сумма заказа
     */
    private short costNumeric;

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    /**
     * purchase_date
     *
     */

    /**
     * ID заказа
     */
    private int orderID;

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
