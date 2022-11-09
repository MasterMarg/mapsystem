package com.cit.mapsystem.service;

import com.cit.mapsystem.model.PointGeometry;

import java.util.List;

public interface PointGeometryService {

    PointGeometry saveGeometry(PointGeometry geometry);

    List<PointGeometry> loadGeometries();
}
