package com.cit.mapsystem.service;

import com.cit.mapsystem.model.PolygonGeometry;

import java.util.List;

public interface PolygonGeometryService {

    PolygonGeometry saveGeometry(PolygonGeometry geometry);

    List<PolygonGeometry> loadGeometries();
}
