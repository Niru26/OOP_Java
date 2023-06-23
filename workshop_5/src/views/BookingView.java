package views;

import models.Table;
import presenters.View;
import presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {
    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void printReservationTableResult(int reservationNumber) {
        System.out.printf("Table booked. Reservation number: #%d\n", reservationNumber);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table:
             tables) {
            System.out.println(table);
        }
    }
    public void reservationTable(Date reservationDate, int tableNumber, String clientName) {
        observer.onReservationTable(reservationDate, tableNumber, clientName);
    }
}
