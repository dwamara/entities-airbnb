
package com.airbnb.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ratio {

    @SerializedName("Entire home/apt")
    @Expose
    private Double entireHomeApt;
    @SerializedName("Private room")
    @Expose
    private Double privateRoom;
    @SerializedName("Shared room")
    @Expose
    private Double sharedRoom;

    public Double getEntireHomeApt() {
        return entireHomeApt;
    }

    public void setEntireHomeApt(Double entireHomeApt) {
        this.entireHomeApt = entireHomeApt;
    }

    public Double getPrivateRoom() {
        return privateRoom;
    }

    public void setPrivateRoom(Double privateRoom) {
        this.privateRoom = privateRoom;
    }

    public Double getSharedRoom() {
        return sharedRoom;
    }

    public void setSharedRoom(Double sharedRoom) {
        this.sharedRoom = sharedRoom;
    }

}
