package database.model;

import java.math.*;

public class CameraModel {
    private int cameraId;
    private int phoneId;
    private BigDecimal megapixels;

    public CameraModel(int cameraId, int phoneId, BigDecimal megapixels) {
        this.cameraId = cameraId;
        this.phoneId = phoneId;
        this.megapixels = megapixels;
    }

    public int getCameraId() {
        return cameraId;
    }

    public void setCameraId(int cameraId) {
        this.cameraId = cameraId;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public BigDecimal getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(BigDecimal megapixels) {
        this.megapixels = megapixels;
    }
}
