
package com.airbnb.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SearchResponse {

    @SerializedName("search_results")
    @Expose
    private List<ResultItem> resultItems = new ArrayList<>();
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;

    public List<ResultItem> getResultItems() {
        return resultItems;
    }

    public void setResultItems(List<ResultItem> resultItems) {
        this.resultItems = resultItems;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

}
