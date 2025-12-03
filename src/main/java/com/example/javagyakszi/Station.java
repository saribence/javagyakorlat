
package com.example.javagyakszi;

public class Station {

    private int station_id;
    private String station_name;
    private int max;
    private double lat;
    private double lon;


    public Station(int station_id, String station_name, int max, double lat, double lon) {
        this.station_id = station_id;
        this.station_name = station_name;
        this.max = max;
        this.lat = lat;
        this.lon = lon;
    }

    public Station() {
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }


    @Override
    public String toString() {
        return "Station{" +
                "station_id=" + station_id +
                ", station_name='" + station_name + '\'' +
                ", max=" + max +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
