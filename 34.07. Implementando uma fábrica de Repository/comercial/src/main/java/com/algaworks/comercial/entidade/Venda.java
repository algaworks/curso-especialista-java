package com.algaworks.comercial.entidade;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Venda {

    private Long id;
    private String nomeCliente;
    private BigDecimal valorTotal;
    private LocalDate dataPagamento;

    public Venda(String nomeCliente, BigDecimal valorTotal, LocalDate dataPagamento) {
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
        this.dataPagamento = dataPagamento;
    }

    public Venda(Long id, String nomeCliente, BigDecimal valorTotal, LocalDate dataPagamento) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
        this.dataPagamento = dataPagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return id.equals(venda.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", valorTotal=" + valorTotal +
                ", dataPagamento=" + dataPagamento +
                '}';
    }

}
