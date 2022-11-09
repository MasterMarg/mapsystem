package com.cit.mapsystem.repository;

import com.cit.mapsystem.model.LineGeometry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineGeometryRepository extends JpaRepository<LineGeometry, Integer> {
}
