public class Address {
    String street;
    int houseNumber;
    int flatNumber;

    Address(String street, int houseNumber, int flatNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }
    void display(){
        System.out.println("Street: " + street);
        System.out.println("House Number: " + houseNumber);
        System.out.println("Flat Number: " + flatNumber);
    }
}
