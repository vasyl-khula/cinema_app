package com.geniusee.task.cinema.service.impl;

import com.geniusee.task.cinema.entity.Movie;
import com.geniusee.task.cinema.repository.MovieRepository;
import com.geniusee.task.cinema.service.MovieService;
import com.geniusee.task.cinema.util.Validator;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Data
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie getMovie(UUID id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(Movie updatedMovie) {
        return movieRepository.save(updatedMovie);
    }

    @Override
    public void deleteMovie(UUID id) {
        movieRepository.deleteById(id);
    }

}
