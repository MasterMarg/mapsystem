package com.cit.mapsystem.controller;

import com.cit.mapsystem.model.PointGeometry;
import com.cit.mapsystem.service.PointGeometryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/point")
@CrossOrigin
public class PointGeometryController {

    @Autowired
    private PointGeometryService service;

    @PostMapping("/add")
    public String add(@RequestBody PointGeometry geometry) {
        service.saveGeometry(geometry);
        return "New geometry has been added";
    }

    @GetMapping("/getAll")
    public List<PointGeometry> get() {
        return service.loadGeometries();
    }
}
