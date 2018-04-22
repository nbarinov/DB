package beans;

public class OilsBean {
    /**
     * ID масла
     */
    private int oilID;
    /**
     * Марка масла
     */
    private String oilMark;
    /**
     * Сезон масла
     */
    private String season;

    public int getOilID() {
        return oilID;
    }

    public void setOilID(int oilID) {
        this.oilID = oilID;
    }

    public String getOilMark() {
        return oilMark;
    }

    public void setOilMark(String oilMark) {
        this.oilMark = oilMark;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
