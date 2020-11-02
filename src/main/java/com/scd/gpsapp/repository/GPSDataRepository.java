package com.scd.gpsapp.repository;

import com.scd.gpsapp.model.entity.GPSData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GPSDataRepository extends CrudRepository<GPSData,Long> {
}
