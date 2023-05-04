package com.algaworks.pagamento;

import java.math.BigDecimal;

public final class Pix extends MetodoPagamento {

    private BigDecimal percentualDesconto;

    public Pix(BigDecimal tarifa, BigDecimal percentualDesconto) {
        super(tarifa);
        this.percentualDesconto = percentualDesconto;
    }

    public BigDecimal getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(BigDecimal percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

}
