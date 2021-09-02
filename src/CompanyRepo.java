public class CompanyRepo {
    Company[] companies;
    int iterator = 0;

    CompanyRepo(int size) {
        companies = new Company[size];
    }

    void add(Company company) {
        if (iterator < companies.length) {
            companies[iterator] = company;
            iterator++;
        } else {
            System.out.println("Brak miejsca dla firmy");
            company.display();
        }
    }

    Company findCompany(long nip) {
        for (int i = 0; i < companies.length && companies[i] != null; i++) {
            if (companies[i].nip == nip) {
                return companies[i];
            }
        }
        return null;
    }

    void displayAll() {
        System.out.println("*********** wszystkie firmy ***********");
        for (int i = 0; i < companies.length && companies[i] != null; i++) {
            System.out.println("----------------- ");
            companies[i].display();
        }
    }
}
