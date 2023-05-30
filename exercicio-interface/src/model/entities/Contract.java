package model.entities;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Contract {
    private Integer number;
    private Date date;
    private Double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }
    
    public Integer getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void addInstallments(Installment installment) {
        installments.add(installment);
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
