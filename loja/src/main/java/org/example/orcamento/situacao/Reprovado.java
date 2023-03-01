package org.example.orcamento.situacao;


import org.example.orcamento.Orcamento;
import org.example.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {
    public void finalizar(Orcamento orc){
        orc.setSituacao(new Finalizado());
    }
}
