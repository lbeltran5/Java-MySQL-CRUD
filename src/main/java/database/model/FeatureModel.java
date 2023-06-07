package database.model;

public class FeatureModel {
    private int featureId;
    private String featureName;

    public FeatureModel(int featureId, String featureName) {
        this.featureId = featureId;
        this.featureName = featureName;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }
}
