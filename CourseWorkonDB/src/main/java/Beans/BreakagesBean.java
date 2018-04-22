package Beans;

public class BreakagesBean {
    /**
     * ID поломки
     */
    private int breakageID;
    /**
     * ! ! ! А Х Т У Н Г ! ! !
     * ЗДЕСЬ ДОЛЖЕН БЫТЬ break_date
     */

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

    /**
     * ! ! ! А Х Т У Н Г ! ! !
     * ЗДЕСЬ ДОЛЖЕН БЫТЬ break_date
     */

    public String getBreakType() {
        return breakType;
    }

    public void setBreakType(String breakType) {
        this.breakType = breakType;
    }
}
