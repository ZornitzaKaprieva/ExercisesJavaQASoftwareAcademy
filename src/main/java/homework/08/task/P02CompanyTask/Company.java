package homework08Task.P02CompanyTask;

public class Company {
    /*Име на фирмата – тип string;
•	Дата на създаване на фирмата – тип string;
•	Булстат – уникален 10 знаков код включващ букви и цифри – тип string.

За всички член променливи напишете get и set методи, като за последния направете проверка за дължина на string-а в set-метода му(length = 10).
*/

    private String companyName;
    private String startDate;
    private String bulstad;


    public Company(String companyName, String startDate, String bulstad) {
        setCompanyName(companyName);
        setStartDate(startDate);
        setBulstad(bulstad);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (!companyName.trim().isEmpty()) {
            this.companyName = companyName;
        } else {
            System.out.println("ERROR: Input Company Name.");
        }
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        if (!startDate.trim().isEmpty()) {
            this.startDate = startDate;
        } else {
            System.out.println("ERROR: Input Start Date.");
        }

    }

    public String getBulstad() {
        return bulstad;
    }

    public void setBulstad(String bulstad) {
        if (bulstad.length() == 10) {
            this.bulstad = bulstad;
        } else {
            System.out.println("ERROR: Input valid Bulstad");
        }
    }

    public void printCompanyInfo (){
        System.out.printf("Company Info:\nCompany Name: %s;\nStart date: %s;\nBulstad: %s\n", getCompanyName(), getStartDate(), getBulstad());
    }
}
