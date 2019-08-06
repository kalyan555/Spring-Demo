package com.demo.movie.dao;

import java.util.List;

import com.demo.movie.model.Movie;

public interface MovieDAO {

    Movie save(Movie movie);

    Movie update(long empId, Movie movie);

    List<Movie> findAll();

    Movie findById(long id);

    void deleteMovie(long id);
}
