package com.cit.mapsystem.repository;

import com.cit.mapsystem.model.CircleGeometry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircleGeometryRepository extends JpaRepository<CircleGeometry, Integer> {
}
