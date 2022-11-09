package com.cit.mapsystem.service;

import com.cit.mapsystem.model.LineGeometry;

import java.util.List;

public interface LineGeometryService {

    LineGeometry saveGeometry(LineGeometry geometry);

    List<LineGeometry> loadGeometries();
}
