package com.cit.mapsystem.service;

import com.cit.mapsystem.model.PolygonGeometry;
import com.cit.mapsystem.repository.PolygonGeometryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolygonGeometryServiceImpl implements PolygonGeometryService {

    @Autowired
    private PolygonGeometryRepository repository;

    @Override
    public PolygonGeometry saveGeometry(PolygonGeometry geometry) {
        return repository.save(geometry);
    }

    @Override
    public List<PolygonGeometry> loadGeometries() {
        return repository.findAll();
    }
}
