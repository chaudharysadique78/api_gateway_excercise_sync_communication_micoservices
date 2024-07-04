package com.example.serviceone;


import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name = "movieService", url="http://localhost:8080/movie")
public interface FeignClient {


    @GetMapping()
    public List<Movie> getAllMovies();
    }



