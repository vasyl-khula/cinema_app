package com.geniusee.task.cinema.service;

import com.geniusee.task.cinema.entity.Movie;

import java.util.List;
import java.util.UUID;

public interface MovieService {

    Movie getMovie(UUID id);

    List<Movie> getAllMovies();

    Movie createMovie(Movie movie);

    Movie updateMovie(Movie movie);

    void deleteMovie(UUID id);
}
