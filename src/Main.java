public class Main {
    public static void main(String[] args) {
        int n = 100;
        CompanyRepo companyRepo = new CompanyRepo(n);

        Address address = new Address("Mickiewicza", 3, 2);
        Company company1 = new Company("Lufthansa", 1234567890, address);

        companyRepo.add(company1);
        Company company2 = new Company("Biedronka", 9994442299L, address);

        companyRepo.add(company2);
        Address address3 = new Address("Włókniarzy", 5, 1);
        Company company3 = new Company("Decathlon", 111232323, address3);
        companyRepo.add(company3);

        companyRepo.displayAll();
        System.out.println("----------------------poszukiwanie firmy o NIP = 111232323------------------------");
        Company company = companyRepo.findCompany(111232323);
        if (company == null) {
            System.out.println("Nie znaleziono firmy o podanym NIPI-e");
        } else {
            company.display();
        }
    }
}
