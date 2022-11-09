package com.cit.mapsystem.service;

import com.cit.mapsystem.model.LineGeometry;
import com.cit.mapsystem.repository.LineGeometryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineGeometryServiceImpl implements LineGeometryService {

    @Autowired
    private LineGeometryRepository repository;

    @Override
    public LineGeometry saveGeometry(LineGeometry geometry) {
        return repository.save(geometry);
    }

    @Override
    public List<LineGeometry> loadGeometries() {
        return repository.findAll();
    }
}
