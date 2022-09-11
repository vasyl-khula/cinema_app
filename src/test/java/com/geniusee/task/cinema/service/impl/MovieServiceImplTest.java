package com.geniusee.task.cinema.service.impl;

import com.geniusee.task.cinema.entity.Movie;
import com.geniusee.task.cinema.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class MovieServiceImplTest {

    @Mock
    private MovieRepository movieRepository;

    @InjectMocks
    private MovieServiceImpl movieService;

    @Test
    void testGetMovie(){
        UUID id = new UUID(1L, 10L);
        when(movieRepository.findById(id)).thenReturn(Optional.of(new Movie()));
        assertNotNull(movieService.getMovie(id));
    }

    @Test
    void testGetMovieNotFound(){
        UUID id = new UUID(2L, 20L);
        when(movieRepository.findById(id)).thenReturn(Optional.empty());
        assertNull(movieService.getMovie(id));
    }

    //todo implement tests for remaining methods
}
