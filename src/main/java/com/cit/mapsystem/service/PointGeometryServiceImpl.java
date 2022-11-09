package com.cit.mapsystem.service;

import com.cit.mapsystem.model.PointGeometry;
import com.cit.mapsystem.repository.PointGeometryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointGeometryServiceImpl implements PointGeometryService {

    @Autowired
    private PointGeometryRepository repository;

    @Override
    public PointGeometry saveGeometry(PointGeometry geometry) {
        return repository.save(geometry);
    }

    @Override
    public List<PointGeometry> loadGeometries() {
        return repository.findAll();
    }
}
