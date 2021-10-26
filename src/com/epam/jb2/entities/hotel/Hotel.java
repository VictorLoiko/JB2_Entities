package com.epam.jb2.entities.hotel;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Hotel {
    private String name;
    private boolean isOpen;
    private Set<Room> rooms = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return name.equals(hotel.name) && Objects.equals(rooms, hotel.rooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rooms);
    }
}
