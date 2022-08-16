package com.algaworks.pagamento;

public interface DocumentoPagavel {

    public abstract double getValorTotal();

    Beneficiario getBeneficiario();

}
