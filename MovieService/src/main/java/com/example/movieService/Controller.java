package com.example.movieService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class Controller {

    private final MovieServiceImpl movieService;

    public Controller(MovieServiceImpl movieService) {
        this.movieService = movieService;
    }

    @GetMapping()
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity(movieService.getAllMovie(), HttpStatus.OK);
    }

}
