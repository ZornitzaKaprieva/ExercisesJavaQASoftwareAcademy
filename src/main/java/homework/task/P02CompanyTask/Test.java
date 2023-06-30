package homework.task.P02CompanyTask;

public class Test {

    public static void main(String[] args) {

        Company company1 = new Company("My Company", "01.06.2016", "1234567890");

        ETCompany etCompany1 = new ETCompany("My Company", "01.06.2016", "1234567890", "Zornitza", 500.0, 800.0 );

        etCompany1.printCompanyInfo();
        System.out.println("..........");

        etCompany1.printProfit();
        System.out.println("..........");

        etCompany1.printDataInvoice();
        System.out.println("..........");
    }
}
