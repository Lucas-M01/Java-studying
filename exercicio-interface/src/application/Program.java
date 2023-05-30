package application;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre os dados do contrato:");
        try {
            System.out.print("Numero: ");
            int numero = sc.nextInt();
            System.out.print("Data (dd/MM/yyyy): ");
            sc.nextLine();
            Date date = new Date(sdf.parse(sc.nextLine()).getTime());
            System.out.print("Valor do contrato: ");
            double valor = sc.nextDouble();
            System.out.print("Entre com o numero de parcelas: ");

            int parcelas = sc.nextInt();

            Contract contrato = new Contract(numero, date, valor);

            ContractService service = new ContractService(new PaypalService());

            service.processContract(contrato, parcelas);

            System.out.println("Parcelas:");
            
            for (int i = 0; i < contrato.getInstallments().size(); i++) {
                System.out.println(contrato.getInstallments().get(i));
            }

        }
         catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}