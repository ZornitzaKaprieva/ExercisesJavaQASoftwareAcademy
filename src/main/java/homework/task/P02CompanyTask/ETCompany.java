package homework.task.P02CompanyTask;

public class ETCompany extends Company implements Invoice {

    /*Да се напише клас Фирма-ЕТ, който да наследява класа Фирма и да има следните член променливи:
•	Име на собственика, учредил фирмата- тип string;
•	Първоначален капитал – тип double;
•	Актуален капитал – тип double;

За всички член променливи напишете get и set методи.

Класът Фирма-ЕТ трябва да има метод, който изчислява печалбата към днешна дата на фирмата.
Той трябва да бъде нестатичен, да не приема параметри,
и трябва да връща като резултат число double, което да бъде разликата между актуалния и първоначалния капитал на съответната фирма.
*/

    private String ownerName;
    private double initialCapital;
    private double currentCapital;

    public ETCompany(String companyName, String startDate, String bulstad, String ownerName, double initialCapital, double currentCapital) {
        super(companyName, startDate, bulstad);
        setOwnerName(ownerName);
        setInitialCapital(initialCapital);
        setCurrentCapital(currentCapital);

    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (!ownerName.trim().isEmpty()) {
            this.ownerName = ownerName;
        } else {
            System.out.println("Please input owner's name.");
        }
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        if (initialCapital > 0) {
            this.initialCapital = initialCapital;
        } else {
            System.out.println("Please input valid initial capital.");
        }
    }

    public double getCurrentCapital() {
        return currentCapital;
    }

    public void setCurrentCapital(double currentCapital) {
        if (currentCapital >= 0) {
            this.currentCapital = currentCapital;
        } else {
            System.out.println("Please input valid current capital.");
        }
    }

    private double calculateCompanyProfit (){
        return this.currentCapital - this.initialCapital;
    }

    public void printProfit (){
        System.out.println("Company profit is: " + this.calculateCompanyProfit());
    }

    public void printCompanyInfo (){
        System.out.printf("Company Info:\nCompany Name: %s;\nStart date: %s;\nBulstad: %s\n" +
                        "ET Info:\nOwner's Name: %s;\nInitial capital: %.2f;\nCurrent capital: %.2f\n",
                super.getCompanyName(), super.getStartDate(), super.getBulstad(),
                getOwnerName(), getInitialCapital(), getCurrentCapital());
    }


    @Override
    public void printDataInvoice() {
        System.out.printf("Invoice data:\nCompany name: %s;\nBulstad: %s;\nOwner name: %s.\n", super.getCompanyName(), super.getBulstad(), getOwnerName());
    }
}
