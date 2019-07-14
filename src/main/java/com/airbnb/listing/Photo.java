
package com.airbnb.listing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("picture")
    @Expose
    private String picture;
    @SerializedName("sort_order")
    @Expose
    private Integer sortOrder;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("large")
    @Expose
    private String large;
    @SerializedName("large_cover")
    @Expose
    private String largeCover;
    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("mini_square")
    @Expose
    private String miniSquare;
    @SerializedName("scrim_color")
    @Expose
    private String scrimColor;
    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("preview_encoded_png")
    @Expose
    private String previewEncodedPng;
    @SerializedName("x_large")
    @Expose
    private String xLarge;
    @SerializedName("x_large_cover")
    @Expose
    private String xLargeCover;
    @SerializedName("x_medium")
    @Expose
    private String xMedium;
    @SerializedName("x_small")
    @Expose
    private String xSmall;
    @SerializedName("xl_picture")
    @Expose
    private String xlPicture;
    @SerializedName("xx_large")
    @Expose
    private String xxLarge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getLargeCover() {
        return largeCover;
    }

    public void setLargeCover(String largeCover) {
        this.largeCover = largeCover;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getMiniSquare() {
        return miniSquare;
    }

    public void setMiniSquare(String miniSquare) {
        this.miniSquare = miniSquare;
    }

    public String getScrimColor() {
        return scrimColor;
    }

    public void setScrimColor(String scrimColor) {
        this.scrimColor = scrimColor;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getPreviewEncodedPng() {
        return previewEncodedPng;
    }

    public void setPreviewEncodedPng(String previewEncodedPng) {
        this.previewEncodedPng = previewEncodedPng;
    }

    public String getXLarge() {
        return xLarge;
    }

    public void setXLarge(String xLarge) {
        this.xLarge = xLarge;
    }

    public String getXLargeCover() {
        return xLargeCover;
    }

    public void setXLargeCover(String xLargeCover) {
        this.xLargeCover = xLargeCover;
    }

    public String getXMedium() {
        return xMedium;
    }

    public void setXMedium(String xMedium) {
        this.xMedium = xMedium;
    }

    public String getXSmall() {
        return xSmall;
    }

    public void setXSmall(String xSmall) {
        this.xSmall = xSmall;
    }

    public String getXlPicture() {
        return xlPicture;
    }

    public void setXlPicture(String xlPicture) {
        this.xlPicture = xlPicture;
    }

    public String getXxLarge() {
        return xxLarge;
    }

    public void setXxLarge(String xxLarge) {
        this.xxLarge = xxLarge;
    }

}
