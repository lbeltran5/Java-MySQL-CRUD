package database.model;

public class PhoneFeatureModel {
    private int phoneId;
    private int featureId;

    public PhoneFeatureModel(int phoneId, int featureId) {
        this.phoneId = phoneId;
        this.featureId = featureId;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }
}
