package com.algaworks.contaspagar.servico;

import com.algaworks.pagamento.DocumentoPagavel;
import com.algaworks.pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {
        // Poderia ter outras regras de negócio aqui
        // como por exemplo registrar o pagamento no banco de dados,
        // enviar uma notificação por e-mail, etc

        metodoPagamento.pagar(documento);
    }

}
