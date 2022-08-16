package com.algaworks.loja;

import com.algaworks.loja.pagamento.CartaoCredito;
import com.algaworks.loja.pagamento.MetodoPagamento;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarItem(ItemCarrinho item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        for (ItemCarrinho item : itens) {
            valorTotal += item.getValor();
        }

        return valorTotal;
    }

    public void finalizar(MetodoPagamento metodoPagamento) {
        double valorTotal = calcularValorTotal();
        metodoPagamento.pagar(valorTotal);

        System.out.printf("Pedido finalizado: R$%.2f%n", valorTotal);
    }

}