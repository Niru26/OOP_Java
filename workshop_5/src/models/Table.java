package models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private static int counter;
    private final int tableNumber;
    private final Collection<Reservation> reservations = new ArrayList<>();

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    {
        tableNumber = ++counter;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    @Override
    public String toString() {
        return String.format("This is table number %s", tableNumber);
    }
}
