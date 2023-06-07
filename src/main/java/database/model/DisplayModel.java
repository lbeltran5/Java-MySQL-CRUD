package database.model;

import java.math.*;

public class DisplayModel {
    private int displayId;
    private int phoneId;
    private BigDecimal size;
    private String resolution;

    public DisplayModel(int displayId, int phoneId, BigDecimal size, String resolution) {
        this.displayId = displayId;
        this.phoneId = phoneId;
        this.size = size;
        this.resolution = resolution;
    }

    public int getDisplayId() {
        return displayId;
    }

    public void setDisplayId(int displayId) {
        this.displayId = displayId;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
