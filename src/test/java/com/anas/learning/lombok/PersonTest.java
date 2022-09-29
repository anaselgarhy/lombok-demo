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
class PersonTest {
    private Person person;

    @BeforeEach
    void setUp() {
        person = Person.builder()
                .name("Anas Elgarhy")
                .email("anas.elgarhy.dev@gmail.com")
                .age(25)
                .address("Cairo, Egypt")
                .phone("+201000000000")
                .salary(1000.0)
                .build();
    }


    @Test
    void builder() {
        assertNotNull(person);
        assertEquals("Anas Elgarhy", person.getName());
        assertEquals("anas.elgarhy.dev@gmail.com", person.getEmail());
        assertEquals(25, person.getAge());
        assertEquals("Cairo, Egypt", person.getAddress());
        assertEquals("+201000000000", person.getPhone());
        assertEquals(1000.0, person.getSalary());

    }

    @Test
    void testToString() {
        assertNotNull(person);
        assertNotNull(person.toString());
    }
}
