package org.jf.uni.week2;

public class Person {

    private final Location location;
    private final String personMame;

    public Person(Location location, String personMame) {
        this.location = location;
        this.personMame = personMame;
    }

    public Location getLocation() {
        return location;
    }

    public String getPersonMame() {
        return personMame;
    }

    public double distanceFrom(Person other) {
        return this.location.distance(other.getLocation());
    }

}
