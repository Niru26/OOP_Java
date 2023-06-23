package presenters;

import models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver{
    private final Model tableModel;
    private final View bookingView;

    public BookingPresenter(Model tableModel, View bookingView) {
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }
    private Collection<Table> loadTables(){
        return tableModel.loadTables();
    }
    public void showTables() {
        bookingView.showTables(loadTables());
    }
    public void printReservationTableResult(int reservationId) {
        bookingView.printReservationTableResult(reservationId);
    }
    @Override
    public void onReservationTable(Date orderDate, int tableNumber, String clientName) {
        int reservationId = tableModel.reservationTable(orderDate, tableNumber, clientName);
        printReservationTableResult(reservationId);
    }
}
