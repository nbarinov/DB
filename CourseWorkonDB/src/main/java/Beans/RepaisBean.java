package Beans;

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
     * Д А Т А   Н А Ч А Л А  Р Е М О Н Т А  А Х Т У Н Г ! ! !
     * ДОПИСАТЬ
     * !!!start_date!!!
     * и также
     * !!!end_date!!!
     */

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

    /**
     * Д А Т А   Н А Ч А Л А  Р Е М О Н Т А  А Х Т У Н Г ! ! !
     * ДОПИСАТЬ
     * !!!start_date!!!
     * и также
     * !!!end_date!!!
     */

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
