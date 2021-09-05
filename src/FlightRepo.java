public class FlightRepo {
    Flight[] flights;
    int i = 0;

    FlightRepo(int size) {
        flights = new Flight[size];
    }

    void add(Flight flight) {
        if (i < flights.length) {
            flights[i] = flight;
            i++;
        } else {
            System.out.println("Osiągnięto maksymalną liczbę rejsów");
        }
    }

    void displayAll() {
        for (Flight flight : flights) {
            flight.display();
        }
    }
}
