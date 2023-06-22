package models;

import java.util.Date;

public class Reservation {

    private static int counter;
    private final int idReserve;
    private Date date;
    private String name;

    public int getIdReserve() {
        return idReserve;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    {
        idReserve = ++counter;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }
}
