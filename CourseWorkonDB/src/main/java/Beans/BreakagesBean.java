package Beans;

import java.sql.Date;

public class BreakagesBean {
    /**
     * ID поломки
     */
    private int breakageID;
    /**
     * Дата поломки
     */
    private Date breakDate;
    /**
     * Тип поломки
     */
    private String breakType;
    /**
     * ID автобуса
     */
    private int busID;

    public int getBreakageID() {
        return breakageID;
    }

    public void setBreakageID(int breakageID) {
        this.breakageID = breakageID;
    }

    public Date getBreakDate() {
        return breakDate;
    }

    public void setBreakDate(Date breakDate) {
        this.breakDate = breakDate;
    }

    public String getBreakType() {
        return breakType;
    }

    public void setBreakType(String breakType) {
        this.breakType = breakType;
    }

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }
}
