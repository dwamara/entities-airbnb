
package com.airbnb.listing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User__ {

    @SerializedName("first_name") @Expose private String firstName;
    @SerializedName("has_profile_pic") @Expose private Boolean hasProfilePic;
    @SerializedName("id") @Expose private Integer id;
    @SerializedName("picture_url") @Expose private String pictureUrl;
    @SerializedName("smart_name") @Expose private String smartName;
    @SerializedName("thumbnail_url") @Expose private String thumbnailUrl;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Boolean getHasProfilePic() {
        return hasProfilePic;
    }
    public void setHasProfilePic(Boolean hasProfilePic) {
        this.hasProfilePic = hasProfilePic;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getSmartName() {
        return smartName;
    }
    public void setSmartName(String smartName) {
        this.smartName = smartName;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

}
