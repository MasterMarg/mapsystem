package com.cit.mapsystem.service;

import com.cit.mapsystem.model.CircleGeometry;

import java.util.List;

public interface CircleGeometryService {

    CircleGeometry saveCircle(CircleGeometry circle);

    List<CircleGeometry> loadCircles();
}
