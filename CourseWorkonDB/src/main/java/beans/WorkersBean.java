package beans;

public class WorkersBean {
    /**
     * ID работника
     */
    private int workerId;
    /**
     * Фамилия работника
     */
    private String surname;
    /**
     * Имя работника
     */
    private String name;
    /**
     * Отчество работника
     */
    private String fathername;
    /**
     * Должность работника
     */
    private String postition;
    /**
     * Опытработника
     */
    private short experience;
    /**
     * Город проживания работника
     */
    private String city;
    /**
     * Улица проживания работника
     */
    private String street;
    /**
     * Номер квартиры проживания работника
     */
    private short roomNumber;
    /**
     * Телефонный номер работника
     */
    private String phoneNumber;

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getPostition() {
        return postition;
    }

    public void setPostition(String postition) {
        this.postition = postition;
    }

    public short getExperience() {
        return experience;
    }

    public void setExperience(short experience) {
        this.experience = experience;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public short getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(short roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
