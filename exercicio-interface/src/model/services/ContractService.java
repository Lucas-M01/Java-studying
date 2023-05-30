package model.services;

import java.util.Calendar;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

    private OnlinePaymentsService onlinePaymentsService;

    public ContractService(OnlinePaymentsService onlinePaymentsService) {
        this.onlinePaymentsService = onlinePaymentsService;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            double updatedQuota = basicQuota + onlinePaymentsService.interest(basicQuota, i);
            double fullQuota = updatedQuota + onlinePaymentsService.paymentFee(updatedQuota);
            Calendar date = Calendar.getInstance();
            date.setTime(contract.getDate());
            date.add(Calendar.MONTH, i);
            contract.addInstallments(new Installment(date.getTime(), fullQuota));
        }
    }
    
}
