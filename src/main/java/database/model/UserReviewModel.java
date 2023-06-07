package database.model;

public class UserReviewModel {
    private int reviewId;
    private int phoneId;
    private int userId;
    private int rating;
    private String userComment;

    public UserReviewModel(int reviewId, int phoneId, int userId, int rating, String userComment) {
        this.reviewId = reviewId;
        this.phoneId = phoneId;
        this.userId = userId;
        this.rating = rating;
        this.userComment = userComment;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }
}
