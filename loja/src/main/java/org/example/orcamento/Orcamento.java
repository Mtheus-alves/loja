package org.example.orcamento;

import org.example.orcamento.situacao.EmAnalise;
import org.example.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private final int qtdItens;
    private SituacaoOrcamento situacao;

    public BigDecimal getValor() {
        return valor;
    }
    public int getQtdItens() {return qtdItens;}


    public Orcamento(BigDecimal valor, int qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
        this.situacao = new EmAnalise();
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }
}
