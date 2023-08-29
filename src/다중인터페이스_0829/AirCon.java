package 다중인터페이스_0829;

public interface AirCon {
    int MAX_TEMP = 30; // public final static
    int MIN_TEMP = 0;

    void airConOn();

    void airConOff();

    void setAirConTemp(int tmp);
}
