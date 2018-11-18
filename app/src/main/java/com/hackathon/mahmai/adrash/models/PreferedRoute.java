package com.hackathon.mahmai.adrash.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PreferedRoute {
    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("dest_date")
    @Expose
    private String destDate;
    @SerializedName("truck_type")
    @Expose
    private String truckType;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("driverId")
    @Expose
    private String driverId;
    @SerializedName("truckId")
    @Expose
    private String truckId;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDestDate() {
        return destDate;
    }

    public void setDestDate(String destDate) {
        this.destDate = destDate;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverId() {
        return driverId;
    }
    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
    public String getTruckId() {
        return truckId;
    }
    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }
}
