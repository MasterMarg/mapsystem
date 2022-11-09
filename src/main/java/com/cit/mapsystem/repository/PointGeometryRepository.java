package com.cit.mapsystem.repository;

import com.cit.mapsystem.model.PointGeometry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointGeometryRepository extends JpaRepository<PointGeometry, Integer> {
}
