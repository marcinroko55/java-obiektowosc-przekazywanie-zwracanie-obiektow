public class Company {
    //    co się jak nazywa, wszędzie!
    String name;
    long nip;
    Address address;

    Company(String name, long nip, Address address) {
        this.name = name;
        this.nip = nip;
        this.address = address;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("NIP: " + nip);

        address.display();
    }
}
