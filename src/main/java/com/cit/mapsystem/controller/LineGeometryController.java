package com.cit.mapsystem.controller;

import com.cit.mapsystem.model.LineGeometry;
import com.cit.mapsystem.service.LineGeometryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/line")
@CrossOrigin
public class LineGeometryController {

    @Autowired
    private LineGeometryService service;

    @PostMapping("/add")
    public String add(@RequestBody LineGeometry geometry) {
        service.saveGeometry(geometry);
        return "New geometry has been added";
    }

    @GetMapping("/getAll")
    public List<LineGeometry> get() {
        return service.loadGeometries();
    }
}
