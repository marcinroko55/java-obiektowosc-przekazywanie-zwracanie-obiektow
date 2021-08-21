public class Main {
    public static void main(String[] args) {
        int n = 2;
        CompanyRepo companyRepo = new CompanyRepo(n);

        String name = "Lufthansa";
        String street = "Mickiewicza";
        Address address = new Address(street, 3, 2);
        Company c1 = new Company(name, 1234567890, address);

        companyRepo.add(c1);

        String name2 = "Biedronka";
        Company c2 = new Company(name2, 1234442299, address);

        companyRepo.add(c2);

        String name3 = "Decathlon";
        String street1 = "Włókniarzy";
        Address address3 = new Address(street1, 5, 1 );
        Company c3 = new Company(name3 , 111232323, address3);
        companyRepo.add(c3);

        companyRepo.displayAll();




    }
}
