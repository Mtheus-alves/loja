package org.example.pedido;

import java.math.BigDecimal;

public class GerarPedido {
    private String cliente;
    private BigDecimal valorOrc;
    private Integer qtdItens;

    public GerarPedido(String cliente, BigDecimal valorOrc, Integer qtdItens) {
        this.cliente = cliente;
        this.valorOrc = valorOrc;
        this.qtdItens = qtdItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrc() {
        return valorOrc;
    }

    public Integer getQtdItens() {
        return qtdItens;
    }

    public void executar(){

    }
}
