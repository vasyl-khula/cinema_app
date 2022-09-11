package com.geniusee.task.cinema.repository;

import com.geniusee.task.cinema.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MovieRepository extends JpaRepository<Movie, UUID> {
}
