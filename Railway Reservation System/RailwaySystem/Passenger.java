package RailwaySystem;

public class Passenger {

    private static int passengerId = 0;
    private int id;
    private String name;
    private int Age;
    private char preferrence;
    private int seatNumber;

    Passenger(String name, int Age, char preference) {
        this.id = ++passengerId;
        this.name = name;
        this.Age = Age;
        this.preferrence = preference;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        Passenger.passengerId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public char getPreference() {
        return preferrence;
    }

    public void setPreference(char preference) {
        this.preferrence = preference;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {

        return "Passenger ticket id : " + id + "\nPassenger name : " + name + "\nPassenger Age : " + Age +
                "\nPassenger preference : " + preferrence + "\nPassenger seatNumber : " + seatNumber;
    }

}
