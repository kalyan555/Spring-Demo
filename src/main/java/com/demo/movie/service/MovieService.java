package com.demo.movie.service;

import java.util.List;

import com.demo.movie.model.Movie;

public interface MovieService {
	
	   Movie saveMovie(Movie movie);

	   List<Movie> listAll();

	   Movie findById(long empId);

	   void deleteMovie(long empId);
}
