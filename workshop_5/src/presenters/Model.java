package presenters;

import models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();
    /**
     * Tabel reservation method
     * @param reservationDate
     * @param tableNumber
     * @param clientName
     */
    int reservationTable(Date reservationDate, int tableNumber, String clientName);
}
