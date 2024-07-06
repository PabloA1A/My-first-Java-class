package dev.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testPersonAttributes() {
        Person person = new Person("Pablo", "Abad", "123456789", 1988, "Spain", 'H');

        assertEquals("Pablo", person.getFirstName());
        assertEquals("Abad", person.getLastName());
        assertEquals("123456789", person.getIdNumber());
        assertEquals(1988, person.getBirthDate());
        assertEquals("Spain", person.getCountryOfBirth());
        assertEquals('H', person.getGender());
    }
}
