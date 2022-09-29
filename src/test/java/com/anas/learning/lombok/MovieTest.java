package com.anas.learning.lombok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 29/09/2022
 */
class MovieTest {
    private Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie();
        movie.setName("The Shawshank Redemption");
        movie.setDescription("Two imprisoned");
        movie.setYear(1994);
        movie.setDirector("Frank Darabont");
        movie.setActors(new String[]{"Tim Robbins", "Morgan Freeman", "Bob Gunton", "William Sadler", "Clancy Brown",
                "Gil Bellows", "Mark Rolston", "James Whitmore", "Jeffrey DeMunn", "Larry Brandenburg", "Neil Giuntoli",
                "Brian Libby", "David Proval", "James Whitmore"});
        movie.setRating(9.3f);

        movie.setAct(new Actor[]{new Actor("Tim Robbins", (byte) 59,
                List.of("The Shawshank Redemption", "The Green Mile", "The Player", "Bull Durham", "Bob Roberts",
                "The Hudsucker Proxy", "The Shawshank Redemption", "The Shawshank Redemption", "The Shawshank Redemption"))});

        movie.name2("The Shawshank Redemption");

        movie.name3("The Shawshank Redemption").printNames();
    }

    @Test
    void getName() {
        assertNotNull(movie);
        assertEquals("The Shawshank Redemption", movie.getName());
    }

    @Test
    void getDescription() {
        assertNotNull(movie);
        assertEquals("Two imprisoned", movie.getDescription());
    }

    @Test
    void getYear() {
        assertNotNull(movie);
        assertEquals(1994, movie.getYear());
    }

    @Test
    void getDirector() {
        assertNotNull(movie);
        assertEquals("Frank Darabont", movie.getDirector());
    }

    @Test
    void getActors() {
        assertNotNull(movie);
        assertArrayEquals(new String[]{"Tim Robbins", "Morgan Freeman", "Bob Gunton", "William Sadler",
                "Clancy Brown", "Gil Bellows", "Mark Rolston", "James Whitmore", "Jeffrey DeMunn", "Larry Brandenburg",
                "Neil Giuntoli", "Brian Libby", "David Proval", "James Whitmore"}, movie.getActors());
    }

    @Test
    void getRating() {
        assertNotNull(movie);
        assertEquals(9.3f, movie.getRating());
    }

    @Test
    void setName() {
        assertNotNull(movie);
        movie.setName("The Godfather");
        assertEquals("The Godfather", movie.getName());
    }

    @Test
    void setDescription() {
        assertNotNull(movie);
        movie.setDescription("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");
        assertEquals("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
                movie.getDescription());
    }

    @Test
    void setYear() {
        assertNotNull(movie);
        movie.setYear(1972);
        assertEquals(1972, movie.getYear());
    }

    @Test
    void setDirector() {
        assertNotNull(movie);
        movie.setDirector("Francis Ford Coppola");
        assertEquals("Francis Ford Coppola", movie.getDirector());
    }

    @Test
    void setActors() {
        assertNotNull(movie);
        movie.setActors(new String[]{"Marlon Brando", "Al Pacino", "James Caan", "Richard S. Castellano", "Robert Duvall",
                "Sterling Hayden", "John Marley", "Richard Conte", "Diane Keaton", "Al Lettieri", "John Cazale", "Talia Shire",
                "Gianni Russo", "Abe Vigoda", "Rudy Bond", "Al Martino", "Gastone Moschin", "John Marley", "Richard Bright",
                "Richard Conte", "Al Lettieri", "John Cazale", "Talia Shire", "Gianni Russo", "Abe Vigoda", "Rudy Bond",
                "Al Martino", "Gastone Moschin", "John Marley", "Richard Bright", "Richard Conte", "Al Lettieri", "John Cazale",
                "Talia Shire", "Gianni Russo", "Abe Vigoda", "Rudy Bond", "Al Martino", "Gastone Moschin", "John Marley",
                "Richard Bright", "Richard Conte", "Al Lettieri", "John Cazale", "Talia Shire", "Gianni Russo", "Abe Vigoda",
                "Rudy Bond", "Al Martino", "Gastone Moschin", "John Marley", "Richard Bright", "Richard Conte", "Al Lettieri",
                "John Cazale", "Talia Shire", "Gianni Russo", "Abe Vigoda", "Rudy Bond", "Al Martino", "Gastone Moschin",
                "John Marley", "Richard Bright", "Richard Conte", "Al Lettieri", "John Cazale", "Talia Shire", "Gianni Russo",
                "Abe Vigoda", "Rudy Bond", "Al Martino", "Gastone Moschin", "John Marley", "Richard Bright", "Richard Conte",
                "Al Lettieri", "John Cazale", "Talia Shire", "Gianni Russo", "Abe Vigoda", "Rudy Bond", "Al Martino",
                "Gastone Moschin", "John Marley", "Richard Bright", "Richard Conte"});
        assertArrayEquals(new String[]{"Marlon Brando", "Al Pacino", "James Caan", "Richard S. Castellano", "Robert Duvall",
                "Sterling Hayden", "John Marley", "Richard Conte", "Diane Keaton", "Al Lettieri", "John Cazale", "Talia Shire",
                "Gianni Russo", "Abe Vigoda", "Rudy Bond", "Al Martino", "Gastone Moschin", "John Marley", "Richard Bright",
                "Richard Conte", "Al Lettieri", "John Cazale", "Talia Shire", "Gianni Russo", "Abe Vigoda", "Rudy Bond",
                "Al Martino", "Gastone Moschin", "John Marley", "Richard Bright", "Richard Conte", "Al Lettieri", "John Cazale",
                "Talia Shire", "Gianni Russo", "Abe Vigoda", "Rudy Bond", "Al Martino", "Gastone Moschin", "John Marley",
                "Richard Bright", "Richard Conte", "Al Lettieri", "John Cazale", "Talia Shire", "Gianni Russo", "Abe Vigoda",
                "Rudy Bond", "Al Martino", "Gastone Moschin", "John Marley", "Richard Bright", "Richard Conte", "Al Lettieri",
                "John Cazale", "Talia Shire", "Gianni Russo", "Abe Vigoda", "Rudy Bond", "Al Martino", "Gastone Moschin",
                "John Marley", "Richard Bright", "Richard Conte", "Al Lettieri", "John Cazale", "Talia Shire", "Gianni Russo",
                "Abe Vigoda", "Rudy Bond", "Al Martino", "Gastone Moschin", "John Marley", "Richard Bright", "Richard Conte",
                "Al Lettieri", "John Cazale", "Talia Shire", "Gianni Russo", "Abe Vigoda", "Rudy Bond", "Al Martino",
                "Gastone Moschin", "John Marley", "Richard Bright", "Richard Conte"}, movie.getActors());
    }

    @Test
    void setRating() {
        assertNotNull(movie);
        movie.setRating(9.2f);
        assertEquals(9.2f, movie.getRating());
    }
}
