package entities;

public class Company extends Person {
    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees){
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax(){
        return numberOfEmployees > 10 ? getAnualIncome() * 0.14 : getAnualIncome() * 0.16;
    }
}
