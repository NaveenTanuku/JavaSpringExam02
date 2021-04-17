/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author S542000
 */
public class Movie {
    private String name;
    private double timeRecording;
    private MovieGenre movieGenre;

    public Movie(String name, double timeRecording, MovieGenre movieGenre) {
        this.name = name;
        this.timeRecording = timeRecording;
        this.movieGenre = movieGenre;
    }

    public String getName() {
        return name;
    }

    public double getTimeRecording() {
        return timeRecording;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setTimeRecording(double timeRecording) {
        this.timeRecording = timeRecording;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

    @Override
    public String toString() {
        return "Movie{" + "name=" + name + ", timeRecording=" + timeRecording + ", movieGenre=" + movieGenre.toString() + '}';
    }
    
    
}
