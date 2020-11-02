package com.scd.gpsapp.service;

import com.scd.gpsapp.repository.GPSDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GPSDataService {
    private final GPSDataRepository gpsDataRepository;

    @Autowired
    public GPSDataService(GPSDataRepository gpsDataRepository) {
        this.gpsDataRepository = gpsDataRepository;
    }
}
