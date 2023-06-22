package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel {
    private Collection<Table> tables;
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
    public void reservationTable(Date reservationDate, int tableNumber, String clientName) {

    }
}
