import java.util.Arrays;

public class ServicoDeCobranca {

    void pagar(Fatura fatura, String... emailsCobranca) {
//        System.out.println(Arrays.toString(emailsCobranca));

        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n",
                fatura.numero, fatura.valorTotal);

        for (String email : emailsCobranca) {
            System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
        }
    }

}
