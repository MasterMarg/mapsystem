package com.cit.mapsystem.service;

import com.cit.mapsystem.model.CircleGeometry;
import com.cit.mapsystem.repository.CircleGeometryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircleGeometryServiceImpl implements CircleGeometryService {

    @Autowired
    private CircleGeometryRepository circleRepository;

    @Override
    public CircleGeometry saveCircle(CircleGeometry circle) {
        return circleRepository.save(circle);
    }

    @Override
    public List<CircleGeometry> loadCircles() {
        return circleRepository.findAll();
    }
}
