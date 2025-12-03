package com.example.javagyakszi;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface StationRepo extends CrudRepository<Station, Integer> {

    List<Station> findByStationName(String stationName);
}