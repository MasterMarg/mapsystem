package com.cit.mapsystem.repository;

import com.cit.mapsystem.model.PolygonGeometry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolygonGeometryRepository extends JpaRepository<PolygonGeometry, Integer> {
}
