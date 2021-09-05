public class AirportApp {
    public static void main(String[] args) {
        int i = 5;
        FlightRepo companyRepo = new FlightRepo(i);

        Plane plane1 = new Plane(12345);
        Plane plane2 = new Plane(1234);
        Plane plane3 = new Plane(1235);
        Plane plane4 = new Plane(1245);
        Plane plane5 = new Plane(2345);

        Flight flight1 = new Flight(15, 14, plane1);
        Flight flight2 = new Flight(17, 12, plane2);
        Flight flight3 = new Flight(5, 2, plane3);
        Flight flight4 = new Flight(1, 22, plane4);
        Flight flight5 = new Flight(12, 22, plane5);

        companyRepo.add(flight1);
        companyRepo.add(flight2);
        companyRepo.add(flight3);
        companyRepo.add(flight4);
        companyRepo.add(flight5);
        companyRepo.displayAll();
    }
}
