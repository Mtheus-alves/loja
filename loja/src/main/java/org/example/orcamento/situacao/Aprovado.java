package org.example.orcamento.situacao;

import org.example.orcamento.Orcamento;
import org.w3c.dom.DOMException;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orc) {
        return orc.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void finalizar(Orcamento orc) {
        orc.setSituacao(new Finalizado());
    }


}
