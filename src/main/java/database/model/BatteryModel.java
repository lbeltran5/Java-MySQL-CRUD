package database.model;

public class BatteryModel {
    private int batteryId;
    private int phoneId;
    private int capacity;

    public BatteryModel(int batteryId, int phoneId, int capacity) {
        this.batteryId = batteryId;
        this.phoneId = phoneId;
        this.capacity = capacity;
    }

    public int getBatteryId() {
        return batteryId;
    }

    public void setBatteryId(int batteryId) {
        this.batteryId = batteryId;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
