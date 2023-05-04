package com.algaworks.pagamento;

import java.math.BigDecimal;

public final class CartaoDeCredito extends MetodoPagamento {

    private Integer maximoParcelas;

    public CartaoDeCredito(BigDecimal tarifa, Integer maximoParcelas) {
        super(tarifa);
        this.maximoParcelas = maximoParcelas;
    }

    public Integer getMaximoParcelas() {
        return maximoParcelas;
    }

    public void setMaximoParcelas(Integer maximoParcelas) {
        this.maximoParcelas = maximoParcelas;
    }

}
