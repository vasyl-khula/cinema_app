package com.geniusee.task.cinema.rest.v1;

import com.geniusee.task.cinema.entity.Movie;
import com.geniusee.task.cinema.rest.BaseResource;
import com.geniusee.task.cinema.service.MovieService;
import com.geniusee.task.cinema.util.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
@RequestMapping("movies")
public class MovieV1Resource extends BaseResource {

    private final MovieService movieService;
    private final Validator validator;

    @Autowired
    public MovieV1Resource(MovieService movieService, Validator validator){
        this.movieService = movieService;
        this.validator = validator;
    }

    @RequestMapping(value="id", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> getMovie(@PathVariable("id") UUID id){
        if(validator.isIdInvalid(id)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Movie movie = movieService.getMovie(id);
        if(movie == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }
}
