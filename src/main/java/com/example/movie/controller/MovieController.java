/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here

package com.example.movie.controller;

import com.example.movie.service.MovieJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.movie.model.Movie;

@RestController
public class MovieController {

    @Autowired
    private MovieJpaService employeeService;

    @GetMapping("/movies")
    public ArrayList<Movie> getMovies() {
        return employeeService.getMovies();
    }

    @GetMapping("/movies/{movieId}")
    public Movie getEmployeeById(@PathVariable("movieId") int movieId) {
        return employeeService.getMovieById(movieId);
    }

    @PostMapping("/movies")
    public Movie addEmployee(@RequestBody Movie movie) {
        return employeeService.addMovie(movie);
    }

    @PutMapping("/movies/{movieId}")
    public Movie updateEmployee(@PathVariable("movieId") int movieId, @RequestBody Movie movie) {
        return employeeService.updateMovie(movieId, movie);
    }

    @DeleteMapping("/movies/{movieId}")
    public void deleteMovie(@PathVariable int movieId) {
        employeeService.deleteMovie(movieId);
    }

}