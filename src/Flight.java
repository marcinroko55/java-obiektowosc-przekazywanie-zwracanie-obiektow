public class Flight {
    int arrivalTime;
    int departureTime;
    Plane plane;

    public Flight(int arrivalTime, int departureTime, Plane plane) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.plane = plane;
    }

    void display() {
        System.out.println("Godzina przylotu: " + arrivalTime + "\nGodzina odlotu: " + departureTime + "\nNumer samolotu: " + plane.planeNumber);
    }
}

