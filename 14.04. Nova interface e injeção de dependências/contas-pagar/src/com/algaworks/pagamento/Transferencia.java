package com.algaworks.pagamento;

public class Transferencia implements MetodoPagamento {

    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("Beneficiário não possui conta bancária");
        }

        System.out.printf("DEBUG: Efetuando transferência para %s no valor de %.2f para conta bancária %s%n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getContaBancaria());
    }

}
