package org.example.orcamento.situacao;

import org.example.orcamento.Orcamento;
import org.w3c.dom.DOMException;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orc){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orc) {
        System.out.println("Orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orc) {
        System.out.println("Orçamento não pode ser aprovado");
    }

    public void finalizar(Orcamento orc) {
        System.out.println("Orçamento não pode ser finalizado");
    }

}
