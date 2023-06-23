package models;

import presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {
    private Collection<Table> tables;

    /**
     * Get all tables collection
     * @return
     */
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Tabel reservation method
     * @param reservationDate
     * @param tableNumber
     * @param clientName
     */
    public int reservationTable(Date reservationDate, int tableNumber, String clientName) {
        for (Table table:
             tables) {
            if (table.getTableNumber() == tableNumber) {
                Reservation reservation = new Reservation(reservationDate, clientName);
                table.getReservations().add(reservation);
                return reservation.getIdReserve();
            }
        }
        throw new RuntimeException("Incorrect table number. ");
    }
}
