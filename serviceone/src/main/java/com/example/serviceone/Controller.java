package com.example.serviceone;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/serviceone")
public class Controller {

    private final ServiceImpl service;

    public Controller(ServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name) {
        return "Welcome " + name;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
    return new ResponseEntity<>(service.getAllMovie(), HttpStatus.OK);
    }

    @GetMapping("/restTemplate")
    public ResponseEntity<List<Movie>> getAllMovieUsingRestTemplate(){
        return new ResponseEntity<>(service.getAllMovieUsingRestTemplate(),HttpStatus.OK);
    }
}