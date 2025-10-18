package org.jf.uni.week2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class PersonTest {

    @Test
    void shouldCalculateDistanceBetweenTwoPersons() {
        Person p1 = new Person(new Location("Location-1", 5d, 6d), "Person One");
        Person p2 = new Person(new Location("Location-1", 2d, 2d), "Person Two");

        double distanceFrom = p1.distanceFrom(p2);

        assertThat("Incorrect distance calculated!", distanceFrom, equalTo(5d));
    }

}