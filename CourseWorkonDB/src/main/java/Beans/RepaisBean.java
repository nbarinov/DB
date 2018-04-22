package Beans;

import java.sql.Date;

public class RepaisBean {
    /**
     * ID ремонта
     */
    private int repairID;
    /**
     * ID поломки
     */
    private int breakageID;
    /**
     * Дата начала ремонта
     */
    private Date startDate;
    /**
     * Дата окончания ремонта
     */
    private Date endDate;
    /**
     * Имя мастера
     */
    private String repName;
    /**
     * Фамилия мастера
     */
    private String repSurname;
    /**
     * Отчество мастера
     */
    private String repFname;
    /**
     * Стоимость ремонта
     */
    private short repCost;

    public int getRepairID() {
        return repairID;
    }

    public void setRepairID(int repairID) {
        this.repairID = repairID;
    }

    public int getBreakageID() {
        return breakageID;
    }

    public void setBreakageID(int breakageID) {
        this.breakageID = breakageID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public String getRepSurname() {
        return repSurname;
    }

    public void setRepSurname(String repSurname) {
        this.repSurname = repSurname;
    }

    public String getRepFname() {
        return repFname;
    }

    public void setRepFname(String repFname) {
        this.repFname = repFname;
    }

    public short getRepCost() {
        return repCost;
    }

    public void setRepCost(short repCost) {
        this.repCost = repCost;
    }
}
