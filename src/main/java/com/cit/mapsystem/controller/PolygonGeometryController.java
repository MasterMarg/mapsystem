package com.cit.mapsystem.controller;

import com.cit.mapsystem.model.PolygonGeometry;
import com.cit.mapsystem.service.PolygonGeometryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polygon")
@CrossOrigin
public class PolygonGeometryController {

    @Autowired
    private PolygonGeometryService service;

    @PostMapping("/add")
    public String add(@RequestBody PolygonGeometry geometry) {
        service.saveGeometry(geometry);
        return "New geometry has been added";
    }

    @GetMapping("/getAll")
    public List<PolygonGeometry> get() {
        return service.loadGeometries();
    }
}
