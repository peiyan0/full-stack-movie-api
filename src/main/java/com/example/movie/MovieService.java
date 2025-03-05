package com.example.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // indicate this is a service
public class MovieService {
    @Autowired // initialize MovieRepository
    private MovieRepository repository; // inject MovieRepository
    public List<Movie> findAllMovies() {
        return repository.findAll(); // from mongo repository class
    }
    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return repository.findMovieByImdbId(imdbId);
    }
}
