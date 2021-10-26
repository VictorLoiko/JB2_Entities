package com.epam.jb2.entities.hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Room {
    private int number;
    private RoomType type;
    private float pricePerNight;
    private boolean isReadyForExploitation;
    private List<Date> bookedDates = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return number == room.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
