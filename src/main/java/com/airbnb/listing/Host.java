
package com.airbnb.listing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Host {

    @SerializedName("about")
    @Expose
    private String about;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("has_completed_ib_salmon_flow_v2")
    @Expose
    private Boolean hasCompletedIbSalmonFlowV2;
    @SerializedName("has_dismissed_ib_salmon_flow")
    @Expose
    private Boolean hasDismissedIbSalmonFlow;
    @SerializedName("has_dismissed_ib_salmon_flow_v2")
    @Expose
    private Boolean hasDismissedIbSalmonFlowV2;
    @SerializedName("has_profile_pic")
    @Expose
    private Boolean hasProfilePic;
    @SerializedName("ib_salmon_flow_data")
    @Expose
    private List<Object> ibSalmonFlowData = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("identity_verified")
    @Expose
    private Boolean identityVerified;
    @SerializedName("is_active_rtb_host")
    @Expose
    private Boolean isActiveRtbHost;
    @SerializedName("is_superhost")
    @Expose
    private Boolean isSuperhost;
    @SerializedName("languages")
    @Expose
    private List<Object> languages = null;
    @SerializedName("picture_url")
    @Expose
    private String pictureUrl;
    @SerializedName("reviewee_count")
    @Expose
    private Integer revieweeCount;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;

    public String getAbout() {
        return about;
    }
    public void setAbout(String about) {
        this.about = about;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Boolean getHasCompletedIbSalmonFlowV2() {
        return hasCompletedIbSalmonFlowV2;
    }
    public void setHasCompletedIbSalmonFlowV2(Boolean hasCompletedIbSalmonFlowV2) {
        this.hasCompletedIbSalmonFlowV2 = hasCompletedIbSalmonFlowV2;
    }

    public Boolean getHasDismissedIbSalmonFlow() {
        return hasDismissedIbSalmonFlow;
    }
    public void setHasDismissedIbSalmonFlow(Boolean hasDismissedIbSalmonFlow) {
        this.hasDismissedIbSalmonFlow = hasDismissedIbSalmonFlow;
    }

    public Boolean getHasDismissedIbSalmonFlowV2() {
        return hasDismissedIbSalmonFlowV2;
    }
    public void setHasDismissedIbSalmonFlowV2(Boolean hasDismissedIbSalmonFlowV2) {
        this.hasDismissedIbSalmonFlowV2 = hasDismissedIbSalmonFlowV2;
    }

    public Boolean getHasProfilePic() {
        return hasProfilePic;
    }
    public void setHasProfilePic(Boolean hasProfilePic) {
        this.hasProfilePic = hasProfilePic;
    }

    public List<Object> getIbSalmonFlowData() {
        return ibSalmonFlowData;
    }
    public void setIbSalmonFlowData(List<Object> ibSalmonFlowData) {
        this.ibSalmonFlowData = ibSalmonFlowData;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIdentityVerified() {
        return identityVerified;
    }
    public void setIdentityVerified(Boolean identityVerified) {
        this.identityVerified = identityVerified;
    }

    public Boolean getIsActiveRtbHost() {
        return isActiveRtbHost;
    }
    public void setIsActiveRtbHost(Boolean isActiveRtbHost) {
        this.isActiveRtbHost = isActiveRtbHost;
    }

    public Boolean getIsSuperhost() {
        return isSuperhost;
    }
    public void setIsSuperhost(Boolean isSuperhost) {
        this.isSuperhost = isSuperhost;
    }

    public List<Object> getLanguages() {
        return languages;
    }
    public void setLanguages(List<Object> languages) {
        this.languages = languages;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Integer getRevieweeCount() {
        return revieweeCount;
    }
    public void setRevieweeCount(Integer revieweeCount) {
        this.revieweeCount = revieweeCount;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

}