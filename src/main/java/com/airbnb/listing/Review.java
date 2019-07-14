
package com.airbnb.listing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Review {

    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("listing_id")
    @Expose
    private Integer listingId;
    @SerializedName("reviewee_id")
    @Expose
    private Integer revieweeId;
    @SerializedName("reviewer")
    @Expose
    private Reviewer reviewer;
    @SerializedName("reviewer_id")
    @Expose
    private Integer reviewerId;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("user_flag")
    @Expose
    private Object userFlag;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getListingId() {
        return listingId;
    }

    public void setListingId(Integer listingId) {
        this.listingId = listingId;
    }

    public Integer getRevieweeId() {
        return revieweeId;
    }

    public void setRevieweeId(Integer revieweeId) {
        this.revieweeId = revieweeId;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    public Integer getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Integer reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Object getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Object userFlag) {
        this.userFlag = userFlag;
    }

}
