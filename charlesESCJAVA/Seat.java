package bookings;

public class Seat {

    public static final char MIN_ROW = 'A';
    public static final char MAX_ROW = 'G';
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 20;

    /*@ invariant MIN_ROW <= row && row <= MAX_ROW;
        invariant MIN_NUMBER <= number && number <= MAX_NUMBER;
     */
    private final char row;
    private final int number;

    //@ requires MIN_ROW <= row && row <= MAX_ROW
    //@ requires MIN_NUMBER <= number && number <= MAX_NUMBER
    public Seat(char row, int number) {
        this.row = row;
        this.number = number;
    }

    //@ ensures MIN_ROW <= \result && \result <= MAX_ROW
    public final char getRow() {
        return row;
    }

    //@ ensures MIN_NUMBER <= \result && \result <= MAX_NUMBER
    public final int getNumber() {
        return number;
    }

}
