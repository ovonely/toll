package gn.dto;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Location {
    Point point;

    public static void meth() {

    }

    public double getLat() {
        return point.getLat();
    }

    public void setLat(double lat, boolean isTrust) {
        point.setLat(lat, isTrust);
    }

    public double getLon() {
        return point.getLon();
    }

    public void setLon(double lon, boolean isTrust) {
        point.setLon(lon, isTrust);
    }

    public String getAutoId() {
        return point.getAutoId();
    }

    public void setAutoId(String autoId) {
        point.setAutoId(autoId);
    }

    public String toJson() throws JsonProcessingException {
        return point.toJson();
    }

    public long getTime() {
        return point.getTime();
    }

    public void setTime(long time) {
        point.setTime(time);
    }
}
