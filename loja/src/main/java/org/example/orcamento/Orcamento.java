package org.example.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private final BigDecimal valor;
    private final int qtdItens;

    public Orcamento(BigDecimal valor, int qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
    }

    public BigDecimal getValor() {
        return valor;
    }
    public int getQtdItens() {return qtdItens;}
}
