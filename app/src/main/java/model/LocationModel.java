package model;

import com.google.gson.annotations.SerializedName;

public class LocationModel {
    @SerializedName("nama")
    private String imageLocationName;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;
    public LocationModel(String imageLocationName, String latitude, String longitude ){
        this.imageLocationName = imageLocationName;
        this.latitude = latitude ;
        this.longitude = longitude;
    }
    public LocationModel(){

    }
    public String getImageLocationName(){return imageLocationName;}
    public void  setImageLocationName(String imageLocationName){
        this.imageLocationName = imageLocationName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
