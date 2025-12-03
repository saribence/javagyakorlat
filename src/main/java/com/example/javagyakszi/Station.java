
package com.example.javagyakszi;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int station_id;
    @Column(name = "station_name")
    @Size(min = 5, max = 100, message = "A név hossza 5 és 100 karakter között legyen!")
    private String stationName;
    @Column(name = "max")
    private int max;
    @Column(name = "lat")
    private double lat;
    @Column(name = "lon")
    private double lon;


    public Station(int station_id, String station_name, int max, double lat, double lon) {
        this.station_id = station_id;
        this.stationName = station_name;
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

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
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
                ", station_name='" + stationName + '\'' +
                ", max=" + max +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
