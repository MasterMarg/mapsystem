package com.cit.mapsystem.controller;

import com.cit.mapsystem.model.CircleGeometry;
import com.cit.mapsystem.service.CircleGeometryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/circle")
@CrossOrigin
public class CircleGeometryController {
    @Autowired
    private CircleGeometryService circleService;

    @PostMapping("/add")
    public String add(@RequestBody CircleGeometry circle) {
        circleService.saveCircle(circle);
        return "New circle is added";
    }

    @GetMapping("/getAll")
    public List<CircleGeometry> get() {
        return circleService.loadCircles();
    }
}
