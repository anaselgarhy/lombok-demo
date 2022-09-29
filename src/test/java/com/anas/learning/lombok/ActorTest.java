package com.anas.learning.lombok;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 29/09/2022
 */
class ActorTest {
    private Actor actor;

    @BeforeEach
    void setUp() {
        actor = new Actor();
        actor.setName("Tim Robbins");
        actor.setAge((byte) 59);
        actor.setMovies(List.of("The Shawshank Redemption", "The Green Mile", "The Player", "Bull Durham", "Bob Roberts",
                "The Hudsucker Proxy", "The Shawshank Redemption", "The Shawshank Redemption", "The Shawshank Redemption"));
    }

    @Test
    void getName() {
        assertNotNull(actor);
        assertEquals("Tim Robbins", actor.getName());
    }

    @Test
    void getAge() {
        assertNotNull(actor);
        assertEquals(59, actor.getAge());
    }

    @Test
    void getMovies() {
        assertNotNull(actor);
        assertEquals(List.of("The Shawshank Redemption", "The Green Mile", "The Player", "Bull Durham", "Bob Roberts",
                "The Hudsucker Proxy", "The Shawshank Redemption", "The Shawshank Redemption", "The Shawshank Redemption"),
                actor.getMovies());
    }

    @Test
    void setName() {
        actor.setName("Morgan Freeman");
        assertNotNull(actor);
        assertEquals("Morgan Freeman", actor.getName());
    }

    @Test
    void setAge() {
        actor.setAge((byte) 83);
        assertNotNull(actor);
        assertEquals(83, actor.getAge());
    }

    @Test
    void setMovies() {
        actor.setMovies(List.of("The Shawshank Redemption", "The Shawshank Redemption", "The Shawshank Redemption"));
        assertNotNull(actor);
        assertEquals(List.of("The Shawshank Redemption", "The Shawshank Redemption", "The Shawshank Redemption"),
                actor.getMovies());
    }

    @Test
    void testEquals() {
        val actor1 = new Actor("Tim Robbins", (byte) 59,
                List.of("The Shawshank Redemption", "The Green Mile", "The Player", "Bull Durham",
                        "Bob Roberts", "The Hudsucker Proxy", "The Shawshank Redemption",
                        "The Shawshank Redemption", "The Shawshank Redemption"));
        val actor2 = new Actor("Tim Robbins", (byte) 59,
                List.of("The Shawshank Redemption", "The Green Mile", "The Player", "Bull Durham",
                        "Bob Roberts", "The Hudsucker Proxy", "The Shawshank Redemption",
                        "The Shawshank Redemption", "The Shawshank Redemption"));

        assertNotNull(actor1);
        assertNotNull(actor2);
        assertEquals(actor1, actor2);
    }

    @Test
    void canEqual() {
        val actor1 = new Actor("Tim Robbins", (byte) 59,
                List.of("The Shawshank Redemption", "The Green Mile", "The Player", "Bull Durham",
                        "Bob Roberts", "The Hudsucker Proxy", "The Shawshank Redemption",
                        "The Shawshank Redemption", "The Shawshank Redemption"));
        val actor2 = new Actor("Tim Robbins", (byte) 59,
                List.of("The Shawshank Redemption", "The Green Mile", "The Player", "Bull Durham",
                        "Bob Roberts", "The Hudsucker Proxy", "The Shawshank Redemption",
                        "The Shawshank Redemption", "The Shawshank Redemption"));

        assertNotNull(actor1);
        assertNotNull(actor2);
        assertTrue(actor1.canEqual(actor2));
    }

    @Test
    void testHashCode() {
        val actor1 = new Actor("Tim Robbins", (byte) 59,
                List.of("The Shawshank Redemption", "The Green Mile", "The Player", "Bull Durham",
                        "Bob Roberts", "The Hudsucker Proxy", "The Shawshank Redemption",
                        "The Shawshank Redemption", "The Shawshank Redemption"));
        val actor2 = new Actor("Tim Robbins", (byte) 59,
                List.of("The Shawshank Redemption", "The Green Mile", "The Player", "Bull Durham",
                        "Bob Roberts", "The Hudsucker Proxy", "The Shawshank Redemption",
                        "The Shawshank Redemption", "The Shawshank Redemption"));

        assertNotNull(actor1);
        assertNotNull(actor2);
        assertEquals(actor1.hashCode(), actor2.hashCode());
    }

    @Test
    void testToString() {
        val actor1 = new Actor("Tim Robbins", (byte) 59,
                List.of("The Shawshank Redemption", "The Green Mile", "The Player", "Bull Durham",
                        "Bob Roberts", "The Hudsucker Proxy", "The Shawshank Redemption",
                        "The Shawshank Redemption", "The Shawshank Redemption"));
        val actor2 = new Actor("Tim Robbins", (byte) 59,
                List.of("The Shawshank Redemption", "The Green Mile", "The Player", "Bull Durham",
                        "Bob Roberts", "The Hudsucker Proxy", "The Shawshank Redemption",
                        "The Shawshank Redemption", "The Shawshank Redemption"));

        assertNotNull(actor1);
        assertNotNull(actor2);
        assertEquals(actor1.toString(), actor2.toString());
    }
}
