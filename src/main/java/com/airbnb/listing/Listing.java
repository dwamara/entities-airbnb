
package com.airbnb.listing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Listing {

    @SerializedName("listing") @Expose private Listing_ listing;
    @SerializedName("metadata") @Expose private Metadata metadata;

    public Listing_ getListing() {
        return listing;
    }
    public void setListing(Listing_ listing) {
        this.listing = listing;
    }

    public Metadata getMetadata() {
        return metadata;
    }
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
