package com.geniusee.task.cinema.rest.v1;

import com.geniusee.task.cinema.service.MovieService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class MovieV1ResourceTest {

    @Mock
    private MovieService movieService;

    @InjectMocks
    private MovieV1Resource movieV1Resource;


}
