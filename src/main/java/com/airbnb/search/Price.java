
package com.airbnb.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("localized_explanation")
    @Expose
    private Object localizedExplanation;
    @SerializedName("localized_title")
    @Expose
    private String localizedTitle;
    @SerializedName("total")
    @Expose
    private Total total;
    @SerializedName("type")
    @Expose
    private String type;

    public Object getLocalizedExplanation() {
        return localizedExplanation;
    }

    public void setLocalizedExplanation(Object localizedExplanation) {
        this.localizedExplanation = localizedExplanation;
    }

    public String getLocalizedTitle() {
        return localizedTitle;
    }

    public void setLocalizedTitle(String localizedTitle) {
        this.localizedTitle = localizedTitle;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
