package com.example.movieService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl {

    public List<Movie> getAllMovie() {
        return List.of(new Movie(1, "Jawan"), new Movie(2, "Pathaan"), new Movie(3, "Animal"));

    }

}
