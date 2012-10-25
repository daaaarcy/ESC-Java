package bookings;

public class SeatReservationDemo {

    public static void main(String[] args) throws ReservationException {

        SeatReservationManager m = new SeatReservationManager();
        for (int i = 0; i < 8; i++){
        	Customer c = new Customer();
             	m.reserveNextFree(c);
	}
	System.out.println(m.toString());
    }
    
}
