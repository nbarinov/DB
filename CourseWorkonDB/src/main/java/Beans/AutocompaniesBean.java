package Beans;

public class AutocompaniesBean {
    /**
     * ID Автопредприятия
     */
    private int autocompanyID;
    /**
     * Название автопредприятия
     */
    private String title;
    /**
     * Номер договора
     */
    private short contactNumber;
    /**
     * Контактный телефон
     */
    private String phoneNumber;

    public int getAutocompanyID() {
        return autocompanyID;
    }

    public void setAutocompanyID(int autocompanyID) {
        this.autocompanyID = autocompanyID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(short contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
