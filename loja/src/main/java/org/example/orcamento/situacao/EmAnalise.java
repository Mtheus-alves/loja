package org.example.orcamento.situacao;

import org.example.orcamento.Orcamento;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orc) {
        return orc.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(Orcamento orc) {
        orc.setSituacao(new Aprovado());
    }

    public void reprovar(@NotNull Orcamento orc) {
        orc.setSituacao(new Reprovado());
    }
}
