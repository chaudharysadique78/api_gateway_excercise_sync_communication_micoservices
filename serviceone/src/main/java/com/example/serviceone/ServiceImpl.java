package com.example.serviceone;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ServiceImpl {


    private final FeignClient feignClient;
    private final RestTemplate restTemplate;

    public ServiceImpl(FeignClient feignClient, RestTemplate restTemplate) {
        this.feignClient = feignClient;
        this.restTemplate = restTemplate;
    }

    public List<Movie> getAllMovie() {
        return feignClient.getAllMovies();
    }

    public List<Movie> getAllMovieUsingRestTemplate() {
        Movie[] response = restTemplate.getForObject("http://localhost:8080/movie", Movie[].class);
        return Arrays.asList(response);
    }
}
